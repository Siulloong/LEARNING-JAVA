
package exer_metds;

public class Exer_metds {

    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(111);
        c1.setDono("Jubileu");
        
        c1.abrirConta("CC");
        c1.sacar(50);
        c1.fecharConta();
        c1.estadoAtual();
        
         
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(222);
        c2.setDono("Creuza");
        
        
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.estadoAtual();
        
    }
    
}
