package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {

        int numero;
        int quantNumero;
        int quantPares = 0, quantImpares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros deseja?: ");
        quantNumero = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;


            count++;

        } while (count < quantNumero);

        System.out.println("NÚmeros Pares: " + quantPares);
        System.out.println("NÚmeros Impares: " + quantImpares);
    }
}
