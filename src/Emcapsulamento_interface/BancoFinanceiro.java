package Emcapsulamento_interface;

import java.util.Scanner;

public class BancoFinanceiro {
    // Atributos
    private String Banco;
    private String Conta;
    private double Deposito;
    private double Saque;
    private double Saldo;

// Construct
    public BancoFinanceiro(String Nubank, String corrente, double deposito, double saque, double saldo) {
        Banco = Nubank;
        Conta = corrente;
        Deposito = deposito;
        Saque = saque;
        Saldo = saldo;
    }

    public BancoFinanceiro() {

    }

    // métodos getter e setter

    public String getBanco() {
        return Banco;
    }

    public String getConta() {
        return Conta;
    }

    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double deposito) {
        Deposito = deposito;
    }

    public double getSaque() {
        return Saque;
    }

    public void setSaque(double saque) {
        Saque = saque;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    //Métodos
    public double getstatus(){
        return Saldo;
    }
    public void setDepositar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor que você deseja depositar ? ");
        double valor = sc.nextDouble();

        Saldo += valor;

        System.out.println("Depósito de R$: " + valor);
        System.out.println("Saldo atual " + Saldo);
    }
    public void setSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor que você deseja sacar ? ");
        double valor = sc.nextDouble();
        if (valor > Saldo){
            System.out.println("Saldo insuficiente ");
        } else {
            Saldo -= valor;
            System.out.println("Saque de R$: " + valor);
            System.out.println("Saldo atual = R$:" + Saldo);
        }

    }
}
