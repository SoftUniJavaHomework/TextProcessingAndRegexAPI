import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/3/2016.
 */
public class _04_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String wordPattern = "(?<=\\W|^)\\w+(?=\\W|$)";
        Pattern pattern = Pattern.compile(wordPattern);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()){
            count++;
        }

        System.out.println(count);
    }
}
