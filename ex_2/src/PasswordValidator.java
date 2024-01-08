import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        // Определяем тестовый пароль
        String password = "TestPassword123";

        // Создаем регулярное выражение для проверки пароля:
        // ^ - начало строки
        // (?=.*[A-Z]) - проверка на наличие хотя бы одной заглавной буквы
        // (?=.*\\d) - проверка на наличие хотя бы одной цифры
        // [a-zA-Z\\d]{8,16} - пароль должен быть длиной от 8 до 16 символов и содержать только латинские буквы и цифры
        // $ - конец строки
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$");

        // Проверяем, соответствует ли пароль заданному регулярному выражению
        boolean isValid = pattern.matcher(password).matches();

        // Выводим результат проверки
        System.out.println("Password is valid: " + isValid);
    }
}