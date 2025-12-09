package HerançaPt1_2_3;
//Atributos
public class Bolsista extends Pessoa{
    private int bolsa;
//construct
    public Bolsista() {
        super();
        this.bolsa = bolsa;
    }
// getters end setters
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    //Métodos
    public void setrenovarBolsa(){
        System.out.println("Hora de renovar a bolsa! ");
    }

    public void setpagarMensalidade(){
        System.out.println("Hora de pagar a mensalidade! ");
    }

    //Métodos
    public void renovarBolsa() {
        System.out.println("Bolsa renovada de " + getNome());
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa=" + bolsa +
                '}';
    }
}
