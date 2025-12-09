package Relacionamento_EntreClasses;

public class Mago {
    private String nome;
    private int mana;
    private int poderMagico;
    private int vida;
    private String elemento;

//Constructor
    public Mago(String nome, String elemento) {
        this.nome = nome;
        this.elemento = elemento;
        this.mana = 100;
        this.poderMagico = 50;
        this.vida = 200;
    }
//Getters e Stters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    // Ações do Mago
    public boolean lançarFeitiço(Mago alvo) {
        if (mana < 30) {
            System.out.println(nome + " tentou lançar feitiço, mas não tem mana suficiente!");
            return false;
        }

        mana -= 30;
        alvo.receberDano(poderMagico);

        System.out.println(nome + " lançou um feitiço e causou " + poderMagico + " de dano em " + alvo.getNome());
        return true;
    }

    public void meditar() {
        mana += 40;
        System.out.println(nome + " meditou e recuperou 40 de mana.");
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void exibirStatus() {
        System.out.println(" STATUS do Mago " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Poder Mágico: " + poderMagico);
        System.out.println("Elemento: " + elemento);
    }
}
