import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToCharsTest {

    @Test
    public void createCharNumbers() {
        NumberToChars myString = new NumberToChars();
        int[] numArr = new int[]{1,2,3,4,5};
        String[] result = myString.createCharNumbers(numArr);
        String[] test = {"   *     ***    ***      *   ***** ",
                         "  **    *   *  *   *    **   *     ",
                         " * *       *       *   * *   *     ",
                         "   *      *      **   *  *   ***** ",
                         "   *     *         *  *****      * ",
                         "   *    *      *   *     *       * ",
                         " *****  *****   ***      *   ***** ",};
        assertArrayEquals(test, result);
    }
}