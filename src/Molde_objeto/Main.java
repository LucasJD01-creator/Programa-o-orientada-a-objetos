import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // cria o leitor do terminal
        Scanner entrada = new Scanner(System.in);

        int g;
        System.out.print("Digite um valor para 'g': ");

// le valor digita e armazena em g
        g = entrada.nextInt();

        System.out.println("O valor de 'g' é:" + g);
       //System.out.print Não pula linha
        //System.out.println Pula linha
    }
}



