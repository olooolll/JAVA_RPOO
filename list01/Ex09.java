package br.edu.ifsp.list01;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[0];
        int age = 0;
        do{
            System.out.printf("Informe a idade: ");
            age = sc.nextInt();
            ages = Arrays.copyOf(ages, ages.length + 1);
            ages[ages.length -1 ] = age;

        } while (age >= 0);
        Ex09 ex = new Ex09();

        System.out.println(ex.compute(ages));

    }

    String compute(int[] input) {
        Locale.setDefault(Locale.US);
        int size = input.length - 1;

        int qttYoung = 0;
        int qttOlder = 0;
        int sumAge = 0;


        for(int i=0; i < size; i++){
            if(input[i] > 75) qttOlder++;
            if(input[i] < 18) qttYoung++;
            sumAge += input[i];
        }

        return String.format("%.2f", (double) sumAge/ size) + " " + (size - qttYoung) + " " + String.format("%.2f", (100.0 / ((double) size /qttOlder))) + "%";
    }
}
