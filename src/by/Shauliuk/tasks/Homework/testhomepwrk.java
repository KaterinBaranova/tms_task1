package by.Shauliuk.tasks.Homework;

public class testhomepwrk {
    public static void main(String[] args) {


        int[] Mas = new int[20]; //массив из 20  [0;20]. элемент с нечётным индексом на ноль.
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 19 + 1);
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0) Mas[i] = 0;
            System.out.println(Mas[i] + "");
        }
    }
}




