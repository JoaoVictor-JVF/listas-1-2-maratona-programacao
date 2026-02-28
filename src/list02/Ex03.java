package list02;

/*
    Leia um conjunto de cinco números inteiros não repetidos
    em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda
    não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço
    no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o
    exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída
    esperada a String "Erro".
 */

import java.util.Scanner;
import java.util.StringJoiner;

public class Ex03 {

    public static final int FIXO = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[FIXO];

        int tamanho = 5;

        // lê 5 números iniciais
        for(int i = 0; i < tamanho; i++){
            vetor[i] = scanner.nextInt();
        }

        Ex03 ex = new Ex03();

        // enquanto não estiver cheio nem vazio
        while(tamanho > 0 && tamanho < FIXO){
            int num = scanner.nextInt();
            tamanho = ex.compute(vetor, num, tamanho);
            System.out.println(ex.printVetor(vetor, tamanho));
        }
    }

    // retorna o novo tamanho do vetor
    public int compute(int[] vetor, int num, int tamanho) {

        int pos = -1;

        // procura o número
        for(int i = 0; i < tamanho; i++){
            if(vetor[i] == num){
                pos = i;
                break;
            }
        }

        // NÃO EXISTE → INSERE
        if(pos == -1){
            vetor[tamanho] = num;
            tamanho++;
        }
        // EXISTE → REMOVE
        else{
            for(int i = pos; i < tamanho - 1; i++){
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
        }

        return tamanho;
    }

    // imprime o vetor
    public String printVetor(int[] vetor, int tamanho){
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = 0; i < tamanho; i++){
            joiner.add(String.valueOf(vetor[i]));
        }
        return joiner.toString();
    }
}
