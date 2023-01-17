import java.util.Random;
import java.util.Arrays;

public class PrintSum {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] array = new int[3][];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = new int[5];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 50);
            }
        }

        System.out.println(Arrays.deepToString(array));

        for(int arr[]: array) {
            for(int elem: arr) {
                sum += elem;
            }
        }

        System.out.print("Sum of array elements: ");
        System.out.println(sum);
    }
}
