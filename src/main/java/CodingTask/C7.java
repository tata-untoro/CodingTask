package CodingTask;

public class C7 {
    public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < n; i++){
            int fibonaciNumbers = a + b;
            System.out.println(fibonaciNumbers);
            a = b;
            b = fibonaciNumbers;
        }
        }
}

