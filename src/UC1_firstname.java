import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1_firstname {
        public static boolean validateFisrtname(String firstname) {

            String regx = "^[A-Za-z]{3,20}$";
            Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(firstname);

            if (firstname.matches(regx)){
                return matcher.find();
            }
            else {
                return false;
            }

        }

        public static void main(String[] args) {
            System.out.println("First name validation");
            System.out.println("Enter first name: ");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.nextLine();
            System.out.println("FirstName :" +firstName);

            System.out.println(validateFisrtname(firstName));
        }
    }
