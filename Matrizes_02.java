//Importando classes externas que serão utilizadas.
import java.util.Scanner;
import java.util.Random;

public class Matrizes_02 {
    public static void main(String[] args) {
        //Criando um objeto para cada classe.
        Scanner TT = new Scanner(System.in);
        Random numAle = new Random();
        
        System.out.println("Quais as dimensões da sua matriz?");
        System.out.println("Linhas: ");
        int L = TT.nextInt();
        System.out.println("Colunas: ");
        int C = TT.nextInt();
        
        int Matriz[][] = new int[L][C];
        
        for (int i = 0; i < Matriz.length; i++) {
                for (int j = 0; j < Matriz[0].length; j++) {
                       Matriz[i][j] = numAle.nextInt(7);
               }
              }
        
        System.out.println("Que número deseja encontrar? ");
        int numProc = TT.nextInt();
        
        for (int i = 0; i < Matriz.length; i++) {
                for (int j = 0; j < Matriz[0].length; j++) {
                       if( Matriz[i][j] == numProc){
                               System.out.println("O número " + numProc + " foi encontrado! :D");
                               System.out.println("Na Linha: " + Matriz[i] + " e na Coluna: " + Matriz[j]);
                       }
            }
        }
       }
}
