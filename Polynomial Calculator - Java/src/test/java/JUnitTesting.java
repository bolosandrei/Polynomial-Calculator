import model.Operations;
import model.Polynom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTesting {
    @Test
    public void adunareTest(){
        Polynom p1=new Polynom("4x^5-3x^4+1x^2-8x^1+1x^0");
        Polynom p2=new Polynom("3x^4-1x^3+1x^2+2x^1-1x^0");
        String rezultat = new String("+4.0x^5-1.0x^3+2.0x^2-6.0x^1");
        assertEquals(rezultat, Operations.suma(p1,p2).toString());
    }
    @Test
    public void scadereTest(){
        Polynom p1=new Polynom("4x^5-3x^4+1x^2-8x^1+1x^0");
        Polynom p2=new Polynom("3x^4-1x^3+1x^2+2x^1-1x^0");
        String rezultat = new String("-4.0x^5-6.0x^4+1.0x^3-10.0x^1+2.0x^0");
        assertEquals(rezultat, Operations.diferenta(p1,p2).toString());
    }
    @Test
    public void inmultireTest(){
        Polynom p1=new Polynom("3x^2-1x^1+1x^0");
        Polynom p2=new Polynom("1x^1-2x^0");
        String rezultat = new String("+3.0x^3-7.0x^2+3.0x^1-2.0x^0");
        assertEquals(rezultat, Operations.inmultirea(p1,p2).toString());
    }
    @Test
    public void derivareTest(){
        Polynom p1=new Polynom("1x^3-2x^2+6x^1-5x^0");
        String rezultat = new String("+3.0x^2-4.0x^1+6.0x^0");
        assertEquals(rezultat, Operations.derivarea(p1).toString());
    }
    @Test
    public void integrareTest(){
        Polynom p1=new Polynom("1x^3+4x^2+5x^0");
        String rezultat = new String("+0.25x^4+1.3333333333333333x^3+5.0x^1");
        assertEquals(rezultat, Operations.integrarea(p1).toString());
    }

}