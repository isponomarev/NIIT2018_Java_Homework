import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CollatzMainTest {
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void main() {
        Collatz.main(new String[]{""});
        assertEquals("The maximum number = 837799\r\nThe longest sequence = 525\r\n", outStream.toString());
    }
}
