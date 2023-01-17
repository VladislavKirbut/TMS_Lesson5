import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class IncreaseElements {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);

        int [][][] array = new int[1][][];

        for(int i = 0; i < array.length; i++) {
            array[i] = new int[3][];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = new int[6];
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                for(int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = randomNumber.nextInt(5, 30);
                }
            }
        }

        System.out.println(Arrays.deepToString(array));

        System.out.println("Enter a number to increase: ");
        int number = scan.nextInt();

        for(int mass[][]: array) {
            for(int arr[]: mass) {
                for(int elem: arr) {
                    elem += number;
                    System.out.print(elem + " ");
                }
            }
        }
    }
}
