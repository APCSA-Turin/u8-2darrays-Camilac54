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

        System.out.println("-------------");
        seatingChart[1][2] = "Paul";

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] one : seatingChart) {
            for (String single : one) {
                System.out.print(single + " ");
            }
            System.out.println();
        }
    } 
}