import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] frequency = new int[256];
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (char ch : input.toCharArray()) {
            frequency[ch]++;
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}