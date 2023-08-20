package ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada){
            System.out.println("### DESAFIANTE ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            
            switch(vencedor) {
                case 0 : //empate
                    System.out.println("Empatou");
                    this.desafiado.empartarLuta();
                    this.desafiante.empartarLuta();
                    break;
                 
                case 1 : //desafiante vence
                    System.out.println("Vidoria do "+desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println(vencedor);
                    break;
                    
                case 2 : //desafiado vence
                    System.out.println("Vitoria do "+desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    System.out.println(vencedor);
                    break;
                    
            }
            
            }
    }
        
    //Metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
