package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemIversa {

    public static void main(String[] args) {

        System.out.print("Vetor: ");
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0;
        while(count < (vetor.length)) { //Length é o tamanho do array
            //while(count <= (vetor.length-1)) { Como o array tem 6 elementos, mas 5 posições usamos o -1
            System.out.print(vetor[count] + " "); // Usamos o laço dentro do array para que a cada repetiçõa
            count++;                              // seja mostrado um elemento do array
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length-1); i >= 0; i--) {   // Aqui o "i' recebe o valor da quantidade do array

            System.out.print(vetor[i] + " "); // Da mesma forma que o "count" aqui o "i" mostra o conteudo
        }                                     // das posições do array porem ao invés de incrementar, ele decrementa
    }
}
