package by.Shauliuk.tasks.secondlesson;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Homework part 1");
        System.out.println("Task 1");
        int i = -28;
        if (i > 0 && i <= 9) {
            System.out.println("Positive one integer");
        } else if (i >= 10 && i < 100) {
            System.out.println("Positive two integers");
        } else if (i >= 100) {
            System.out.println("Positive three integers");
        } else if (i < 0 && i >= -9) {
            System.out.println("Negative one integer");
        } else if (i < 0 && i <= -10 && i > -100) {
            System.out.println("Negative two integers ");
        } else if (i < 0 && i <= -100)
            System.out.println("Negative three integers");

        System.out.println("Task 2");
        int a = 2;
        int b = 2;
        int c = 3;
        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            System.out.println("There is such triangle");
        } else {
            System.out.println("There is no such triangle");
        }

        System.out.println("Task 3");
        int integer = -9;
        int ten = 10;
        if (integer > 0) {
            System.out.println(integer + 1);
        } else if (integer < 0) {
            System.out.println(integer - 2);
        } else if (integer == 0) {
            System.out.println(ten);
        }
        System.out.println("Task 4");
        int num1 = 67;
        int num2 = -2;
        int num3 = -93;
        int counter = 0;
        if (num1 > 0) {
            counter++;
        }
        if (num2 > 0) {
            counter++;
        }
        if (num3 > 0) {
            counter++;
        }
        System.out.println(counter);

        System.out.println("Task 5");
        int z = 67, x = -2, y = -93;
        int counterPositive = 0;
        int counterNegstive = 0;
        if (z > 0) {
            counterPositive++;
        } else if (a < 0) {
            counterNegstive++;
        }
        if (x > 0) {
            counterPositive++;
        } else if (x < 0) {
            counterNegstive++;
        }
        if (y > 0) {
            counterPositive++;
        } else if (y < 0) {
            counterNegstive++;
        }
        System.out.println("CounterPositive : " + counterPositive + ", CounterNegative : " + counterNegstive);

        System.out.println("Task 6");
        int l = 3;
        int m = 8;
        if (l > m) {
            System.out.println(l);
        } else {
            System.out.println(m);
        }
        System.out.println("Task 7");
        int programmer = 1;
        if (programmer == 1) {
            System.out.println("В комнате " + programmer + " программист");
        }
        if (programmer>1 && programmer<10){
            System.out.println("В комнате " + programmer + " программистa");
        }
        if (programmer >10){
            System.out.println("В комнате " + programmer + " программистов");
        }
        if (programmer==0){
            System.out.println("В комнате " + programmer + " программистов");
        }
        System.out.println("Homework part 2");
        System.out.println("Task 1");
        double day1 = 10;
        double result = 10;
        for (int t = 1; t < 7; t++) {
            day1 *= 1.1;
            result += day1;
        }
        System.out.println("Amount of km sportsman run - " + result);

        System.out.println("Task 2");
        int count = 1;
        int hour = 3;
        for (int f = 3; f <= 24; f += 3) {
            count *= 2;
        }
        System.out.println("Number of Ameba - " + count);

        System.out.println("Task 3");
        int initialNumber = 1;
        int result1 = initialNumber;
        while (initialNumber < 256) {
            initialNumber *= 2;
            result1 = result1 + initialNumber;
        }
        System.out.println(result1);

        System.out.println("Task 4");
        int letterA = 3;
        int letterB = 7;
        int resultt = 0;
        while (letterB > 0) {
            resultt = resultt + letterA;
            letterB--;
        }
        System.out.println(resultt);

        System.out.println("Task 5");
        double cm = 0;
        for (int d = 1; d <= 20; d++) {
            cm = d * 2.54;
            System.out.println(cm);
        }
        System.out.println("Task 6");
        for (int w = 2; w <= 100; w += 2) {
            System.out.println(w);
        }
        System.out.println("Task 7");
        int sum = 0;
        for (int s = 0; s <= 99; s++) {
            s += 1;
            sum += s;
            System.out.println(sum);
        }
        System.out.println("Task 8");

        for (int e = 0; e < 5; e++) {
            for (int j = 0; j <= e; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        for (int e = 5; e >= 0; e--) {
            for (int j = 0; j < e; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}












