package CodingTask;

public class C9 {
    public static void main(String[] args) {

        int [] numbers = {0, 1, 2, 4, 20, 15, 78, 99, 190, 88, -1, 35};

        int a, b;

        if (numbers[0] > numbers[1]){
            a = numbers[0];
            b = numbers[1];
        } else {
            a = numbers[1];
            b = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++){
            if (numbers[i] > a ){
                b = a;
                a = numbers[i];
            }else if (numbers[i] > b && numbers[i] != a){
                b = numbers[i];
            }
        }
        System.out.println("The second largest number is: " + b);
    }
}
