package model;
import java.util.Map;
import java.util.TreeMap;

public class Operations {
    public static Polynom suma(Polynom a, Polynom b){
        Polynom rez= new Polynom(a.getPoly());
        TreeMap<Integer,Double> a1 = new TreeMap<Integer,Double>(a.getPoly());
        TreeMap<Integer,Double> b1 = new TreeMap<Integer,Double>(b.getPoly());
        int key = -1;
        for (Map.Entry<Integer, Double> entry2: b1.entrySet()) {// in caz ca polinomul b contine exponenti care nu se gasesc in a,
            rez.getPoly().put(entry2.getKey(), entry2.getValue());
        }
        // atunci nu ar avea cum sa verifice egalitatea dintre cei doi exponenti
            // si exponentii inexistenti nu ar mai fi adaugati la rezultat
            // ex: a = 2x^2+1
            //     b = x

        for (Map.Entry<Integer, Double> entry2: a1.entrySet()) {// in caz ca polinomul b contine exponenti care nu se gasesc in a,
            rez.getPoly().put(entry2.getKey(), entry2.getValue());
        }// precum merge-sort pe 2 liste de lungime diferita

        for (Map.Entry<Integer, Double> entry2: b1.entrySet()) {
            for (Map.Entry<Integer, Double> entry1: a1.entrySet()) {
                if (entry2.getKey().equals(entry1.getKey())) {
                    rez.getPoly().put(entry2.getKey(), entry1.getValue() + entry2.getValue());
                }
            }
            for(Map.Entry<Integer, Double> ello: rez.getPoly().entrySet()){
                if(ello.getValue() == 0)
                    key = ello.getKey();
            }
            rez.getPoly().remove(key);
        }
//        System.out.println("Rezultat: "+rez.toString());
        return rez;
    }
    public static Polynom diferenta(Polynom a, Polynom b) {
        Polynom rez = new Polynom(a.getPoly());
        TreeMap<Integer,Double> a1 = new TreeMap<Integer,Double>(a.getPoly());
        TreeMap<Integer,Double> b1 = new TreeMap<Integer,Double>(b.getPoly());
        int key = -1;
        for (Map.Entry<Integer, Double> entry2: b1.entrySet()) {
            rez.getPoly().put(entry2.getKey(), -entry2.getValue());
        }
        for (Map.Entry<Integer, Double> entry2: a1.entrySet()) {
            rez.getPoly().put(entry2.getKey(), -entry2.getValue());
        }
        for (Map.Entry<Integer, Double> entry2: b1.entrySet()) {
            for (Map.Entry<Integer, Double> entry1: a1.entrySet()) {
                if (entry2.getKey().equals(entry1.getKey())) {
                    rez.getPoly().put(entry2.getKey(), entry1.getValue() - entry2.getValue());
                }
            }
            for(Map.Entry<Integer, Double> ello: rez.getPoly().entrySet()){
                if(ello.getValue() == 0)
                    key = ello.getKey();
            }
            rez.getPoly().remove(key);
        }
//        System.out.println("Rezultat: "+rez.toString());
        return rez;
    }
    public static Polynom inmultirea(Polynom a, Polynom b) {
        Polynom rez = new Polynom();
        TreeMap<Integer,Double> a1 = new TreeMap<Integer,Double>(a.getPoly());
        TreeMap<Integer,Double> b1 = new TreeMap<Integer,Double>(b.getPoly());
        int key = -1;
        for (Map.Entry<Integer, Double> entry2: b1.entrySet()) {
            for (Map.Entry<Integer, Double> entry1: a1.entrySet()) {
                int newKey = entry1.getKey()+entry2.getKey();
                if(rez.getPoly().containsKey(newKey)){//Am verificat dacă exista ceva la keya nouă, și dacă exista, atunci ii dau replace cu cea veche plus cea noua
                    rez.getPoly().replace(newKey, rez.getPoly().get(entry1.getKey() + entry2.getKey()) + entry1.getValue() * entry2.getValue());
                }
                else {
                    rez.getPoly().put(entry1.getKey() + entry2.getKey(), entry1.getValue() * entry2.getValue());
                }
            }
            for(Map.Entry<Integer, Double> ello: rez.getPoly().entrySet()){
                if(ello.getValue() == 0)
                    key = ello.getKey();
            }
            rez.getPoly().remove(key);
        }
//        System.out.println("Rezultat: "+rez.toString());
        return rez;
    }
    /*public static Poliyom impartirea(Polynom p) {

    }*/
    public static Polynom derivarea(Polynom a) {
        Polynom rez = new Polynom();
        TreeMap<Integer,Double> a1 = new TreeMap<Integer,Double>(a.getPoly());
        for (Map.Entry<Integer, Double> entry: a1.entrySet()) {
            if(entry.getKey()>=2){
                rez.getPoly().put(entry.getKey()-1, entry.getValue() * entry.getKey());
            }
            else {
                rez.getPoly().put(0,entry.getValue());
            }
        }
//        System.out.println("Rezultat: "+rez.toString());
        return rez;
    }
    public static Polynom integrarea(Polynom a) {
        Polynom rez = new Polynom();
        TreeMap<Integer,Double> a1 = new TreeMap<Integer,Double>(a.getPoly());
        for (Map.Entry<Integer, Double> entry: a1.entrySet()) {
                rez.getPoly().put(entry.getKey() + 1, entry.getValue() / (entry.getKey() + 1));
        }
//        System.out.println("Rezultat: "+rez.toString());
        return rez;
    }
}
