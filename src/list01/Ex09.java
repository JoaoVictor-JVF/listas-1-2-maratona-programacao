package list01;

/*
    Faça um programa que leia um conjunto de valores que correspondem
    as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não
    existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa
    tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi
    (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex09 ex = new Ex09();
        int i = 0;
        int[] vetor = new int[100];
        int maiorDeIdade = 0;
        int pessoaIdosa = 0;
        while(true){
            int num = scanner.nextInt();
            if(num <= -1)
                break;
            if(num >= 18) maiorDeIdade++;
            if(num > 75) pessoaIdosa++;
            vetor[i++] = num;
        }
        System.out.printf("%.2f %d %.2f%%", ex.compute(vetor, i), maiorDeIdade, (double)pessoaIdosa/i * 100);
    }
    public double compute(int[] vetor, int cont) {
        int soma = 0;
        int aux = cont--;
        while(cont >= 0)
        {
            soma += vetor[cont--];
        }
        return (double)soma/aux;
    }

}
