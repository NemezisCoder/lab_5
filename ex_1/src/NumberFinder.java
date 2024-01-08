import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99 and there were 20 items.";
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

