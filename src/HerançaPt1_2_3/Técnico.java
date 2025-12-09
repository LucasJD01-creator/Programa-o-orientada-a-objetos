package HerançaPt1_2_3;

//Atributos
public class Técnico extends Pessoa {
    private int registroProfissional;
    // construct
    public Técnico() {
        super();
        this.registroProfissional = registroProfissional;
    }
    //getters end setters
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    //Métodos

    public void praticar() {
        System.out.println(getNome() + " está praticando atividades técnicas.");
    }

    @Override
    public String toString() {
        return "Técnico{" +
                "registroProfissional=" + registroProfissional +
                '}';
    }
}
