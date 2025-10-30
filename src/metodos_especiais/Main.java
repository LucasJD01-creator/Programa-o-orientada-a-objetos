package metodos_especiais;

public class Main {
    public static void main(String[] args) {
        //criando controle com os valores iniciais
Molde_Controle controle = new Molde_Controle ("Sansung","Branco",false,0,0);

// Exibindo informações
        System.out.println("Controle do climatizador");
        System.out.println("Modelo: " + controle.getModelo());
        System.out.println("Cor: " + controle.getCor());
        System.out.println("Está ligado ?" + controle.isBotao_ON_OF());
        System.out.println("Velocidade atual: " + controle.getBotao_aumentaVelocidade());

        // Ligar climatizador
        controle.setBotao_ON_OF(true);
        System.out.println("\n O climatizador foi ligado");

        // aumenta velocidade
        controle.setBotao_aumentaVelocidade(3);
        System.out.println("A Velocidade foi aumentada para: " + controle.getBotao_aumentaVelocidade());

        // diminui velocidade
        controle.setBotao_diminuiVelocidade(1);
        System.out.println("A velocidade foi reduzida em: " + controle.getBotao_diminuiVelocidade());

        // desligar climatizador
        controle.setBotao_ON_OF(false);
        System.out.println("\n O climatizador foi desligado");
        System.out.println("Esta ligado ?" + controle.isBotao_ON_OF());

    }
}
