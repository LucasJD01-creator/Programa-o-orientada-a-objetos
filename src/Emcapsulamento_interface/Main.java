package Emcapsulamento_interface;


public class Main {
    public static void main(String[] args) {
        BancoFinanceiro Nubank = new BancoFinanceiro();
        System.out.println("Saldo inicial = R$: " + Nubank.getstatus());
        Nubank.setDepositar();
        Nubank.setSacar();
        System.out.println("Saldo final = R$: " + Nubank.getstatus());
    }
}
