import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int[][] m = new int[3][4];

        preencher(m);
        exibir(m);
    }

    public static void preencher (int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Digite os elementos da matriz:");
                m[i][j] = input.nextInt();
            }
        }
    }

    public static void exibir  (int[][] m) {
        System.out.println("Matriz:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
