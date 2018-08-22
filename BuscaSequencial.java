/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Carol Bento
 */
public class BuscaSequencial {
    public static void main(String[] args) {
        
        //Criando objeto para a classe Random.
        Random aleatorio = new Random();
        //Criando objeto para a classe Scanner.
        Scanner valor = new Scanner(System.in);
        
        //Criação do vetor.
        int vetor[] = new int[15];
        System.out.println("Valor a ser encontrado:");
        int num = valor.nextInt();
        
        //Colocando valores nas posições do vetor.
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(15);
        }
        
        boolean encontrado = false;
        
        System.out.println(aleatorio);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[1] == num){
                System.out.println("O valor foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("O valor não existe no vetor >_<");
        }
    }
}
