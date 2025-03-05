import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0) {
            result = str1.length() - str2.length();
        }

        System.out.println(result < 0 ? "\"" + str1 + "\" comes before \"" + str2 + "\"" : "\"" + str2 + "\" comes before \"" + str1 + "\"");
    }
}