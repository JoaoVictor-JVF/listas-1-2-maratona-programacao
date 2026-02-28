package list02;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores
    A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso
    Simão (ICMC/USP)
 */

import java.util.Scanner;
import java.util.StringJoiner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex06 ex = new Ex06();
        int valorN = scanner.nextInt();
        int[] vetorA = new int[valorN];
        int[] vetorB = new int[valorN];
        for(int i = 0; i < valorN; i++)
            vetorA[i] = scanner.nextInt();
        for(int i = 0; i < valorN; i++)
            vetorB[i] = scanner.nextInt();
        System.out.print(ex.compute(vetorA, vetorB));
    }

    String compute(int[] arrayA, int[] arrayB) {
        int[] vetorC = new int[arrayA.length * 2];
        int k = 0;
        for(int i = 0; i < arrayA.length; i++){
            vetorC[k++] = arrayA[i];
            vetorC[k++] = arrayB[i];
        }

        var joiner = new StringJoiner(" ");

        for(int i = 0; i < vetorC.length; i++)
            joiner.add(String.valueOf(vetorC[i]));

        return joiner.toString();
    }
}
