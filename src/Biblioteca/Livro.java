package Biblioteca;

public class Livro {
    private String titulo;     // Encapsulamento: privado
    private String autor;      // Encapsulamento: privado
    private int anoPublicacao; // Encapsulamento: privado
    private int codigo;        // Código único
    private int quantidade;    // Disponibilidade

    public Livro(String titulo, String autor, int anoPublicacao, int codigo, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    // Getters e setters (encapsulamento)
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Metodo para emprestar um livro
    public boolean emprestar() {
        if (quantidade > 0) {
            quantidade--;
            return true;
        }
        return false;
    }

    // Metodo para devolver um livro
    public void devolver() {
        quantidade++;
    }

    @Override
    public String toString() {
        return String.format("Livro[codigo=%d, titulo=%s, autor=%s, ano=%d, qtd=%d]",
                codigo, titulo, autor, anoPublicacao, quantidade);
    }
}