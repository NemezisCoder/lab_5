import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HyperlinkConverter {

    public static void main(String[] args) {
        String text = "Проверьте сайт http://example.com и https://www.example.org для информации.";
        String result = replaceUrlsWithHyperlinks(text);
        System.out.println(result);
    }

    public static String replaceUrlsWithHyperlinks(String text) {
        String regex = "https?://[\\w-_.]+[\\w-_./?=&#]+";  // Регулярное выражение для URL
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String url = matcher.group();
            String hyperlink = "<a href=\"" + url + "\">" + url + "</a>";
            matcher.appendReplacement(sb, hyperlink);
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}