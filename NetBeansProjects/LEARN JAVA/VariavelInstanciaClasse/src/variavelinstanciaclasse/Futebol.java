
package variavelinstanciaclasse;


public class Futebol {
    private String nomeTime; //var de instancia
    private static String nomeSelecao; //var de classe


    public void setTime(String meuTime) {
        nomeTime = meuTime;
    }

    public String getTime() {
        return nomeTime;
    }

    public static void setSelecao(String selecao) {
        nomeSelecao = selecao;
    }
    
    public static String getSelecao() {
        return nomeSelecao;
    }
    
    public void mostraTime() {
        System.out.printf("Seu time do coracao é %s\n", getTime());
    }

    public void mostraSelecao() {
        System.out.printf("Sua seleção é %s\n", getSelecao());
    }
}
