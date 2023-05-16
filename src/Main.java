import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 12;
        numbers[1] = 22;
        numbers[2] = 32;
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(numbers.length);

        double[] numbers2 = {2, 3, 4, 5, 6};
        numbers2[3] = 3;
        System.out.println(Arrays.toString(numbers2));
    }
}