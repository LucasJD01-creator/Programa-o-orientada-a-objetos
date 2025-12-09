package Relacionamento_EntreClasses;

import java.util.Scanner;

public class DueloDeMagia {

    private Mago mago_um;
    private Mago mago_dois;
    private Scanner entrada = new Scanner(System.in);

    public DueloDeMagia (Mago mago_um, Mago mago_dois) {
        this.mago_um = mago_um;
        this.mago_dois = mago_dois;
    }

    public void iniciarDuelo() {
        System.out.println("===== INÍCIO DO DUELO =====");
        System.out.println(mago_um.getNome() + "  VS  " + mago_dois.getNome());

        int turno = 1;

        while (mago_um.estaVivo() && mago_dois.estaVivo()) {

            System.out.println("\n===== TURNO " + turno + " =====");

            realizarTurno(mago_um, mago_dois);
            if (!mago_dois.estaVivo()) break;

            realizarTurno(mago_dois, mago_um);
            if (!mago_um.estaVivo()) break;

            turno++;
        }

        anunciarVencedor();
    }

    private void realizarTurno(Mago atacante, Mago defensor) {
        System.out.println("\nVez do Mago " + atacante.getNome());
        atacante.exibirStatus();

        System.out.println("Escolha a ação:");
        System.out.println("1 - Lançar Feitiço");
        System.out.println("2 - Meditar");
        System.out.print("Ação: ");

        int acao = entrada.nextInt();

        if (acao == 1) {
            atacante.lançarFeitiço(defensor);
        }
        else if (acao == 2) {
            atacante.meditar();
        }
        else {
            System.out.println("Opção inválida! Você perdeu o turno!");
        }
    }

    private void anunciarVencedor() {
        System.out.println("\n===== FIM DO DUELO =====");

        if (mago_um.estaVivo()) {
            System.out.println("Vencedor: " + mago_um.getNome());
        } else {
            System.out.println("Vencedor: " + mago_dois.getNome());
        }
    }
}