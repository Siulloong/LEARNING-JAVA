
package exercclasses;

public class Celular {
    String marca;
    String modelo;
    int ano;
    boolean carregado;
    
    void liga(int nro){
        System.out.println("Ligou para "+nro+" do celular "+this.marca+" modelo "+this.modelo);
    }
    
    void atende(){
        if(this.carregado = true){
            System.out.println("atendeu ...");
        } else {
            System.out.println("não pode atender... descarregado");
        }
    }
    
    void desperta(String hora){
        System.out.println("despertou "+hora);
    }
}
