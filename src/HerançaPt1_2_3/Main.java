package HerançaPt1_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== TESTE PESSOA =====");
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(30);
        p1.setSexo("Feminino");
        System.out.println(p1);

        System.out.println("\n===== TESTE VISITANTE =====");
        Visitante v1 = new Visitante();
        v1.setNome("Carlos");
        v1.setIdade(40);
        v1.setSexo("Masculino");
        System.out.println(v1);

        System.out.println("\n===== TESTE ALUNO =====");
        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setIdade(20);
        a1.setSexo("Masculino");
        a1.setMatricula(15888);
        a1.setCurso("Informática");
        a1.setPagarMensalidade();
        System.out.println(a1);

        System.out.println("\n===== TESTE PROFESSOR =====");
        Professor prof1 = new Professor();
        prof1.setNome("Ana Paula");
        prof1.setIdade(45);
        prof1.setSexo("Feminino");
        prof1.setEspecialidade("Programação");
        prof1.setSalario(5000);
        prof1.receberAumento(1000);
        System.out.println(prof1);


        System.out.println("\n===== TESTE BOLSISTA =====");
        Bolsista b1 = new Bolsista();
        b1.setNome("Lara");
        b1.setIdade(19);
        b1.setSexo("Feminino");
        b1.setBolsa(1200);
        b1.renovarBolsa();
        System.out.println(b1);

        System.out.println("\n===== TESTE TÉCNICO =====");
        Técnico t1 = new Técnico();
        t1.setNome("Pedro");
        t1.setIdade(22);
        t1.setSexo("Masculino");
        t1.setRegistroProfissional(55524);
        t1.praticar();
        System.out.println(t1);
    }
}