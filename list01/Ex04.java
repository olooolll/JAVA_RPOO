package br.edu.ifsp.list01;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        }

    int compute(int n, int c, int m) {
        int totalChocolate = n / c;

        if (totalChocolate < m) return totalChocolate;

        int counter = totalChocolate;
        while (counter >= m){

            counter -= m;
            counter++;
            totalChocolate++;
            }


        return totalChocolate;
        }

}
