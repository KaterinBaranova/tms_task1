package by.Shauliuk.tasks;

import java.util.Scanner;

public class Additional_tasks {
    public static void main(String[] args) {

        int input = 1234567; // Написать программу, которая переворачивает положительное семизначное число
        int num1 = 0;
        while (input > 0) {
            num1 = num1 * 10;
            num1 = num1 + input % 10;
            input = input / 10;
        }
        System.out.println(num1);

        int a = 6; //программа четырёхзначного числа образуют возрастающую (убывающую) последовательность
        int b = 5;
        int c = 3;
        int d = 1;

        if ((a < b) && (b < c) && (c < d)) {
            System.out.println("Возрастающая  последовательность");
        } else if ((a > b) && (b > c) && (c > d)) {
            System.out.println("Убывающая последовательность");
        } else System.out.println("Ни один из вариантов");


        int age = 345; // чудище каждый год отращивает по три головы
        int heads = 3;
        int countOfEyesInOneHead = 2;
        int eyes;

        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge >= 1 & currentAge <= 200) {
                heads = heads + 3;
            } else if (currentAge > 200 & currentAge <= 300) {
                heads = heads + 2;
            } else if (currentAge > 300) {
                heads = heads + 1;
            }
        }
        eyes = heads * countOfEyesInOneHead;
        System.out.println("Monster has " + heads + " heads and " + eyes + " eyes");

        Scanner scan = new Scanner(System.in); //программа арифметическое и геометрическое положительного 6 числа.
        {
            System.out.print("Введите количество чисел: "); // ответ 6
            int number = scan.nextInt();
            double sum = 0;
            for (int i = 1; i < 7; i++) {
                System.out.printf("Введите %d-е число: ", i);
                sum += scan.nextDouble();
            }
            System.out.println("Сумма чисел: " + sum);
            sum /= number;
            System.out.println("Среднее арифметическое: " + sum);
        }

        Scanner scanner = new Scanner(System.in); // В порядке возрастания и убывания

        System.out.println("Введите цифры одного 4 значного числа: ");
        int r = scanner.nextInt();
        int t = scanner.nextInt();
        int y = scanner.nextInt();
        int u = scanner.nextInt();
        if ((r < t) && (t < y) && (y < u)) {
            System.out.println("Возрастающая  последовательность");
        } else if ((r > t) && (t > y) && (y > u)) {
            System.out.println("Убывающая последовательность");
        } else System.out.println("Ни один из вариантов");

        {
            String n = "2345679"; //подсчитывает количество только чётных (илинечётных) цифр

            int even = 0, odd = 0;
            for (int i = 0; i < n.length(); i++) {
                if ((n.charAt(i) - '0') % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Четные " + even);
            System.out.println("Не четные " + odd);
        }

        Scanner scanner2 = new Scanner(System.in); // Цифры заданного числа различны либо одинаковы
        int i, k, j;
        Integer n;
        String s;
        System.out.println("Введите число");
        n = scanner2.nextInt();
        s = n.toString();
        k = s.length();
        for (i = 0; i < k - 1; i++)
            for (j = i + 1; j < k; j++)
                if (i == j) {
                    System.out.println(" Цифры одинаковы");
                } else System.out.println(" Цифры разные");

        Scanner scanner1 = new Scanner(System.in); //Является ли заданное натуральное число простым

        System.out.println("Введите число");
        int w = scanner1.nextInt();
        if (w % 2 == 0) {
            System.out.println("Составное");
        } else {
            System.out.println("Простое");
        }

    }
}






