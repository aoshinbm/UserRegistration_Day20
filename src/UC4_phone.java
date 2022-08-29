import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4_phone {
    public static boolean validatePhonenumber(String phone) {

        String regx = "^(0/91)\\d[7-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phone);

        if (phone.matches(regx)){
            return matcher.find();
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Mobile Number validation");
        System.out.println("Enter mobile number: ");
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();
        System.out.println("Mobile Number :" +phone);

        System.out.println(validatePhonenumber(phone));
    }
}