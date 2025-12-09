package Banco_polimorfirmo;
//Atributos
public class Pessoa_juridica extends  Pessoa {
    private String CNPJ;

    //Construct

    public Pessoa_juridica(String nome, String endereço, String telefone, String CNPJ) {
        super(nome, endereço, telefone);
        this.CNPJ = CNPJ;
    }
    //getters end setters

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    //Métodos
    public void getgravar(String nome){
        this.nome = nome;
        System.out.println("Nome gravado" + this.nome);
    }
    public void getgravar(String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
        System.out.println("Nome e CNPJ gravados" + this.nome + this.CNPJ);
    }
}
