package controller;
import model.Operations;
import model.Polynom;
import view.View;
import java.awt.event.*;

public class Controller {
    private static View view1;
    public Controller(View viewParam) {
        view1 = viewParam;
        view1.sumaListener(new sumaListener());
        view1.difListener(new difListener());
        view1.inmListener(new inmListener());
        view1.impListener(new impListener());
        view1.derivListener(new derivListener());
        view1.integListener(new integListener());
    }
    static class sumaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza +");
            String a = view1.getField1().getText();
            //System.out.println(a);
            Polynom poly1 = new Polynom(a);
            String b = view1.getField2().getText();
            Polynom poly2 = new Polynom(b);
            view1.getField3().setText(Operations.suma(poly1, poly2).toString());
//            System.out.println(Operations.suma(poly1, poly2).toString());
        }
    }
    static class difListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza -");
            String a = view1.getField1().getText();
            Polynom poly1 = new Polynom(a);
            String b = view1.getField2().getText();
            Polynom poly2 = new Polynom(b);
            view1.getField3().setText(Operations.diferenta(poly1, poly2).toString());
        }
    }
    static class inmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza *");
            String a = view1.getField1().getText();
            Polynom poly1 = new Polynom(a);
            String b = view1.getField2().getText();
            Polynom poly2 = new Polynom(b);
            view1.getField3().setText(Operations.inmultirea(poly1, poly2).toString());
        }
    }
    static class impListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza / ... nefinalizat");
        }
    }
    static class derivListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza ∂");
            //System.out.println(String.format("%d",8706%256));
            String a = view1.getField1().getText();
            Polynom poly1 = new Polynom(a);
            view1.getField3().setText(Operations.derivarea(poly1).toString());
        }
    }
    static class integListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se efectueaza ∫");//incomplet
            String a = view1.getField1().getText();
            Polynom poly1 = new Polynom(a);
            view1.getField3().setText(Operations.integrarea(poly1).toString());
        }
    }
}