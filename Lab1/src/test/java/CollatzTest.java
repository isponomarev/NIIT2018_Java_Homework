import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {
    @Test
    public void collatz() {
        long result = Collatz.collatz(7);
        assertEquals(17, result);
    }

    @Test
    public void searchCollatzMax() {
        Collatz.searchCollatzMax(20);
        assertEquals(18, Collatz.getMaxNum());
        assertEquals(21, Collatz.getMaxSeq());
    }
}