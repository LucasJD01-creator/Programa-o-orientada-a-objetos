package Biblioteca;

public abstract class Usuario {
    // Encapsulamento: atributos protegidos/privados com acesso via métodos.

    protected int id;
    protected String nome;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Encapsulamento: getters/setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo que será sobrescrito (polimorfismo de tempo de execução)
    // Cada tipo de usuário pode "realizar uma ação" diferente.

    public abstract String realizarAcao(String acao);

    // Metodo que indica se o usuário pode cadastrar livros (só funcionário)

    public boolean podeCadastrarLivro() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Usuario[id=%d, nome=%s]", id, nome);
    }
}

