/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Carol Bento
 */
public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner TT = new Scanner(System.in);
        int vetor[] = new int[7];
        vetor[0] = 111;
        vetor[1] = 222;
        vetor[0] = 333;
        vetor[0] = 444;
        vetor[0] = 555;
        vetor[0] = 666;
        vetor[0] = 777;
        
        System.out.println("Que valor deseja encontrar?");
        int valor = TT.nextInt();
        int indice = binaria(vetor, valor);
        
        System.out.println(indice);
    }
    private static int binaria(int vetor[], int valor){
        int meio;
        int inicio, fim;
        inicio = 0;
        fim = vetor.length - 1;
        
        while(inicio <= fim){
         meio = (inicio + fim) /2;
         
         if (vetor[meio] == valor){
             return meio;
         } else if (vetor[meio] < valor){
             inicio = meio + 1;
         } else if (vetor[meio] > valor){
             fim = meio - 1;
         }
        }
        System.out.println("O valor foi encontrado na posição " + vetor);
        return -1;
    }
}
