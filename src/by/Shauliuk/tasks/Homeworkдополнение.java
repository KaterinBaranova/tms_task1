package by.Shauliuk.tasks;

import java.util.Scanner;

public class Homeworkдополнение {
    public static void main(String[] args) {

        int d = (int) (Math.random() * 150 + 1) + 5;// случайно выбранное из отрезка[5;155] целое число в интервал(25;100).
        if (d <= 25 || d >= 100) {
            System.out.println("Число " + d + " не содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + d + " содержится в интервале (25,100)");
        }

        for (int i = 10; i <= 20; i++) {   // программа, выводящая на экран квадраты чисел от 10 до 20 включительно.
            System.out.println(i * i);
        }

        {
            Scanner scanner = new Scanner(System.in); // Если переменная a равна 10, то выведите 'Верно',иначе 'Неверно'
            System.out.println("Угадай задуманню цифру");
            int a = scanner.nextInt();
            if (a == 10) {
                System.out.println("Верно");
            } else {
                System.out.println("Не верно");
            }
        }
        {
            Scanner scanner = new Scanner(System.in); //Определите в какую четверть часа попадает это число
            System.out.println("Введи значение от 0 до 59");
            int min = scanner.nextInt();
            if (min >= 0 & min <= 15) {
                System.out.println("Первая четверть");
            } else if (min > 15 & min <= 30) {
                System.out.println("Вторая четверть");
            } else if (min > 30 & min <= 45) {
                System.out.println("Третья четверть");
            } else if (min > 45 & min <= 59) {
                System.out.println("Четвертая четверть");
            } else {
                System.out.println("Значение должно быть от 0 до 59");
            }
        }
        {
            Scanner scanner = new Scanner(System.in); // Переменная num может принимать 4 значения.Весна/Лето/Зима/Осень
            System.out.println("Введи значение от 1 до 4");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Весна");
                    break;
                case 3:
                    System.out.println("Лето");
                    break;
                case 4:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Попробуйте снова ввести значение от 1 до 4");
            }
        }
    }
}




