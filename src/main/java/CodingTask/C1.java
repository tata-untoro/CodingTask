package CodingTask;

public class C1 {
    public static void main(String[] args) {

        double [] numbers = {58, -210, -40, 0, -273.15, 1668, 5526};

        // Initialize min and max numbers in list with index 0
        double min = numbers[0];
        double max = numbers[0];

        // Looping
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        // Printout
        System.out.println("The lowest temperature is: " + min + " °C ");
        System.out.println("The highest temperature is: " + max + " °C ");
        }
}

