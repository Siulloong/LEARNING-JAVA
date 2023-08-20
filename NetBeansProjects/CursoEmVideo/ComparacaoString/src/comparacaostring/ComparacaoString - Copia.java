/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Ederson
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        String nome1 = "Ederson";
        String nome2 = "Ederson";
        String nome3 = new String("Ederson");
        String res;
        res = (nome1==nome3 ? "igual":"diferente"); // vai mostrar difetente - nome 3 é uma instancia
        System.out.println(res);        
        res = (nome1.equals(nome3)?"igual":"diferente"); /* mostrará igual - compraração de conteudo
                                                                    entre variavel e instancia = equals
        */
        System.out.println(res);
        
    }
    
}
