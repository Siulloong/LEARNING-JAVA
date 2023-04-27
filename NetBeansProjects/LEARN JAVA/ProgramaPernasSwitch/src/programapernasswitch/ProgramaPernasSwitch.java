/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernasswitch;

import java.util.Scanner;

/**
 *
 * @author Ederson
 */
public class ProgramaPernasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch(perna) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripede";
                break;
            case 4: 
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "et";
                break;
        }
        System.out.println(tipo);
    }
    
}
