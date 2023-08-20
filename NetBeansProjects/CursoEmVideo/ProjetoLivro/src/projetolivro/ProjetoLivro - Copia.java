
package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Livro[] l = new Livro[3];
        Pessoa[] p = new Pessoa[2];
        
        p[0] = new Pessoa("Ederson", 20, "M");
        p[1] = new Pessoa("Tatiane", 26, "F");
        
        l[0] = new Livro("Livro Java", "Jow McRow", 200, p[0]);
        l[1] = new Livro("Livro Phyton", "Jow McRow", 2300, p[1]);
        l[2] = new Livro("Livro C++", "Jow McRow", 500, p[0]);
        
        System.out.println(l[0].detalhes());
    }
    
}
