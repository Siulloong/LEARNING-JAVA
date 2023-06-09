package projetoyoutube1;

public class Gafanhoto extends Pessoa {
      private String login;
      private int totAssistido;


    //construtor  
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.totAssistido=0;
    }
 
    //getters e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //  to string

    @Override
    public String toString() {
        return "Gafanhoto{"+super.toString()+" login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}
