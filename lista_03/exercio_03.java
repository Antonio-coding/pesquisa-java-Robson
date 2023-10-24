package lista_03;

import java.util.Random;

public class exercio_03 {

  public static void main(String[] args) {
    int[][] matrizOriginal = new int[10][10];
    int[][] matrizModificada;

    // Preencher a matriz original com números aleatórios
    preencherMatriz(matrizOriginal);

    // Clonar a matriz original para a matriz modificada
    matrizModificada = clonarMatriz(matrizOriginal);

    // Exibir a matriz original
    System.out.println("Matriz Original:");
    exibirMatriz(matrizOriginal);

    // Realizar as trocas na matriz modificada
    trocarLinhas(matrizModificada, 2, 8);
    trocarColunas(matrizModificada, 4, 9);
    trocarDiagonais(matrizModificada);
    trocarLinhaColuna(matrizModificada, 5, 9);

    // Exibir a matriz modificada
    System.out.println("\nMatriz Modificada após as trocas:");
    exibirMatriz(matrizModificada);
  }

  public static void preencherMatriz(int[][] matriz) {
    Random random = new Random();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100); // Gere números inteiros de 0 a 99 (você pode ajustar o intervalo conforme necessário)
      }
    }
  }

  public static int[][] clonarMatriz(int[][] matriz) {
    int[][] clone = new int[matriz.length][];
    for (int i = 0; i < matriz.length; i++) {
      clone[i] = matriz[i].clone();
    }
    return clone;
  }

  public static void trocarLinhas(int[][] matriz, int linha1, int linha2) {
    int[] temp = matriz[linha1];
    matriz[linha1] = matriz[linha2];
    matriz[linha2] = temp;
  }

  public static void trocarColunas(int[][] matriz, int coluna1, int coluna2) {
    for (int i = 0; i < matriz.length; i++) {
      int temp = matriz[i][coluna1];
      matriz[i][coluna1] = matriz[i][coluna2];
      matriz[i][coluna2] = temp;
    }
  }

  public static void trocarDiagonais(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      int temp = matriz[i][i];
      matriz[i][i] = matriz[i][matriz.length - 1 - i];
      matriz[i][matriz.length - 1 - i] = temp;
    }
  }

  public static void trocarLinhaColuna(int[][] matriz, int linha, int coluna) {
    for (int i = 0; i < matriz.length; i++) {
      int temp = matriz[i][linha];
      matriz[i][linha] = matriz[i][coluna];
      matriz[i][coluna] = temp;
    }
  }

  public static void exibirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
