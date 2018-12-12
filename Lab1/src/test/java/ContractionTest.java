import org.junit.Test;

import static org.junit.Assert.*;

public class ContractionTest {

    @Test
    public void contractionString() {
        Contraction myString1 = new Contraction();
        String result1 = myString1.contractionString("1,2,3,4,5,6");
        assertEquals("1-6", result1);

        Contraction myString2 = new Contraction();
        String result2 = myString2.contractionString("1,3,5,77,78,79,99,100,101");
        assertEquals("1,3,5,77-79,99-101", result2);

        Contraction myString3 = new Contraction();
        String result3 = myString3.contractionString("1,2,3,4,35,88");
        assertEquals("1-4,35,88", result3);
    }
}