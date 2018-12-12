public class Collatz {
    private static long count;
    private static long maxSeq;
    private static long maxNum;

    static long collatz(long n){                    //рассчитывает последовательность Коллатца для опред.числа
        count++;
        if (n == 1)
            return count;
        else if (n % 2 == 0)
            return collatz(n / 2);
        else
            return collatz(3 * n + 1);
    }

    static void searchCollatzMax(int maxValue){     //определяет макс.число и длину последовательности для него
        for (int i = 1; i <= maxValue; i++) {
            count = collatz(i);
            if (count > maxSeq) {
                maxSeq = count;
                maxNum = i;
            }
            count = 0;
        }
    }

    static long getMaxSeq() {
        return maxSeq;
    }

    static long getMaxNum() {
        return maxNum;
    }

    public static void main(String[] args) {
        searchCollatzMax(1000000);
        System.out.println("The maximum number = " + getMaxNum());
        System.out.println("The longest sequence = " + getMaxSeq());
    }
}


