package polimorfismoi;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Correndo rapido");
    }

    @Override
    public void alimentar() {
        System.out.println("Insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nenhum");
    }
    
    // getters e sets

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
