import java.util.Scanner;
public class Activity_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        int atSign = email.indexOf("@");
        String username = email.substring(0, atSign);
        String domain = email.substring(atSign);
        scanner.close();
        System.out.println("\n");
        System.out.println("Email Entered:\n" + email);
        System.out.println("Length: " + email.length());
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}
