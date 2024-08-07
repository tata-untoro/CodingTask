package CodingTask;

import java.util.Scanner;

public class C6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scan.nextInt();
        scan.close();

        boolean isPrime = true;

        if (num < 2){
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

    }
}

