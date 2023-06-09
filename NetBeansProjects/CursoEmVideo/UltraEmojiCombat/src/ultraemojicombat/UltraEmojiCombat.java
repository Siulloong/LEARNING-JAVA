
package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        
        l[0] = new Lutador("Jow", "França", 31, 1.75f,68.9f, 11, 2, 1);
        l[1] = new Lutador("McRow", "Brasil", 31, 1.75f,68.9f, 11, 2, 1);
        l[2] = new Lutador("Zé", "Portugal", 31, 1.75f,88.9f, 11, 2, 1);
        l[3] = new Lutador("Belêu", "Itália", 31, 1.75f,68.9f, 11, 2, 1);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
    
}
