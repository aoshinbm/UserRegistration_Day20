import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3_email {
    public static boolean validateEmail(String email) {

//        "^[a-zA-Z0-9_+&*-]+(?:\\."+
  //              "[a-zA-Z0-9_+&*-]+)*@" +
    //            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
      //          "A-Z]{2,7}$";

String regx = "^[a-zA-Z0-9_+*&.-]+(?:\\.[a-zA-Z0-9_+*.-]+)*@(?:[a-zA-Z0-9._-]+)*.(?:[a-zA-Z0-9]+)*.[a-zA-Z]{2,10}$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (email.matches(regx)){
            return matcher.find();
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Email-id validation");
        System.out.println("Enter email: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println("Email :" +email);

        System.out.println(validateEmail(email));
    }
}