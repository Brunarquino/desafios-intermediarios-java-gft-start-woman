package poligonosRegularesSimples;/*Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o
mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam. Abaixo pode-se ver vários
mosaicos feitos por polígonos regulares.

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.

Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de cada lado
de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

Saída
A saída é o perímetro P do polígono regular em uma única linha.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        String[] splits = N.split(" ");

        String slipt1 = null, slipt2 = null;

        int i = 1;
        for (String slipt :splits) {
            if(i == 1){
                slipt1 = slipt;
            }else {
                slipt2 = slipt;
            }
            i++;
        }

        int P = Integer.parseInt(slipt1) * Integer.parseInt(slipt2);


        System.out.println(  P   );
    }
}
