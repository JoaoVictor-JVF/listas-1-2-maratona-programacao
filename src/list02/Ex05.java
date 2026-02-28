package list02;

/*
    Você está responsável pelo bolo de aniversário da sua priminha
    e decidiu que o bolo terá uma vela para cada ano da
    idade total dela. Quando ela assopra as velas, ela só é capaz de
    apagar apenas as velas mais altas. Sua tarefa é fazer
    um programa que leia a idade A da sua sobrinha e a altura das velas.
    Após isso, seu programa deve imprimir a
    quantidade de velas que ela vai conseguir apagar.

    Por exemplo, se sua sobrina está fazendo 4 anos e o bolo possui 4
    velas de tamanhos 4, 4, 1, 3, então ela só vai
    conseguir apagar as duas mais altas, de tamanho 4. Portanto, a resposta
    deve ser 2.

    ### Exemplos de entrada e saída:

    | Entrada               | Saída  |
    | -------               | ------ |
    | 4    4    4    1    3 | 2      |
    | 4    3    2    1    3 | 2      |

    Fonte: Adaptado de https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex05 ex = new Ex05();
        int idade = scanner.nextInt();
        int[] velas = new int[idade];
        for(int i = 0; i < idade; i++){
            velas[i] = scanner.nextInt();
        }

        System.out.println(ex.compute(velas));
    }

    int compute(int[] velas) {
        int maiorvela = velas[0];
        int cont = 0;
        for(int i = 1; i < velas.length; i++){
            if(maiorvela < velas[i]) maiorvela = velas[i];
        }
        for(int i = 0; i < velas.length; i++) {
            if (maiorvela == velas[i]) cont++;
        }
        return cont;
    }
}
