public class Main {
    public static void main(String[] args) {

            int[][] resuldt = spiralize(3);

            for(int i = 0; i < 3; ++i) {
                for(int j = 0; j < 3; ++j) {
                    System.out.print(resuldt[i][j]);
                }

                System.out.println();
            }

        }

        public static int[][] spiralize(int size) {
            int[][] result = new int[size][size];

        int sum = 0;

            for(int i = 0; i < size; ++i) {
                for(int j = 0; j < size; ++j) {
                    ++sum;
                    result[i][j] = sum;
                }
            }

            int[][] newResult = new int[size][size];

            for(int i = 0; i < size; ++i) {
                for(int j = 0; j < size; ++j) {
                    newResult[size - j - 1][i] = result[i][j];
                }

                System.out.println();
            }

            return newResult;
        }
}
