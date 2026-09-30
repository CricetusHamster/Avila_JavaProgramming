import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you legal?");
        int age = scan.nextInt();
        scan.close();
        if (age >= 18)
        {
            System.out.println("You are between 18 and 20");
            if (age >= 21)
            {
                System.out.println("You are 21 or older.");
            }
        }
        else
        {
            System.out.println("You are a minor.");
        }
    }
}
