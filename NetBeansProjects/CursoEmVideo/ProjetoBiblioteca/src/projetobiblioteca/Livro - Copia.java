package projetobiblioteca;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    //METODOS GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    //IMPLEMENTOS ABSTRATOS
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag>totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pag;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;         
        }

    @Override
    public void voltarPag() {
        this.pagAtual --;         
    
    }
    
    // METODOS DA CLASSE
    
    public String detalhes(){
        return (aberto ? "ABERTO ," : "FECHADO ,")+"Livro : titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + 
               ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + ", idade="+leitor.getIdade()+
                ", sexo="+leitor.getSexo();
    }
 }
