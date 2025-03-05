import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a substring: ");
        String substring = scanner.nextLine();
        int count = 0, index = 0;

        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.println("Occurrences: " + count);
    }
}