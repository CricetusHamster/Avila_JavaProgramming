package Finals;
import java.util.Scanner;
public class Activity_1 {
    public static void main(String[] args) {
        // Create your account
        Scanner scan = new Scanner(System.in);
        System.out.println("Create your account:\n");
        System.out.println("Please enter username:");
        String username = scan.nextLine();
        System.out.println("Please enter password:");
        String password = scan.nextLine();
        System.out.println("Please confirm password:");
        String confirmpassword = scan.nextLine();
        do {
            if(!confirmpassword.equals(password)){
                System.out.println("Password does not match, please try again.");
                System.out.println("Please confirm password:");
                confirmpassword = scan.nextLine();
            }
            else{}
        }
        while (!confirmpassword.equals(password));
        System.out.println();
        // Login
        System.out.println("Login:");
        System.out.println("Please enter username:");
        String loginusername = scan.nextLine();
        System.out.println("Please enter password:");
        String loginpassword = scan.nextLine();
        do {
            if(!loginusername.equals(username) && !loginpassword.equals(password)){
            System.out.println("Incorrect Username and Password, please try again.");
            }
            else if(!loginusername.equals(username)){
            System.out.println("Incorrect Username, please try again.");
            }
            else if(!loginpassword.equals(password)){
            System.out.println("Incorrect Password, please try again.");    
            }
            else{
                scan.close();
                break;
            }
            System.out.println("Please enter username:");
            loginusername = scan.nextLine();
            System.out.println("Please enter password:");
            loginpassword = scan.nextLine();
        }
        while (!loginusername.equals(username) || !loginpassword.equals(password));
        System.out.println("Succesful Login!");
    }
}
