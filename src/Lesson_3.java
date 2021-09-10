public class Lesson_3 {
  /*  public static void main(String[] args) {
        Random random = new Random(10);
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(10));
    }
}*/


    //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input value...");
//        String next = scanner.next();
//        System.out.println(next);
//        scanner.close;
//    }
   /* public static final Random RANDOM = new Random(10);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first value");
        int firstvalue = RANDOM.nextInt();
        System.out.println("Input second value");


 */
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Mas = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Mas.length; i++) {
            System.out.println(Mas[i]);
        }
    }
}













