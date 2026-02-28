package list02;

/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/

import java.util.Scanner;
import java.util.StringJoiner;

public class Ex02{
    public static final int FIXO = 5;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[FIXO];
        int[] vetorB = new int[FIXO];
        for(int i = 0; i < FIXO; i++){
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0; i < FIXO; i++){
            vetorB[i] = scanner.nextInt();
        }

        Ex02 ex = new Ex02();
        System.out.println(ex.compute(vetorA, vetorB));
    }

    public String compute(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[FIXO];
        for(int i = 0; i < FIXO; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        var joiner = new StringJoiner(", ");
        for (int i = 0; i < FIXO; i++)
            joiner.add(String.valueOf(vetorC[i]));

        return joiner.toString();
    }
}


