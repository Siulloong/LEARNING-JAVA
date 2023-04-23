package polimorfismoi;

public abstract class Animal {
    protected float peso;
    protected int idade, menbros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //getters e sets

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
    
    
}

