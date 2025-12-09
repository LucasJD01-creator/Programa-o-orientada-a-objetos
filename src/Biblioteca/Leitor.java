package Biblioteca;

public class Leitor extends Usuario {
    private String endereco; // Encapsulamento: atributo privado com getter/setter

    public Leitor(int id, String nome, String endereco) {
        super(id, nome);
        this.endereco = endereco;
    }

    // Encapsulamento: getter/setter

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Sobrescrita

    @Override
    public String realizarAcao(String acao) {
        return String.format("Leitor %s realizou a ação: %s", getNome(), acao);
    }

    @Override
    public String toString() {
        return String.format("Leitor[id=%d, nome=%s, endereco=%s]", id, nome, endereco);
    }
}
