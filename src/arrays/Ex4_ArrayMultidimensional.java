package arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] M = new int[4][4]; // cada linha representa um array multidimensional e cada coluna o
                                   // o elemento dentro do array
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) { // "j" representa a coluna(elemento) dentro da array
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha) {  //"elemento" é a variavel que representa o elemento da coluna
                System.out.print(coluna + " ");
            }

            System.out.println(); // faz com que após a execução total da linha pule para próxima linha
            
        }     
    }
}
