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
        int numeroQuant;
        int par = 0;
        int impar = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros deseja?: ");
        numeroQuant = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                par++;
            }
            else {
                impar++;
            }

            count++;

        } while (count < numeroQuant);

        System.out.println("NÚmeros Pares: " + par);
        System.out.println("NÚmeros Impares: " + impar);
    }
}
