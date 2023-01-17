import java.util.Random;
import java.util.Arrays;

public class SortArrayElements {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] array = new int[5][];

        for(int i = 0; i < array.length; i++) {
            array[i] = new int[6];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(30,100);
            }
        }

        // Жадная (Пузырьковая сортировка)
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {

               for(int k = 0; k < array.length; k++) {
                   for(int l = 0; l < array[k].length; l++) {
                       if(array[i][j] <= array[k][l]) {
                           int count = array[i][j];
                           array[i][j] = array[k][l];
                           array[k][l] = count;
                       }
                   }
               }
            }
        }

        /*System.out.println(Arrays.deepToString(array));*/
        for(int mas[]: array){
            for(int elem: mas) {
                System.out.print(elem + " ");
            }
        }
    }
}
