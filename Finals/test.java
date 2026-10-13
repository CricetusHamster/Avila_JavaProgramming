package Finals;

public class test {
    public static void main(String[] args) {
        // String[] subjects = {
        //     "Math",
        //     "English",
        //     "Filipino",
        //     "Science",
        //     "Programming"
        // };
        // for(String test: subjects){
        //     System.out.println(test);
        // }
        
        // int[] scores =
        // {
        //     85, 92, 76, 95, 88,
        //     79, 90, 84, 91 ,87
        // };
        // int lowest = scores[0];
        // for(int i = 0; i < scores.length; i++){
        //     if(scores[i] < lowest){
        //         lowest=scores[i];
        //     }
        // }
        // System.out.println(lowest);
        int[] numbers =
        {
            12, 7, 25, 40,
            18, 33, 50, 61
        };

        System.out.println("Odd Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
