package polimorfismoi;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho da bolha");
    }
    public void soltarBolha() {
        System.out.println("Soltando bolhassssss");
    }
    
    
    
}
