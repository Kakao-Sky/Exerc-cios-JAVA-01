/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Importando a classe Random para sortear números aleatórios.
import java.util.Random;
/**
 *
 * @author Carol Bento
 */
public class InsertionSort {
    public static void main(String[] args) {
        //Criando objeto para a classe Random.
        Random num = new Random();
        //Criando um vetor.
        int vetor[] = new int[5];
        
         //Colocando valores aleatórios no vetor.
        System.out.println("Vetor não ordenado >_<");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num.nextInt(45);
             System.out.print(vetor[i] + "\t");
        }
        //Para este caso, serão necessárias duas variáveis auxiliares.
        int aux1, aux2;
        //Insertion Sort.
        for (int i = 0; i < vetor.length; i++) {
            aux1 = vetor[i];
            aux2 = i - 1;
            
            //Criando um laço "WHILE" para começar a ordenar os valores.
            while((aux2 >= 0) && (vetor[aux2] > aux1)){
                vetor[aux2 + 1] = vetor[aux2];
                aux2 = aux2 - 1;
            } 
            vetor[aux2 + 1] = aux1;
        }
            System.out.println("");
            System.out.println("Vetor ordenado");
            
            //Mostrando o vetor ordenado
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] +"\t");
        }
    }

}
