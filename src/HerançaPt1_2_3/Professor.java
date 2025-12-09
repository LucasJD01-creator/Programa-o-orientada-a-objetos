package HerançaPt1_2_3;
//atributos
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
//Constructo
    public Professor() {
        super();
        this.especialidade = especialidade;
        this.salario = salario;
    }
//Getters end Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    //Métodos
    public  void setReceberAlmento(){
        System.out.println("Vai estudar ? ");
    }

// métodos
    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
