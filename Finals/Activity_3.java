package Finals;

public class Activity_3 {
    public static void main(String[] args) {

        int[] grades = {85, 78, 92, 88, 76, 95, 89, 84, 91, 73};

        // Total Grade
        int total = 0;
        for(int i = 0; i < grades.length; i++){
            total  += grades[i];
        }

        // Highest Grade
        int highest = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > highest){
                highest=grades[i];
            }
        }

        // Lowest Grade
        int lowest = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] < lowest){
                lowest=grades[i];
            }
        }

        // Average Grade
        double average = (double) total / grades.length;

        // Passing and Failing Grade
        int passing = 0;
        int failing = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] >=75){
                passing++;
            }
            else{
                failing++;
            }
        }

        // Display
        System.out.println("Grade Analyzer");
        System.out.println("====================");
        System.out.println("Total: " + total);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average " + average);
        System.out.println("Passing: " + passing);
        System.out.println("Failing: " + failing);

    }
}