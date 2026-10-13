import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word).append(word.length()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
