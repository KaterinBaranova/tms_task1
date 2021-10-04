package by.Shauliuk.tasks.String;

import java.util.Scanner;

public class TextFormater {

    void CalculateAmountOfWordsInLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words in ine line using space");
        String input = scanner.nextLine();
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("You entered " + count + " words");
    }


    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

}


