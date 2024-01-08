import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {

    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "256.100.50.25";

        System.out.println("IP " + ip1 + " is valid: " + isValidIPAddress(ip1));
        System.out.println("IP " + ip2 + " is valid: " + isValidIPAddress(ip2));
    }

    public static boolean isValidIPAddress(String ipAddress) {
        String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}