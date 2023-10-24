package lista_03;

import java.util.Scanner;

public class exercio_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[6];
    double[] notas1 = new double[6];
    double[] notas2 = new double[6];
    double[] medias = new double[6];

    int aprovados = 0;
    int reprovados = 0;

    // Entrada de dados
    for (int i = 0; i < 6; i++) {
      System.out.println("Informe o nome do estudante " + (i + 1) + ": ");
      nomes[i] = scanner.nextLine();
      System.out.println("Informe a nota 1 do estudante " + (i + 1) + ": ");
      notas1[i] = scanner.nextDouble();
      System.out.println("Informe a nota 2 do estudante " + (i + 1) + ": ");
      notas2[i] = scanner.nextDouble();
      scanner.nextLine(); // Limpar o buffer de entrada
    }

    // Cálculo das médias e verificação da situação
    for (int i = 0; i < 6; i++) {
      medias[i] = (notas1[i] + notas2[i]) / 2;
      String situacao = (medias[i] >= 5.0) ? "Aprovado" : "Reprovado";

      System.out.println("Nome: " + nomes[i]);
      System.out.println("Nota 1: " + notas1[i]);
      System.out.println("Nota 2: " + notas2[i]);
      System.out.println("Média: " + medias[i]);
      System.out.println("Situação: " + situacao);
      System.out.println();

      if (situacao.equals("Aprovado")) {
        aprovados++;
      } else {
        reprovados++;
      }
    }

    // Cálculo da média da turma e dos percentuais
    double mediaTurma = 0;
    for (int i = 0; i < 6; i++) {
      mediaTurma += medias[i];
    }
    mediaTurma /= 6;

    double percentualAprovados = (double) aprovados / 6 * 100;
    double percentualReprovados = (double) reprovados / 6 * 100;

    System.out.println("Média da Turma: " + mediaTurma);
    System.out.println(
      "Percentual de Estudantes Aprovados: " + percentualAprovados + "%"
    );
    System.out.println(
      "Percentual de Estudantes Reprovados: " + percentualReprovados + "%"
    );
  }
}
