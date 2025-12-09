package Banco_polimorfirmo;
//Atributos
public class Pessoa_fisica extends Pessoa{
    private String CPF;

    // construct
    public Pessoa_fisica(String nome, String endereço, String telefone, String CPF) {
        super(nome, endereço, telefone);
        this.CPF = CPF;
    }
// getters end setters t
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    // Metodo
    public void getgravar(String nome){
        this.nome = nome;
        System.out.println("Nome gravado" + this.nome);
    }
    public void getgravar(String nome,String telefone){
        this.telefone = telefone;
        this.nome = nome;
        System.out.println("Nome e telefone gravados" + this.nome + this.telefone);
    }
    public void getgravar(String nome,String telefone, String CPF) {
        this.telefone = telefone;
        this.nome = nome;
        this.CPF = CPF;
        System.out.println("Nome, telefone e CPF gravados" + this.nome + this.telefone + this.CPF);
    }
}
