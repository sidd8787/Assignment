package Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        // Create an array and shuffle it
        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> shuffledList = Arrays.asList(originalArray);
        Collections.shuffle(shuffledList);

        // Convert a Roman numeral to an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanInput = scanner.nextLine();
        int integerResult = romanToInteger(romanInput);

        // Check if the input is a pangram
        System.out.print("Enter a sentence: ");
        String pangramInput = scanner.nextLine();
        boolean isPangram = isPangram(pangramInput);

        // Display the shuffled array, integer result, and pangram result
        System.out.println("Shuffled Array: " + shuffledList);
        System.out.println("Integer Value of Roman Numeral: " + integerResult);
        System.out.println("Is the input a pangram? " + isPangram);

        scanner.close();
    }

    public static int romanToInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanValue(s.charAt(i));
            if (i < s.length() - 1) {
                int next = romanValue(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

