package maratona;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex05 ex = new Ex05();

        int N = scanner.nextInt();
        int C = scanner.nextInt();

        int[] precos = new int[N];

        for (int i = 0; i < N; i++) {
            precos[i] = scanner.nextInt();
        }

        System.out.println(ex.compute(precos, C));
    }

    static int compute(int[] precos, int C) {

        int semAcao = 0;
        int comAcao = -precos[0] - C;

        for (int i = 1; i < precos.length; i++) {

            int novoSem;
            if (semAcao > comAcao + precos[i]) {
                novoSem = semAcao;
            }
            else {
                novoSem = comAcao + precos[i];
            }

            int novoCom;
            if (comAcao > semAcao - precos[i] - C) {
                novoCom = comAcao;
            }
            else {
                novoCom = semAcao - precos[i] - C;
            }

            semAcao = novoSem;
            comAcao = novoCom;
        }

        return semAcao;
    }
}
