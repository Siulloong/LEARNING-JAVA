package aula13_poliformismo;

public class Aula13_Poliformismo {

    public static void main(String[] args) {
        //Programa principal
        Cachorro c = new Cachorro();
        c.reagir("ola");
        
        System.out.println("");
        
        c.reagir(11,45);
        c.reagir(19,00);
 
        System.out.println("");
        
        c.reagir(true);
        c.reagir(false);
        
        System.out.println("");
        
        c.reagir(2,2.5f);
        c.reagir(17,4.5f);
        
    }    
}
    
