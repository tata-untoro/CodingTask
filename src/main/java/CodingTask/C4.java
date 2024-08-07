package CodingTask;

public class C4 {
    public static void main(String[] args) {
        // Initialize 2D Arrays

        int [][] numbers = {
                {1, 3, 5},
                {2, 6, 7},
                {8, 13, 15}
        };

        int sumOfEven=0;
        int sumOfOdd=0;

        for(int j = 0; j< numbers.length; j++){
            for(int i = 0; i< numbers[j].length; i ++){
                if (numbers[j][i] % 2 == 0) {
                    sumOfEven += numbers[j][i];
                    System.out.println("The even numbers is: " + numbers[j][i] + " at index [" + j + "][" + i + "]" );
                } else {
                    sumOfOdd = sumOfOdd + numbers[j][i];
                    System.out.println("The odd numbers is: " + numbers[j][i] + " at index [" + j + "][" + i + "]" );
                }
            }
        }
        System.out.println("Total of even number is: " + sumOfEven);
        System.out.println("Total of odd number is: " +sumOfOdd);
    }
}
