import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sorteador_de_dados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatório = new Random();

        System.out.println("Quantos dados deseja jogar ? ");
        int quantidade = entrada.nextInt();

        System.out.print("\n resultado do lançamento");
        for (int i = 1; i <= quantidade; i++){
            int resultado = aleatório.nextInt(6) + 1;
            System.out.println("Dado " + i + ": " + resultado);
        }
        entrada.close();
    }
}