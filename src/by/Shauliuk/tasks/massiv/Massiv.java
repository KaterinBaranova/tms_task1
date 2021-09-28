//package by.Shauliuk.tasks;
//
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class Massiv {
//    public static void main(String[] args) {
//        {
//            int a = 0; // массив из чётных от 2 до 20 сначала в строку, а затем в столбик
//            for (int i = 2; i <= 20; i++) {
//                if (i % 2 == 0) a++;
//            }
//            int[] Mas = new int[a];
//            for (int i = 2, b = 0; i <= 20; i++) {
//                if (i % 2 == 0) {
//                    Mas[b] = i;
//                    System.out.print(Mas[b] + " ");
//                    b++;
//                }
//            }
//            System.out.println(" ");
//            for (int i = 0; i < Mas.length; i++) {
//                System.out.println(Mas[i]);
//            }
//
//            int a = 0; // массив из всех нечётных чисел от 1 до 99, массив  в обратном порядке
//            for (int i = 1; i <= 99; i++) {
//                if (i % 2 != 0) a++;
//            }
//
//            int[] Mas = new int[a];
//            for (int i = 1, b = 0; i <= 99; i++) {
//                if (i % 2 != 0) {
//                    Mas[b] = i;
//                    System.out.print(Mas[b] + " ");
//                    b++;
//                }
//            }
//            System.out.println(" ");
//            for (int i = Mas.length - 1; i >= 0; i--) {
//                System.out.println(Mas[i]);
//            }
//
//            int b = 0; //Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. чётных элемент и количество.
//            int[] Mas = new int[15];
//            for (int i = 0; i < Mas.length; i++) {
//                Random rnd = new Random();
//                Mas[i] = rnd.nextInt(10);
//                System.out.print(Mas[i] + " ");
//                if (Mas[i] > 0 & Mas[i] % 2 == 0) b++;
//            }
//            System.out.println(" ");
//            System.out.println("Всего в массиве " + b + " четных");
//
//
//            int[] Mas = new int[20]; //массив из 20  [0;20]. элемент с нечётным индексом на ноль.
//            for (int i = 0; i < Mas.length; i++) {
//                Mas[i] = (int) (Math.random() * 19 + 1);
//                System.out.print(Mas[i] + " ");
//            }
//            for (int i = 0; i < Mas.length; i++) {
//                if (Mas[i] % 2 != 0) Mas[i] = 0;
//                System.out.println(Mas[i] + "");
//            }
//
//            double sumMas1 = 0, sumMas2 = 0; // Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15]
//            int[] Mas1 = new int[5];
//            for (int i = 0; i < Mas1.length; i++) {
//                Mas1[i] = (int) (Math.random() * 16);
//                System.out.print(Mas1[i] + " ");
//                sumMas1 += (double) Mas1[i] / Mas1.length;
//            }
//            System.out.println(" ");
//            int[] Mas2 = new int[5];
//            for (int i = 0; i < Mas2.length; i++) {
//                Mas2[i] = (int) (Math.random() * 16);
//                System.out.print(Mas2[i] + " ");
//                sumMas2 += (double) Mas2[i] / Mas2.length;
//            }
//            System.out.println(" ");
//            if (sumMas1 == sumMas2) System.out.println("Средние арифметические значения двух массивов равны");
//            else {
//                if (sumMas1 > sumMas2)
//                    System.out.println("Среднее арифметическое значение первого массива больше и равно ");
//                else System.out.println("Среднее арифметическое значение второго массива больше и равно ");
//            }
//
//            int[] Mas = new int[4]; //массив из 4 случайных целых чисел из отрезка [0;10]
//            for (int i = 0; i < Mas.length; i++) {
//                Mas[i] = (int) (Math.random() * 9 + 1);
//                System.out.print(Mas[i] + " ");
//            }
//            for (int i = 0; i < Mas.length; i++) {
//                if (i > 0) {
//                    if (Mas[i - 1] >= Mas[i]) {
//                        System.out.println("Прогрессия не возрастающая");
//                        break;
//                    }
//                }
//                if (i == Mas.length - 1)
//                    System.out.println("Последовательность строго возрастающая");
//            }
//            int[] mas = new int[12]; // массив из 12 случайных  [0;15]. какой элемент максимальным и сообщите индекс.
//            int maxNumber = -16;
//            int maxIndex = 0;
//
//            for (int i = 0; i < mas.length; i++) {
//                mas[i] = (int) (Math.random() * 31) - 15;
//                if (maxNumber <= mas[i]) {
//                    maxNumber = mas[i];
//                    maxIndex = i;
//                }
//            }
//
//            System.out.println("Индекс максимального элемента: " + maxIndex);
//
//            int[] Mas1 = new int[10]; // два массива из 10 [0;9] и третий массив из 10 действительных чисел.
//            int[] Mas2 = new int[10];
//            double[] Mas3 = new double[10];
//            int SC = 0;
//            for (int i = 0, b = 1; b <= 4; i++) {
//                if (b == 1) {
//                    Mas1[i] = (int) (Math.random() * 9) + 1;
//                    if (i == 0)
//                        System.out.print((b) + " массив состоит из следующих элементов: ");
//                    System.out.print(Mas1[i] + " ");
//                    if (i == Mas1.length - 1) {
//                        b++;
//                        i = 0;
//                        System.out.println(" ");
//                    }
//                }
//                if (b == 2) {
//                    Mas2[i] = (int) (Math.random() * 9) + 1;
//                    if (i == 0)
//                        System.out.print((b) + " массив состоит из следующих элементов: ");
//                    System.out.print(Mas2[i] + " ");
//                    if (i == Mas2.length - 1) {
//                        b++;
//                        i = 0;
//                        System.out.println(" ");
//                    }
//                }
//                if (b == 3) {
//                    Mas3[i] = (double) Mas1[i] / Mas2[i];
//                    if (i == 0)
//                        System.out.print((b) + " массив состоит из следующих элементов: ");
//                    System.out.print(Mas3[i] + " ");
//                    if (i == Mas3.length - 1) {
//                        b++;
//                        i = 0;
//                        System.out.println(" ");
//                    }
//                }
//
//                if (b == 4) {
//                    if (Mas3[i] % (int) Mas3[i] == 0) {
//                        if (SC == 0)
//                            System.out.print("В 3 массиве следующие целые числа: ");
//                        SC++;
//                        System.out.print(Mas3[i] + ", ");
//                    }
//                    if (i == Mas3.length - 1) {
//                        if (SC == 0)
//                            System.out.println("В третьем массиве нет целых чисел!");
//                        break;
//                    }
//                }
//
//            }
//
//            int a, lCount = 0, rCount = 0; //программа должна создать массив указанного размера из случайных целых чисел из [0;15]
//            Scanner scn = new Scanner(System.in);
//            System.out.println("Введите четное число");
//            if (scn.hasNextInt()) {
//                do {
//                    a = scn.nextInt();
//                    if (a % 2 != 0 || a < 1) System.out.println("Вы ошиблись, введите повторно четное число!");
//                }
//                while (a % 2 != 0 || a < 1);
//                int[] Mas = new int[a];
//                for (int i = 0; i < Mas.length; i++) {
//                    Mas[i] = (int) (Math.random() * 16) + 1;
//                    System.out.print(Mas[i] + " ");
//                    if (i <= Mas.length / 2 - 1) {
//                        lCount += Math.abs(Mas[i]);
//                    } else {
//                        rCount += Math.abs(Mas[i]);
//                    }
//                    if (i == Mas.length - 1) {
//                        System.out.println(" ");
//                        if (lCount > rCount)
//                            System.out.println("Сумма модулей первой половины массива больше и равна " + lCount);
//                        if (rCount > lCount)
//                            System.out.println("Сумма модулей второй половины массива больше и равна " + rCount);
//                        if (rCount == lCount)
//                            System.out.println("Суммы модулей первой и второй половины равны");
//                    }
//                }
//            } else System.out.println("Введено не число");
//
//            int n = 0, c = 0; //Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
//            do {
//                Scanner scn = new Scanner(System.in);
//                System.out.println("Введите число большее 3");
//                if (scn.hasNextInt()) {
//                    n = scn.nextInt();
//                } else System.out.println("Ошибка. Вы ввели не число!");
//            }
//            while (n < 4);
//            int[] Mas1 = new int[n];
//            for (int i = 0; i < Mas1.length; i++) {
//                Mas1[i] = (int) (Math.random() * (n + 1));
//                System.out.print(Mas1[i] + " ");
//                if (Mas1[i] % 2 == 0 & Mas1[i] != 0) c++;
//            }
//            System.out.println(" ");
//            if (c > 0) {
//                int[] Mas2 = new int[c];
//                for (int i = 0, b = 0; i < Mas1.length; i++) {
//                    if (Mas1[i] % 2 == 0 & Mas1[i] != 0) {
//                        Mas2[b] = Mas1[i];
//                        System.out.print(Mas2[b] + " ");
//                    }
//                }
//            }
//        }
//
//    }
//}
//
