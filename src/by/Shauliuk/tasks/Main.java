package by.Shauliuk.tasks;

public class Main {
/*    public static void main(String[] args) {
        Tester.testInt();
        Tester.testByte();
        Tester.testShort();
        Tester.testLong();
        Tester.testDouble();
        Tester.testChar();
        Tester.testFloat();
        Tester.testBoolean();
    }
}*/

    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Mas = new int[a];
        System.out.print(Mas[a] + " ");
    }
}