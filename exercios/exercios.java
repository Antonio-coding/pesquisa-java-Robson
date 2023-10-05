public class exercios {
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

  public static int buscaSequencial(int[] vet, int procurado) {
    int i;
    boolean achou = false;
    for (i = 0; i < vet.length; i++) {
      if (vet[i] == procurado) {
        achou = true;
        break;
      }
    }
    if (achou == true) {
      return i; // retorna a posição onde encontrou a chave
    } else {
      return -1;
    } // retorna -1 indicando que não achou a chave
  }

  public static int buscaBinaria(int[] vet, int chave) {
    int i = 0, meio, fim = v.length - 1;
    boolean achou = false;

    while (inicio <= fim) {
        meio = (inicio + fim ) / 2;
        if(v[meio] == chave){
            achou=true;
            break;
        } else if (v[meio] > chave){
            achou = meio - 1;
                }else {inicio = meio + 1;}
    }
    for (i = 0; i < vet.length; i++) {
      if (vet[i] == procurado) {
        achou = true;
        break;
      }
    }
    if (achou == true) {
      return (meio); // retorna a posição onde encontrou a chave
    } else {
      return (-1);
    } // retorna -1 indicando que não achou a chave
  }
}
