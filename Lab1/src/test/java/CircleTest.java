import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle test = new Circle();
        test.setRadius(25);
        double result1 = Math.round(100d * test.getFerence())/100d;       //округление до сотых
        assertEquals("157.08", Double.toString(result1));
        double result2 = Math.round(100d * test.getArea())/100d;
        assertEquals("1963.5", Double.toString(result2));
    }

    @Test
    public void setFerence() {
        Circle test = new Circle();
        test.setFerence(1000);
        double result1 = Math.round(100d * test.getRadius())/100d;
        assertEquals("159.15", Double.toString(result1));
        double result2 = Math.round(100d * test.getArea())/100d;
        assertEquals("79577.47", Double.toString(result2));
    }

    @Test
    public void setArea() {
        Circle test = new Circle();
        test.setArea(10000);
        double result1 = Math.round(100d * test.getRadius())/100d;
        assertEquals("56.42", Double.toString(result1));
        double result2 = Math.round(100d * test.getFerence())/100d;
        assertEquals("354.49", Double.toString(result2));
    }
}