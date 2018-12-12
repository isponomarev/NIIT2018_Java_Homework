public class Expanding {
    private String output = new String();

    public String expandString(String inputString) {        //метод разворачивает диапазоны чисел
        String[] arr = inputString.split(",");         //создает массив и удаляет все запятые
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("-")) {                     //находит диапазоны чисел в массиве
                String[] s = arr[i].split("-");        //массив из двух элементов - границ диапазона
                int a = Integer.parseInt(s[0]);             //начало диапазона
                int b = Integer.parseInt(s[1]);             //конец диапазона
                arr[i] = s[1];
                for (int j = a; j < b; j++)                 //заполняет диапазон цифрами по порядку
                    output += j + ",";
            }
            output += arr[i];
            if (i != arr.length - 1)                        //решает проблему последней запятой
                output += ",";
        }
        return output;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("String not found!");
            return;
        }
        String str = args[0];
        //String str = new String("1,2,3,4-7,18-21,25-33,75,98-101");
        Expanding myString = new Expanding();
        System.out.println(myString.expandString(str));
    }
}
