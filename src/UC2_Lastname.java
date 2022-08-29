import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2_Lastname {
    public static boolean validateLastname(String lastname) {

        String regx = "^[A-Za-z]{3,20}$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(lastname);

        if (lastname.matches(regx)){
            return matcher.find();
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("First name validation");
        System.out.println("Enter last name: ");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        System.out.println("LastName :" +lastName);

        System.out.println(validateLastname(lastName));
    }
}