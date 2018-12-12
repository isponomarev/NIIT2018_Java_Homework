public class Contraction {
    private String output = new String();
    boolean inRange = false;

    public String contractionString(String inputString) {      //метод свертывает в диапазоны чисел
        String[] arr = inputString.split(",");            //создает массив и удаляет все запятые
        for (int i = 1; i < arr.length; i++) {                 //находит диапазоны чисел и формирует строку
            if ((Integer.parseInt(arr[i]) == Integer.parseInt(arr[i - 1]) + 1) && inRange == false) {
                output += arr[i - 1] + "-";
                inRange = true;
            } else if ((Integer.parseInt(arr[i]) == Integer.parseInt(arr[i - 1]) + 1) && inRange == true) {
                if (i == arr.length-1)                      //решает проблему добавления последней цифры диапазона
                    output += arr[i];                       //если в конце входной строки есть диапазон
                continue;
            } else if ((Integer.parseInt(arr[i]) != Integer.parseInt(arr[i - 1]) + 1) && inRange == true) {
                output += arr[i - 1] + ",";
                inRange = false;
            } else
                output += arr[i - 1] + ",";
            if (i == arr.length-1)
                output += arr[i];
        }
        return output;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("String not found!");
            return;
        }
        String str = args[0];
        //String str = new String("1,2,4,5,6,7,18,19,20,21");
        Contraction myString = new Contraction();
        System.out.println(myString.contractionString(str));
    }
}
