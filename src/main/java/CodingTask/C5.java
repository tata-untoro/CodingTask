package CodingTask;

public class C5 {
    public static void main(String[] args) {
        int a = 1; // a = 1
        int b = 2; // b = 2

        System.out.println("Before swap: ");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b; // a = 3
        b = a - b; // b = 3 - 1 == 2 , b = 2
        a = a - b; // a = 3 - 2 == 1 , a = 1

        System.out.println("After swap: ");
        System.out.println("a = " + a + ", b = " + b);


    }
}
