public class NumberToChars {
    private String[] visualNumber;
    private String[] outputString;

    private int[] stringToIntArray(String inputString){            //преобразует входной String-массив в Int-массив
        String[] strArr = inputString.split("");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }

    public String[] createCharNumbers(int[] numArr) {              //создает массив из символов принимая массив чисел
        outputString = new String[]{};
        for (int i = 0; i < numArr.length; i++) {
            String[] charNumber  = numberVisualization(numArr[i]);
            for (int j = 0; j < outputString.length; j++) {
                outputString[j] += charNumber[j];
            }
        }
        return outputString;
    }

    private String[] numberVisualization(int inputNumber){        //визуализирует входящее число в символьный вид
            switch (inputNumber) {
                case 0:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                " *   * ",
                                                " *   * ",
                                                " *   * ",
                                                " *   * ",
                                                "  ***  "};
                    break;
                case 1:
                    visualNumber = new String[]{"   *   ",
                                                "  **   ",
                                                " * *   ",
                                                "   *   ",
                                                "   *   ",
                                                "   *   ",
                                                " ***** "};
                    break;
                case 2:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                "    *  ",
                                                "   *   ",
                                                "  *    ",
                                                " *     ",
                                                " ***** "};
                    break;
                case 3:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                "     * ",
                                                "   **  ",
                                                "     * ",
                                                " *   * ",
                                                "  ***  "};
                    break;
                case 4:
                    visualNumber = new String[]{"    *  ",
                                                "   **  ",
                                                "  * *  ",
                                                " *  *  ",
                                                " ***** ",
                                                "    *  ",
                                                "    *  "};
                    break;
                case 5:
                    visualNumber = new String[]{" ***** ",
                                                " *     ",
                                                " *     ",
                                                " ***** ",
                                                "     * ",
                                                "     * ",
                                                " ***** "};
                    break;
                case 6:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                " *     ",
                                                " ****  ",
                                                " *   * ",
                                                " *   * ",
                                                "  ***  "};
                    break;
                case 7:
                    visualNumber = new String[]{" ***** ",
                                                "     * ",
                                                "    *  ",
                                                "   *   ",
                                                "  *    ",
                                                " *     ",
                                                " *     "};
                    break;
                case 8:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                " *   * ",
                                                "  ***  ",
                                                " *   * ",
                                                " *   * ",
                                                "  ***  "};
                    break;
                case 9:
                    visualNumber = new String[]{"  ***  ",
                                                " *   * ",
                                                " *   * ",
                                                "  **** ",
                                                "     * ",
                                                " *   * ",
                                                "  ***  "};
                    break;
            }
            return visualNumber;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("String not found!");
            return;
        }
        String str = args[0];
        NumberToChars myString = new NumberToChars();
        //String str = new String("41072819");
        int[] numArray = myString.stringToIntArray(str);
        String[] charNumbers = myString.createCharNumbers(numArray);
        for (int i = 0; i < charNumbers.length; i++) {
            System.out.println(charNumbers[i]);;
        }
    }
}
