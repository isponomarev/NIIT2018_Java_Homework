import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqrtTest {
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    @Before
    public void setup(){
        System.setOut(new PrintStream(outStream));
    }
    @After
    public void clean(){
        System.setOut(null);
    }
    @Test
    public void main(){
        Sqrt.main(new String[]{"25", "0.000000000001"});
        assertEquals("Sqrt of 25.0 = 5.0 with accuracy 1.0E-12\r\n", outStream.toString());
    }
    @Test
    public void average() {
        Sqrt sqrt = new Sqrt(1,0.1);
        double result = sqrt.average(5, 7);
        assertEquals("6.0", Double.toString(result));
    }
    @Test
    public void good() {
        Sqrt sqrt = new Sqrt(25,0.1);
        boolean result = sqrt.good(5.5, 25);
        assertEquals(false, result);
    }
    @Test
    public void improve() {
        Sqrt sqrt = new Sqrt(30,0.1);
        double result = sqrt.improve(6, 30);
        assertEquals("5.5", Double.toString(result));
    }
    @Test
    public void iter() {
        Sqrt sqrt = new Sqrt(25,0.1);
        double result = sqrt.iter(5.001, 25);
        assertEquals("5.001", Double.toString(result));
    }
    @Test
    public void calc() {
        Sqrt sqrt = new Sqrt(25,0.1);
        double result = sqrt.calc();
        assertEquals("5.000023178253949", Double.toString(result));
    }
}