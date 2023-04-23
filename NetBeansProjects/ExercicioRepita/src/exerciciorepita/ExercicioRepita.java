/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Ederson
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola Mundio!!!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        
        int n,s=0,totval=0,totpar=0,totimp=0,aci100=0;
        double medval;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero :<br><em> (valor 0 interrompe)</em> ,\"</html>"));
            //JOptionPane.showMessageDialog(null,"Você digitou o valor: "+n);
            s += n;
            //-----------
            ++totval;
            //-----------            
            if ((n%2)==0){
                if(n!=0){ 
                    totpar++;
                }
            }else{
                totimp++;
            }
            //-----------
            if (n>100){
                aci100++    ;
            }
            //-----------
            
        }while(n!=0);
        
        medval=s/(totval-1);
        JOptionPane.showMessageDialog(null,"<html>Resultado final <hr><br>Somatorio : " + s + 
                                                        "<br><br>Total de Valores : "+(totval-1)+"<BR>Total de Pares :"+totpar+
                                                        "<br>Total de Impares : "+totimp+"<br>Acima de 100 : "+aci100+
                                                        "<br>Media dos Valores : "+medval+"</html>");
        
    }
    
}
