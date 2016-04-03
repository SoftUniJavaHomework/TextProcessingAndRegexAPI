import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/2/2016.
 */
public class _03_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String targetWord = scanner.next();

        String wordPattern = String.format("(?<=\\W|^)%s(?=\\W|$)", targetWord);
        Pattern pattern = Pattern.compile(wordPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()){
            count++;
        }

        System.out.println(count);
    }
}
