package exercios;

import java.util.Random;

public class exercios {

  public static void main(String[] args) {
    final int tMax = 10; // Tamanho do vetor
    int[] v;
    int procurado = 1;

    v = new int[tMax];
    final int intervalo = 20; // Gerar números entre 0 20

    // Vetor inicial
    System.out.print("Vetor inicial: \n");
    exibeVetor(v);

    // Chamada do método para construir o vetor aleatório
    v = vetorAleatorio(v, intervalo);
    System.out.print("\nVetor aleatório de números inteiros entre 0 e 20: \n");
    exibeVetor(v);

    v = metodoBolha(v);
    System.out.println("\nVetor ordenado pelo método da bolha:");
    exibeVetor(v);

    int r = buscaBinaria(v, procurado);
    if (r != -1) {
      System.out.println(
        "\nO elemento " +
        procurado +
        "º está presente na posição " +
        (r) +
        "º do vetor."
      );
    } else {
      System.out.println(
        "\nO elemento " + procurado + "º não está presente no vetor."
      );
    }
  }

  public static int buscaBinaria(int[] v, int chave) {
    int inicio = 0, fim = v.length - 1; // Initialize meio with -1

    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;
        if (v[meio] == chave) {
            return meio; // Return the index where the key was found
        } else if (v[meio] > chave) {
            fim = meio - 1;
        } else {
            inicio = meio + 1;
        }
    }

    return -1; // Return -1 indicating that the key was not found in the entire array.
}


  public static int[] metodoBolha(int[] vet) {
    int i = vet.length;
    while (i >= 2) {
      for (int j = 0; j < i - 1; j++) {
        if (vet[j] > vet[j + 1]) {
          int temp = vet[j];
          vet[j] = vet[j + 1];
          vet[j + 1] = temp;
        }
      }
      i = i - 1;
    }
    return (vet);
  }

  public static int[] vetorAleatorio(int[] v, int intervalo) {
    // Declaração da variável para trabalhar com
    // números inteiros aleatórios
    Random r;
    r = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = r.nextInt(intervalo + 1);
    }
    return (v);
  }

  // Método para exibir um vetor de inteiros
  public static void exibeVetor(int[] vet) {
    for (int i = 0; i < vet.length; i++) System.out.print(vet[i] + " ");
  }
}
