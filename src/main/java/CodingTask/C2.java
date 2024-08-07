package CodingTask;

public class C2 {
    public static void main(String[] args) {
        // Initialize array numbers
        int [] numbers = {12, 13, 99, 100, 101};

        // Initialize sum
        int sum=0;

        // Loop
        for (int i = 0; i < numbers.length; i++){
                sum=sum+numbers[i];
        }
        // Print out Sum
        System.out.println("Total of all numbers is: " + sum);
    }
}
