package list02;

/*
    Clara está organizando as fotos da sua última viagem num álbum de fotos.
    Como ela tem muitas fotos, para economizar
    páginas do álbum ela quer colar duas fotos por página do álbum.

    Como as fotos são retangulares, as fotos podem ser coladas giradas
    (mas sempre com lados paralelos aos da página do
    álbum, para preservar o equilíbrio estético do álbum), mas elas
    devem sempre ficar inteiramente contidas no interior
    da página, e não devem se sobrepor.

    Em geral, das muitas formas de posicionar as fotos do álbum só algumas
    (ou nenhuma) satisfazem estas restrições,
    então pode ser difícil decidir se é possível colar as duas fotos em uma
    mesma página do álbum e, por isso, Clara
    pediu a sua ajuda para escrever um programa que, dadas as dimensões da
    página e das fotos, decide se é possível
    colar as fotos na página.

    Por exemplo, cada página pode ser 5×7, e duas fotos são 3×4.
    Nesse caso, é possível colar as duas fotos:
    https://olimpiada.ic.unicamp.br/static/img/task_images/2012f2p2_album.png

    Faça um programa que receba como entrada na primeira linha dois
    inteiros X e Y, indicando a largura e a altura
    da página do álbum. Cada uma das duas linhas seguintes contém dois
    inteiros L e H, indicando a largura e a altura
    das fotos.

    Seu programa deve imprimir uma única linha, contendo um único caractere:
    "S", se é possível colar as duas fotos na
    página do álbum, e "N", caso contrário.

    Exemplos de entrada e saída:

    | Entrada            | Saída  |
    | -------            | ------ |
    | 7 5                | S      |
    | 3 4                |        |
    | 3 4                |        |
    | -------            | ------ |
    | 10 10              | N      |
    | 6 6                |        |
    | 6 6                |        |


    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int larguraAlbum = scanner.nextInt();
        int alturaAlbum = scanner.nextInt();
        int larguraFoto1 = scanner.nextInt();
        int alturaFoto1 = scanner.nextInt();
        int larguraFoto2 = scanner.nextInt();
        int alturaFoto2 = scanner.nextInt();
        Ex07 ex = new Ex07();
        System.out.print(ex.compute(larguraAlbum, alturaAlbum, larguraFoto1, alturaFoto1, larguraFoto2, alturaFoto2));
    }

    String compute(int x, int y, int l1, int h1, int l2, int h2) {

        // tenta sem girar
        if(l1 + l2 <= x && h1 <= y && h2 <= y) return "S";
        if(h1 + h2 <= y && l1 <= x && l2 <= x) return "S";

        // tenta girar foto 1
        if(h1 + l2 <= x && l1 <= y && h2 <= y) return "S";
        if(l1 + h2 <= x && h1 <= y && l2 <= y) return "S";

        // tenta girar foto 2
        if(l1 + h2 <= x && h1 <= y && l2 <= y) return "S";
        if(h1 + l2 <= x && l1 <= y && h2 <= y) return "S";

        // tenta girar as duas
        if(h1 + h2 <= x && l1 <= y && l2 <= y) return "S";
        if(l1 + l2 <= y && h1 <= x && h2 <= x) return "S";

        return "N";
    }
}
