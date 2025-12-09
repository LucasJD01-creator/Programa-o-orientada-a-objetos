package Relacionamento_EntreClasses;

public class Main {
    public static void main(String[] args) {

        Mago mago_um = new Mago("Gandalf", "Fogo");
        Mago mago_dois = new Mago("Dumbledore", "Gelo");

        DueloDeMagia duelo = new DueloDeMagia(mago_um, mago_dois);
        duelo.iniciarDuelo();
    }
}