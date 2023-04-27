
package exercclasses;

public class ExercClasses {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        
        c1.marca = "SAMSUMG";
        c1.modelo = "A5";
        c1.ano = 2023;
        c1.carregado = true;
        
        Celular c2 = new Celular();
        
        c2.marca = "SAMSUMG";
        c2.modelo = "A3";
        c2.ano = 2021;
        c2.carregado = false;
        
        c1.liga(991050841);
        
        c1.atende();
        
        c1.desperta("9:00");
        
        c2.liga(991050888);
        
        c2.atende();
        
        c2.desperta("19:00");
    }
    
}
