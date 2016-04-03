import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/2/2016.
 */
public class _02_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String targetWord = scanner.next();

        Pattern pattern = Pattern.compile(targetWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        int start = 0;
        while (matcher.find(start)) {
            count++;
            start = matcher.start() + 1;
        }

        System.out.println(count);
    }
}
