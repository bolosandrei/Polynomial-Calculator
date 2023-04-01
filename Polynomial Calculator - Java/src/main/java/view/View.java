package view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class View extends JFrame {
    JFrame frame = new JFrame("Calculator Polinoame");//fereastra
    JPanel p1 = new JPanel();
    JLabel label1 = new JLabel("Calculator Polinoame");//panelul p1 e format doar dintr-un sir de caractere

    JPanel p2 = new JPanel();//pannel 2 contine 3 panneluri care sunt formate la randul lor dintr-un JLabel si un JTextField
    JPanel p21 = new JPanel();
    JPanel p22 = new JPanel();
    JPanel p23 = new JPanel();
    JLabel l2Poly1 = new JLabel("Poly 1:");
    JTextField fi1 = new JTextField(100);
    JLabel l2Poly2 = new JLabel("Poly 2:");
    JTextField fi2 = new JTextField(100);
    JLabel l2Poly3 = new JLabel("Rezultat:");
    JTextField fi3 = new JTextField(100);

    JPanel p3 = new JPanel();
    JButton suma = new JButton("+");
    JButton dif = new JButton("-");
    JButton inm = new JButton("*");
    JButton imp = new JButton("/");
    JButton deriv = new JButton("∂");
    JButton integ = new JButton("∫");

    JPanel panel = new JPanel();//o sa vina adaugate p1, p2 si p3 in el, si el se afiseaza in fereastra

    public View() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(600,100);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.setSize(350, 460);
        p1.setBackground(new Color(99,172,206));
        label1.setFont(new Font("Book Antiqua", Font.BOLD + Font.ITALIC, 24));
        p1.add(label1);

        p2.setBackground(new Color(99,172,206));
        p2.setLayout(new GridLayout(3, 2, 4, 4));
        p21.setLayout(new BoxLayout(p21, BoxLayout.Y_AXIS));
        p22.setLayout(new BoxLayout(p22, BoxLayout.Y_AXIS));
        p23.setLayout(new BoxLayout(p23, BoxLayout.Y_AXIS));
        p21.add(l2Poly1);
        p21.add(fi1);
        p22.add(l2Poly2);
        p22.add(fi2);
        p23.add(l2Poly3);
        p23.add(fi3);
        p2.add(p21);
        p2.add(p22);
        p2.add(p23);

        suma.setFont(new Font("Arial", Font.BOLD, 24));
        dif.setFont(new Font("Arial", Font.BOLD, 24));
        inm.setFont(new Font("Arial", Font.BOLD, 24));
        imp.setFont(new Font("Arial", Font.BOLD, 24));
        deriv.setFont(new Font("Arial", Font.BOLD, 24));
        integ.setFont(new Font("Arial", Font.BOLD, 24));
        suma.setBackground(new Color(38, 239, 7));
        dif.setBackground(new Color(38, 239, 7));
        inm.setBackground(new Color(38, 239, 7));
        imp.setBackground(new Color(38, 239, 7));
        deriv.setBackground(new Color(38, 239, 7));
        integ.setBackground(new Color(38, 239, 7));
        p3.setBackground(new Color(38, 239, 7));
        p3.setLayout(new GridLayout(3, 2, 4, 4));
        p3.add(suma);
        p3.add(dif);
        p3.add(inm);
        p3.add(imp);
        p3.add(deriv);
        p3.add(integ);

        panel.setBackground(new Color(69,142,176));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);
        this.setContentPane(panel);
    }
    public void sumaListener(ActionListener e) {
        suma.addActionListener(e);
    }
    public void difListener(ActionListener e) {
        dif.addActionListener(e);
    }
    public void inmListener(ActionListener e) {
        inm.addActionListener(e);
    }
    public void impListener(ActionListener e) {
        imp.addActionListener(e);
    }
    public void derivListener(ActionListener e) {
        deriv.addActionListener(e);
    }
    public void integListener(ActionListener e) {
        integ.addActionListener(e);
    }
    public JTextField getField1(){
        return fi1;
    }
    public JTextField getField2(){
        return fi2;
    }
    public JTextField getField3(){
        return fi3;
    }
}
