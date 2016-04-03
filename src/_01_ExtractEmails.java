import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/2/2016.
 */
public class _01_ExtractEmails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        String emailMatcher =
                "\\b[a-zA-Z0-9]+([\\.\\-_]?[a-zA-Z0-9]*)@[a-zA-Z]+\\-?[a-zA-Z]*\\.[a-zA-Z]+(\\.?[a-zA-Z0-9]*)\\b";

        Pattern pattern = Pattern.compile(emailMatcher);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
