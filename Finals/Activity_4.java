package Finals;

import java.util.Scanner;

public class Activity_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Enter Score
        int[] scores = new int[10];
        int input = 0;
        for (int i = 0; i < scores.length; i++){
            input++;
            System.out.print("Enter Quiz " + input + " Score: " );
            scores[i] = scan.nextInt();
        }

        // Display
        System.out.println();
        System.out.println("Quiz Scores:");
        int output = 0;
        for (int i = 0; i < scores.length; i++){
            output++;
            System.out.println("Quiz " + output + ": " + scores[i]);
        }

        // Total Score
        System.out.println();
        int total = 0;
        for (int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        System.out.println("Total Score: " + total);

        // Average Score
        double average = (double) total / scores.length;
        System.out.println("Average Score: " + average);
    }
}
