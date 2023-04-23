package poo_get_set_cont;

public class Caneta {
    
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampad;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampad() {
        return tampad;
    }

    public void setTampad(boolean tampad) {
        this.tampad = tampad;
    }
        
    public void status(){
        System.out.println("Sobre a Caneta : ");
        System.out.println("Modelo : "+this.getModelo());
        System.out.println("Ponta : "+this.getPonta());
        System.out.println("Cor : "+this.getCor());
        System.out.println(" ");
    }
}
