public class One {
    public static void main(String[] args) {
        int[][] resuldt = spiralize(6);

        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
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

        int horizont, vertical, sum,i,j;
        horizont = 0;
       vertical  = size - 1;
        sum    = 1;
        for(i=1; i<=size/2+1; i= +1, horizont++, vertical--) {
            // зліва на право
            for(j=horizont; j<=vertical; j++, sum++){

               result[horizont][j] = sum;
            }
            //зверху до низу
            for(j=horizont+1; j<=vertical; j++, sum++) {
                result[j][vertical] = sum;
            }
            // зліва на право
            for(j=vertical-1; j>=horizont; j--, sum++) {
               result[vertical][j] = sum;
            }
            // зверху до низу
            for(j=vertical-1; j>=horizont+1; j--, sum++)
            {
               result[j][horizont] = sum;
            }
        }
        return result;
    }
}
