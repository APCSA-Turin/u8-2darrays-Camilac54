package U8T1;
public class Runner {
    public static void main(String[] args) {
        String[][] seatingChart = {
            {"Abby", "Don", "George", "Kim"},
            {"Brian", "Elenor", "Harry", "Lenny"},
            {"Cathy", "Fred", "Jill", "Matt"}
        };

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println("-------------"); // Break
        seatingChart[1][2] = "Paul";

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println("-------------"); // Break

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println("-------------"); // Break

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        System.out.println("-------------"); // Break

        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];

        for (int[] one : arr1) {
            for (int single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        for (String[] one : arr2) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println(); // Small Break

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] one : arr1) {
            for (int single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";

        for (String[] one : arr2) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println(arr1[0][2] + arr2[2][0]);

    } 
}