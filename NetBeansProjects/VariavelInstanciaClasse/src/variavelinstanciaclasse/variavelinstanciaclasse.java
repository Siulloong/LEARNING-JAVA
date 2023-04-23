
package variavelinstanciaclasse;

import java.util.Scanner;

public class variavelinstanciaclasse {

    public static void main(String[] args) {
        String time;
        String selecao;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);
        
        System.out.println("Para qual time voce torce? ");    
        time = texto.nextLine();
        System.out.println("Para qual seleção voce torce? ");
        selecao = texto.nextLine();
        
        torcida.setTime(time);
        torcida.setSelecao(selecao);
        torcida.mostraTime();
        torcida.mostraSelecao();
        
        Futebol torcida2 = new Futebol();
        torcida2.mostraTime();
        torcida2.mostraSelecao();
        
        torcida2.setSelecao("japonesa");
        torcida2.mostraSelecao();
    }
    
}
