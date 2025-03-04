package U8T1;

public class FunWith2DArrays {
    public static int totalElements(int[][] numArrays) {
        int counter = 0;
        for (int[] one : numArrays){
            for (int single : one) {
                counter ++;
            }
        }
        return counter;
    }

    public static void fourCorners(String[][] stringArrays) {
        System.out.println(stringArrays[0][0]);
        System.out.println(stringArrays[0][stringArrays[0].length - 1]);
        System.out.println(stringArrays[stringArrays.length - 1][0]);
        System.out.println(stringArrays[stringArrays.length - 1][stringArrays[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] stringArrays) {
        String[] temp = stringArrays[0];
        stringArrays[0] = stringArrays[stringArrays.length - 1];
        stringArrays[stringArrays.length - 1] = temp;
    }
}