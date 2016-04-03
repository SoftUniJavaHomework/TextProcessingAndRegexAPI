import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/3/2016.
 */
public class _05_ExtractWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String wordPattern = "[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(wordPattern);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
