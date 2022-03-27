import java.util.Scanner;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here

        int[][][] array = new int[3][3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = k + (array.length * j);
                }
            }
        }

        return array;
    }






}