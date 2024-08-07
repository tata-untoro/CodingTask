package CodingTask;

public class C8 {
    public static void main(String[] args) {
        int [] numbers = {1, 5, 81, 75, 348, 8573, 0, 321 ,-1, 55};

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            } else if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println(minNumber + " is the minimum number");
        System.out.println(maxNumber + " is the maximum number");
    }
}
