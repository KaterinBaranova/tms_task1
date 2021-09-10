package by.Shauliuk.tasks;

public class Lesson_4 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int s = 0;

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (i == j) {
                    s += a[i][j];
                }
            }
        }

        System.out.println(s);

        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int g = 1;
                s *= array[i][j];
                System.out.print(g);
            }
        }
    }
}









