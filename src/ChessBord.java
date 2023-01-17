public class ChessBord {
    public static void main(String[] args) {
        String [][] array = new String[8][8];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if((i + j) % 2 == 0)
                    array[i][j] = "W";
                else
                    array[i][j] = "B";
            }
        }

        for(String mass[]: array) {
            for(String element: mass) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
