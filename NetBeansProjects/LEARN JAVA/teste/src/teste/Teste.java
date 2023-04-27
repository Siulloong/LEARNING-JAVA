/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author Ederson
 */
public class Teste {

    /**
     * DIFERENÇA COMPARAÇÃO VARIAVEL == ou .equals
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String parte1 = "teste 1 ";
        String parte2 = "teste 1 ";
        String parte3 = parte1+parte2;
        String parte4 = "teste 1 teste 1 ";
        
        System.out.println((parte1==parte2) ? "é":"não é");
        System.out.println((parte3.equals(parte4) ? "é":"não é"));
        System.out.println((parte3==parte4) ? "é":"não é");
        
        
    }
    
}
