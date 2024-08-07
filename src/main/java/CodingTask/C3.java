package CodingTask;

public class C3 {
    public static void main(String[] args) {
        // Initialize 2D Arrays

        int [][] numbers = {
                {22, 36, 15},
                {10, 55, 196},
                {-1, 23, 111}
        };

        for(int j = 0; j < numbers.length; j++){
            for(int i =0; i < numbers[j].length; i++){
                if(numbers[j][i] % 2 == 0){
                    System.out.println("The even numbers is: " + numbers[j][i] + " at index [" + j + "][" + i + "]" );
                }
            }
        }
    }
}
