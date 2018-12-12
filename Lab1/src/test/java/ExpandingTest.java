import org.junit.Test;

import static org.junit.Assert.*;

public class ExpandingTest {
    @Test
    public void expandString() {
        Expanding myString1 = new Expanding();
        String result1 = myString1.expandString("1,2,3,4-7,18-21,25-33");
        assertEquals("1,2,3,4,5,6,7,18,19,20,21,25,26,27,28,29,30,31,32,33", result1);

        Expanding myString2 = new Expanding();
        String result2 = myString2.expandString("1-5");
        assertEquals("1,2,3,4,5", result2);

        Expanding myString3 = new Expanding();
        String result3 = myString3.expandString("1,3,9-12");
        assertEquals("1,3,9,10,11,12", result3);
    }
}
