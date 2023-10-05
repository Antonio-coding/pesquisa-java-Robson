package exercios;

public class exercios_02 {

  public static void main(String[] args) {
    int[] vet = { 12, 15, 17, 19, 20, 21, 27, 37 };
    int procurado = 20;

    int r = buscaBinaria(vet, procurado);
    if (r != -1) {
      System.out.println(
        "O elemento " +
        procurado +
        " está presente na posição " +
        (r + 1) +
        " do vetor."
      );
    } else {
      System.out.println(
        "O elemento " + procurado + " não está presente no vetor."
      );
    }
  }

  public static int buscaBinaria(int[] vet, int chave) {
    int i = 0, meio, fim = vet.length - 1;
    boolean achou = false;

    while (i <= fim) {
      for (i = 0; i < vet.length; i++) {
        if (vet[i] == chave) {
          achou = true;
          break;
        }
      }
      meio = (i + fim) / 2;
      if (vet[meio] == chave) {
        achou = true;
        break;
      } else if (vet[meio] > chave) {
        fim = meio - 1;
      } else {
        i = meio + 1;
      }
    }
    if (achou == true) {
      return (meio); // retorna a posição onde encontrou a chave
    } else {
      return (-1);
    } // retorna -1 indicando que não achou a chave
  }
}
