package com.mycompany.exercicio3;

import java.util.Scanner;

public class ContasJava {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int cod;
        
        System.out.println("BEM - VINDO(A)");
        
        do{
            System.out.println("====================================================\n");
            System.out.println("Informe o que deseja fazer conforme a tabela\n");
            System.out.println("| 1 - ADICIONAR CONTA        |");
            System.out.println("| 2 - SACAR                  |");
            System.out.println("| 3 - DEPOSITAR              |");
            System.out.println("| 4 - MOSTRAR SALDO          |");
            System.out.println("| 5 - MOSTRAR DADOS DA CONTA |");
            System.out.println("| 0 - SAIR                   |\n");
            cod = ler.nextInt();
            
            switch (cod){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("====================================================\n");
                    System.out.println("Opção inválida!");
                    break;
            }    
        }while(cod !=0);
    }
}
