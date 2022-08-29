import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_password {
    public static boolean validatePassword(String password) {

        //
        String regx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(password);

        if (password.matches(regx)){
            return matcher.find();
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Password validation");
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("Password :" +password);

        System.out.println(validatePassword(password));
    }
}