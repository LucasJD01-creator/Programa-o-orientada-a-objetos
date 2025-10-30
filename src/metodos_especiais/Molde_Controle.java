package metodos_especiais;

public class Molde_Controle {
    private String modelo;
    private String cor;
    private boolean botao_ON_OF;
    private int botao_aumentaVelocidade;
    private int botao_diminuiVelocidade;

// atributos

    public Molde_Controle(String modelo, String cor, boolean botao_ON_OF, int botao_aumentaVelocidade, int botao_diminuiVelocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.botao_ON_OF = botao_ON_OF;
        this.botao_aumentaVelocidade = botao_aumentaVelocidade;
        this.botao_diminuiVelocidade = botao_diminuiVelocidade;
    }

// métodos getter e setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isBotao_ON_OF() {
        return botao_ON_OF;
    }

    public void setBotao_ON_OF(boolean botao_ON_OF) {
        this.botao_ON_OF = botao_ON_OF;
    }

    public int getBotao_aumentaVelocidade() {
        return botao_aumentaVelocidade;
    }

    public void setBotao_aumentaVelocidade(int botao_aumentaVelocidade) {
        this.botao_aumentaVelocidade = botao_aumentaVelocidade;
    }

    public int getBotao_diminuiVelocidade() {
        return botao_diminuiVelocidade;
    }

    public void setBotao_diminuiVelocidade(int botao_diminuiVelocidade) {
        this.botao_diminuiVelocidade = botao_diminuiVelocidade;
    }
}
