/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorbusca;

/**
 *
 * @author Ederson
 */
import java.util.Arrays;

public class VetorBusca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,7,6,1,9,4,2};
        for (int v : vet){
            System.out.print(v+" ");
        }
        System.out.println(" ");
        int p= Arrays.binarySearch(vet,9);
        System.out.println("Encontrei o valor 1 na posicão "+p);
        
        //atribuicao coletiva = para todos os vetores
        int x[] = new int[20];
        Arrays.fill(x,0);
        
        for(int val:x){
            System.out.print(val+" ");
        }
        
        
        
         
    }
}
    

