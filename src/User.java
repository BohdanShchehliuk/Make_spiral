import java.util.Arrays;

public class User {
    public static void main(String[] args) {
        int[][] resuldt = spiralize(5);

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print(resuldt[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] spiralize(int size) {

        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = 0;
            }
        }
        int[][] newResult = new int[result.length][result.length];
        for (int j = 0; j < size; j++) {
            result[0][j] = 1;
            newResult = recovers(result);
        }

        int magicNumb = 0;

        while (magicNumb < size - 1) {
            for (int j = magicNumb; j < size - magicNumb; j++) {
                int[][] newResultOne = newResult;
                newResult[magicNumb][j] = 1;
            }
            magicNumb = Math.round(magicNumb + 1);
            newResult = recovers(newResult);


        }
        return newResult;
    }



   public static int[][] recovers(int[][] result) {
        int[][] newResultTwo = new int[result.length][result.length];
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result.length; ++j) {
                newResultTwo[result.length - j - 1][i] = result[i][j];
            }
        }
        return newResultTwo;
    }

}

