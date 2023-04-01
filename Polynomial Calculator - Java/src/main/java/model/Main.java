package model;
import controller.Controller;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view1 = new View();
        view1.setVisible(true);
        Controller controller1 = new Controller(view1);
    /* Exemplu

    1x^2-2x^1+5x^0  -  x^2-2x+5
    2x^2+1x^1-1x^0  -  2x^2+x-1
    rezultate:
    + ->    +3.0x^2-1.0x+4.0
    - ->    -1.0x^2-3.0x+6.0
    * ->    +2.0x^4-3.0x^3+7.0x^2+7.0x-5.0
    / ->    ...
    ∂ ->    +2.0x-2.0
    ∫ ->    +0.3333333333333333x^3-1.0x^2+5.0x


    1x^5-3x^3+2x^1-3x^0
    1x^2+1x^1+3x^0
    */
    }
}
