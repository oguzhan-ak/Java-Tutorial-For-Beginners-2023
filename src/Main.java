import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[3];
        Arrays.fill(numbers, 2);
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[2];
        names[0] = "Ali";
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Ayşe");
        System.out.println(Arrays.toString(names));
    }
}