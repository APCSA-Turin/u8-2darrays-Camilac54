public class FunWith2DArraysTWO {
    public static double average (int[][] numArr) {
    double total = 0;
    int instances = 0;
        for (int row = 0; row < numArr.length; row ++) {
            for (int col = 0; col < numArr[0].length; col ++) {
                total += numArr[row][col];
                instances ++;
            }
        }
        return total / (double) instances;
    }

    public static int edgeSum (int [][] numArr) {
        int sum = 0;

        int[] firstR = numArr[0];
        for (int one : firstR) {
            sum += one;
        }

        int[] lastR = numArr[numArr.length - 1];
        for (int one : lastR) {
            sum += one;
        }

        for (int i = 1; i < numArr.length - 1; i ++) {
            sum += numArr[i][0];
            sum += numArr[i][numArr[0].length - 1];
        }
        return sum;
    }

    public static int[] indexFound (String[][] strArr, String wrd) {
        int [] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int col = 0; col < strArr[0].length; col ++) {
            for (int row = 0; row < strArr.length; row ++) {
                if (strArr[row][col].equals(wrd)) {
                    result[0] = row;
                    result[1] = col;

                    return result;
                }
            }
        }
        return result;
    }

    public static int [][] split (int[][] numArr, int row, int col) {
        int[][] exception = new int[0][0];

        if (row >= numArr.length || col >= numArr[0].length) {
            return exception;
        }

        int[][] result = new int[row + 1][col + 1];
        for (int r = 0; r < row + 1; r ++) {
            for (int c = 0; c < col + 1; c ++) {
                result[r][c] = numArr[r][c];
            }
        }
        return result;
    }

    public static int[][] invert (int[][] numArr) {

        int [][] inv = new int [numArr[0].length][numArr.length];
        for (int row = 0; row < numArr.length; row ++) {
            for (int col = 0; col < numArr[0].length; col ++) {
                int num = numArr[row][col];
                inv[col][row] = num;
            }
        }
        return inv;
    }
}