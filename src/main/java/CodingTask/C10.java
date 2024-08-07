package CodingTask;

public class C10 {
    public static void main(String[] args) {
        String[] names = {"Mike", "Olga", "Sophia", "Sophia", "Abraham",
                "Jackson", "Mike", "Alex"};

        System.out.println("Duplicate element is: ");

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                    break;
                }
            }
        }
    }
}
