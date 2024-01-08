import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {

    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language.";
        char searchChar = 'J'; // Измените эту букву для поиска слов, начинающихся с другой буквы

        findWordsStartingWith(text, searchChar);
    }

    public static void findWordsStartingWith(String text, char searchChar) {
        String regex = "\\b" + searchChar + "\\w*"; // Регулярное выражение для поиска слов
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // CASE_INSENSITIVE для игнорирования регистра
        Matcher matcher = pattern.matcher(text);

        System.out.println("Слова, начинающиеся на букву '" + searchChar + "':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
