/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Importando a classe Scanner.
import java.util.Scanner;
/**
 *
 * @author Carol Bento
 */
public class SistemaBanco {
    public static void main(String[] args) {
        //Criando um objeto para a classe Scanner.
        Scanner  TT = new Scanner(System.in);
        System.out.println("______________________");
        System.out.println("___CAIXA_ELETRÔNICO___");
        System.out.println("______________________");
        System.out.println("Digite:");
        System.out.println("1_Para sacar");
        System.out.println("2_Para depositar");
        System.out.println("3_Para ver saldo");
        System.out.println("4_Para sair");
        
        float saldo = 0;
        int opcao = TT.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Quanto deseja sacar?");
                float saque = TT.nextFloat();
                saldo = saldo - saque;
                break;
            case 2:
                System.out.println("Quanto deseja depositar?");
                float deposito = TT.nextFloat();
                saldo = saldo + deposito;
                break;
            case 3:
                System.out.println("Seu saldo atual é de R$" + saldo);
                break;
            case 4:
                System.out.println("Você deseja mesmo sair?");
                System.out.println("Escreva 'Sim' ou 'Não' ");
                
                String confirma = TT.nextLine();
                boolean confirmar;              
                
                if( "Sim".equals(confirma)){
                    confirmar = true;
                } else if("Não".equals(confirma)){
                    confirmar = false;
                } else{
                    System.out.println("Por favor, digite 'Sim' ou 'Não' e tente novamente.");
                     
                }    break;
            default:
                System.out.println("Por favor, digite uma opção válida e tente novamente.");
        }
         
    }
}
