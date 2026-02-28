package list01;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar
    uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede,
    o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de
    tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar
    lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/

import java.util.Scanner;
import java.util.Locale;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex06 ex = new Ex06();

        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double custo = scanner.nextDouble();
        double rendimento = scanner.nextDouble();

        int latas = ex.compute(largura, altura, rendimento);
        System.out.printf("%d %.2f", latas, latas * custo);
    }

    public int compute(double L, double a, double m) {
        if(L == 0 || a == 0 || m == 0)
            return 0;
        else {
            if (L * a < m)
                return 1;
            else
                return (int) Math.ceil(L * a / m);
        }
    }
}
