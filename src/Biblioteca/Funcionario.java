package Biblioteca;

public class Funcionario extends Usuario {
    private String cargo; // Encapsulamento: atributo privado com getter/setter

    public Funcionario(int id, String nome, String cargo) {
        super(id, nome);
        this.cargo = cargo;
    }

    // Encapsulamento: getter/setter
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Sobrescrita
    @Override
    public String realizarAcao(String acao) {
        return String.format("Funcionario %s (%s) realizou a ação: %s", getNome(), cargo, acao);
    }

    // Sobrescrita: funcionário pode cadastrar livros
    @Override
    public boolean podeCadastrarLivro() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Funcionario[id=%d, nome=%s, cargo=%s]", id, nome, cargo);
    }
}