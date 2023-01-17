import java.util.Random;

public class ArrayDiagonal {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] array = new int[5][5];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(25, 100);
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(i == j || j == array[i].length - 1 - i)
                    System.out.print(array[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
