package projetobiblioteca;

public class ProjetoBiblioteca {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[5];
        
        p[0] = new Pessoa("Ederson", 50,"M");
        p[1] = new Pessoa("Tatiane", 30,"F");
        
        l[0] = new Livro("Livro tal","Jose Maia",300, 100, true, p[0]);
        l[1] = new Livro("Livro BLA BLA","MaRia",100, 1, true, p[1]);
        l[2] = new Livro("Livro tal","Santos Dumon",200, 10, true, p[1]);
        l[3] = new Livro("Livro xxxxxx","Jow McRow",200, 10, true, p[0]);
        l[4] = new Livro("Livro kkkkkkkkkkkkkkk","Carlos Andrade",200, 10, true, p[1]);
        
        l[2].abrir();
        l[2].folhear(111);
        l[2].avancarPag();
        l[2].avancarPag();
        l[2].avancarPag();
        
        System.out.println(l[2].detalhes());
        
    }
    
}
