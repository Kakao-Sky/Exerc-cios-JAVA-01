/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Carol Bento
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int meuVetor[] = new int [15];
        
        //Colocando valores aleatórios no vetor.
        for (int i = 0; i < meuVetor.length; i++) {
            meuVetor[i] = aleatorio.nextInt(99);
        }
        
        //Mostrando o vetor antes de ordenar.
        System.out.println("Vetor desordenado >_<");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + "\t");
        }
        int aux;
        //Bubble sort.
        for (int i = 0; i < meuVetor.length; i++) {
            for (int j = 0; j < meuVetor.length; j++) {
                if (meuVetor[i] < meuVetor[j]){
                    aux = meuVetor[i];
                    meuVetor[i] = meuVetor[j];
                    meuVetor[j] = aux;
                }         
            }
        }
        System.out.println("");
        System.out.println("Vetor ordenado :D");
        
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i] + "\t");
        }
    }
}
