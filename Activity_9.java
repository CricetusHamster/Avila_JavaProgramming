import java.util.Scanner;

public class Activity_9 {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the day of the week: (1-7)");
            int day = scn.nextInt();
            scn.close();
            if (day == 1)
            {
                System.out.println("MONDAY!");
            }
            
            else if (day == 2)
            {
                System.out.println("TUESDAY!");
            }

            else if (day == 3)
            {
                System.out.println("WEDNESDAY!");
            }
            
            else if (day == 4)
            {
                System.out.println("THURSDAY!");
            }

            else if (day == 5)
            {
                System.out.println("FRIDAY!");
            }

            else if (day <= 7)
            {
                System.out.println("Weekend!");
            }
            
            else
            {
                System.out.println("ermm.... watdesigma");
            }
    }
}
