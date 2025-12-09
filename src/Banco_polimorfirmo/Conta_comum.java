package Banco_polimorfirmo;
//Atributos
public class Conta_comum {
    private int numero;
    private int saldo;
    private int tipo;

    //construct
    public Conta_comum(int numero, int saldo, int tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    //getters end setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Métodos
    public void getSacar() {
        if (saldo <= 0) {
            System.out.println("Não foi possivel sacar! Saldo insuficiente.");
        } else {
            System.out.println("Você sacou: " + this.saldo);
        }
        public void getDepositar(int deposito){
            this.deposito = deposito;
            System.out.println("Você depositou!" + );
        }

    }
}