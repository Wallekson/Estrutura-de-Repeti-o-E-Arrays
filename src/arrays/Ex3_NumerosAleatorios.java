package arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random(); // classe dentro de java

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); // bound: valor limite do random
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {   //foreach é mais utilizado para imprimir resultados dentro de
            System.out.print(numero + " ");     // um array, mas não serve para selecionar uma posição especifica

        }

        System.out.println("\nAntecessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero - 1) + " ");

        }

        System.out.println("\nSucessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero + 1) + " ");

        }


    }
}
