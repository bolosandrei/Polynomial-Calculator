package model;
import java.util.regex.*;
import java.util.*;
import java.util.Map;
public class Polynom {
    // Key - Power - Int
    // Value - Coefficient - Double
    private HashMap<Integer, Double>poly;
    public Polynom(HashMap<Integer,Double> poly){
        this.poly=poly;
    }
    public HashMap<Integer,Double> getPoly() {
        return poly;
    }
    public Polynom(){
        this.poly=new HashMap<Integer,Double>();
    }
    public Polynom(String expr){
        Pattern pattern = Pattern.compile("([+-]?[^-+]+)");//sir de despartitori cu care se parseaza sirul initial
        Matcher matcher = pattern.matcher(expr);
        HashMap<Integer,Double>poly = new HashMap<Integer,Double>();
        while (matcher.find()) {
            String[] tokens = matcher.group().split("\\^");
            double coef = Double.parseDouble(tokens[0].substring(0, tokens[0].length()-1));//una bucata coeficient
            int exp = Integer.parseInt(tokens[1]);
            //System.out.println(coef);
            //System.out.println(exp);
            poly.put(exp,coef);
        }
        this.poly=poly;
    }
    @Override
    public String toString(){
        String shwrm="";//un string pe care il formez de la 0 cu tot ce trebuie sa contina
        for(Map.Entry<Integer, Double> entry: poly.entrySet()) {//ma duc cu un monom prin tot polinomul

            if(entry.getValue()>=0){
//                if(entry.getValue()==1){
//                    shwrm = "+"+"x"+shwrm;
//                }else if(entry.getKey()==0){
//                    shwrm = "+"+entry.getValue()+shwrm;
//                } else if(entry.getKey()==1){
//                    shwrm = "+"+entry.getValue()+"x"+shwrm;
//                }
//                else{
                    shwrm = "+"+entry.getValue()+"x^"+entry.getKey()+shwrm;//daca coeficientul e pozitiv, atunci afisez si un '+'
                //}
            }else{//daca e negativ, se afiseaza '-' automat

//                if(entry.getKey()==0){
//                    shwrm = entry.getValue()+shwrm;
//                } else if(entry.getKey()==1){
//                    shwrm = entry.getValue()+"x"+shwrm;
//                }
//                else{
                    shwrm = entry.getValue()+"x^"+entry.getKey()+shwrm;
                //}
            }
        }
        return shwrm;
    }
}
