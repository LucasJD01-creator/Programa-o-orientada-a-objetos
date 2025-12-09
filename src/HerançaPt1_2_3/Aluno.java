package HerançaPt1_2_3;
//Atributos
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
//Construct
    public Aluno() {
        super();
        this.matricula = matricula;
        this.curso = curso;
    }
//Getters end Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Métodos
    public void setPagarMensalidade(){
        System.out.println("A mensalidade é = R$:300,00");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
