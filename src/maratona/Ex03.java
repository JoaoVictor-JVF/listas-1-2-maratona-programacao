package maratona;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ex03 ex = new Ex03();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] matriz = new int[N][M];

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ex.compute(matriz, N, M));
    }

    int compute(int[][] matriz, int linha, int coluna){
        int maiorSoma = 0;
        int soma;
        for(int i = 0; i < linha; i++){
            soma = 0;
            for(int j = 0; j < coluna; j++){
                soma += matriz[i][j];
            }

            if(soma > maiorSoma) maiorSoma = soma;
        }

        for(int j = 0; j < coluna; j++){
            soma = 0;
            for(int i = 0; i < linha; i++){
                soma += matriz[i][j];
            }

            if(soma > maiorSoma) maiorSoma = soma;
        }

        return maiorSoma;
    }
}
