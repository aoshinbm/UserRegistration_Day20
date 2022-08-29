import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5_password1 {
    public static boolean validatePassword(String password) {

        String regx = "^[A-Za-z0-9]{8,25}$";
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
        System.out.println("Paassword validation");
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("Password :" +password);

        System.out.println(validatePassword(password));
    }
}