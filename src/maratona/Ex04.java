package maratona;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ex04 ex = new Ex04();
        int L = scanner.nextInt();
        int C = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] matriz = new int[L][C];
        for(int i = 0; i < L; i++)
            for(int j = 0; j < C; j++)
                matriz[i][j] = scanner.nextInt();

        int[] resultado = ex.compute(matriz, x, y, L, C);
        System.out.printf("%d %d", resultado[0] + 1, resultado[1] + 1);
    }

    int[] compute(int[][] matriz, int x, int y, int L, int C){
        int[] vetor = new int[2];

        x--;
        y--;

        while(true){

            matriz[x][y] = 0;

            if(x - 1 >= 0 && matriz[x - 1][y] == 1){
                x--;
            }
            else if(x + 1 < L && matriz[x + 1][y] == 1){
                x++;
            }
            else if(y - 1 >= 0 && matriz[x][y - 1] == 1){
                y--;
            }
            else if(y + 1 < C && matriz[x][y + 1] == 1){
                y++;
            }
            else{
                vetor[0] = x;
                vetor[1] = y;
                return vetor;
            }
        }
    }
}
