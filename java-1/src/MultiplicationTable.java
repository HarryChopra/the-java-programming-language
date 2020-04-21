import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give the number: ");
        int num = Integer.parseInt(reader.next());
        printTable(num);
    }

    public static void printTable(int max) {
        for (int i = 1; i <= max; i++) {
            printRow(i, (i * max));
            System.out.println("");
        }
    }

    public static void printRow(int coeff, int max) {
        for (int i = coeff; i <= max; i += coeff) {
            System.out.print(i + " ");
        }
    }
}