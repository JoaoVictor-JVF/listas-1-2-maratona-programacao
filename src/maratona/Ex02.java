package maratona;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        char[] vetor = texto.toCharArray();
        Ex02 ex = new Ex02();

        System.out.print(ex.compute(vetor));
    }

    String compute(char[] v){
        int cont = 0;
        int k = 0;

        for(int i = 0; i < v.length; i++) {
            if ((v[i] == 'a') || (v[i] == 'e') || (v[i] == 'i') || (v[i] == 'o') || (v[i] == 'u'))
                cont++;
        }

        char[] vetor = new char[cont];

        for(int i = 0; i < v.length; i++) {
            if ((v[i] == 'a') || (v[i] == 'e') || (v[i] == 'i') || (v[i] == 'o') || (v[i] == 'u'))
                vetor[k++] = v[i];
        }

        int i = 0;
        int j = vetor.length - 1;

        while(i < j){
            if(vetor[i] != vetor[j])
                return "N";
            i++;
            j--;
        }

        return "S";
    }
}
