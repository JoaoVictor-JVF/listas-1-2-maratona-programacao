package maratona;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ex01 ex = new Ex01();
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int m = scanner.nextInt();
        int[] x = new int[c];
        int[] y = new int[m];

        for(int i = 0; i < x.length; i++)
            x[i] = scanner.nextInt();
        for(int i = 0; i < y.length; i++)
            y[i] = scanner.nextInt();

        System.out.println(ex.compute(x, y));
    }

    public int compute(int[] x, int[] y){
        int tem = 0;
        for(int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    tem++;
                    break;
                }
            }
        }
        return x.length - tem;
    }
}
