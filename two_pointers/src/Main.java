import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3, 3, 3, 3};

        int newLength = removeDuplicates(numbers);

        int[] result = Arrays.copyOf(numbers, newLength);
        System.out.println(Arrays.toString(result));
    }

    public static int removeDuplicates(int[] numbers) {
        int i = 0;
        int j = 1;

        while (j < numbers.length) {
            if (numbers[j] != numbers[i]) {
                i++;
                numbers[i] = numbers[j];
            }
            j++;
        }

        return i + 1;
    }
}
