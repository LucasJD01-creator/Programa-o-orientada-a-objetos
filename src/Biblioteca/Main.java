package Biblioteca;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando usuários (Herança: Leitor e Funcionario são Usuário)
        Funcionario funcionario = new Funcionario(1, "Ana", "Bibliotecaria");
        Leitor leitor1 = new Leitor(2, "Carlos", "Rua A, 123");

        // Cadastrar livros (apenas funcionário pode cadastrar)
        biblioteca.cadastrarLivro(new Livro("Java Como Programar", "Deitel", 2019, 1001, 3), funcionario);
        biblioteca.cadastrarLivro(new Livro("Algoritmos e Estruturas de Dados", "Cormen", 2009, 1002, 2), funcionario);
        biblioteca.cadastrarLivro(new Livro("Padrões de Projeto", "Gamma et al.", 1995, 1003, 1), funcionario);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n== Biblioteca ==");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Buscar livro por título");
            System.out.println("3 - Buscar livro por código");
            System.out.println("4 - Registrar empréstimo (feito por funcionário)");
            System.out.println("5 - Registrar devolução (feito por funcionário)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    List<Livro> disponiveis = biblioteca.listarLivrosDisponiveis();
                    System.out.println("Livros disponíveis:");
                    for (Livro l : disponiveis) {
                        System.out.println(l);
                    }
                    break;
                case "2":
                    System.out.print("Digite parte do título: ");
                    String termo = scanner.nextLine();
                    List<Livro> encontrados = biblioteca.buscarLivro(termo); // Sobrecarga: buscar por título
                    System.out.println("Resultados:");
                    for (Livro l : encontrados) {
                        System.out.println(l);
                    }
                    break;
                case "3":
                    System.out.print("Digite o código do livro: ");
                    try {
                        int codigo = Integer.parseInt(scanner.nextLine());
                        Livro livro = biblioteca.buscarLivro(codigo); // Sobrecarga: buscar por código
                        System.out.println(livro != null ? livro : "Livro não encontrado.");
                    } catch (NumberFormatException e) {
                        System.out.println("Código inválido.");
                    }
                    break;
                case "4":
                    System.out.print("Digite o código do livro para emprestar: ");
                    try {
                        int codigoE = Integer.parseInt(scanner.nextLine());
                        // Aqui simulamos que o operador é o funcionário criado acima.
                        biblioteca.registrarEmprestimo(codigoE, leitor1, funcionario);
                    } catch (NumberFormatException e) {
                        System.out.println("Código inválido.");
                    }
                    break;
                case "5":
                    System.out.print("Digite o código do livro para devolver: ");
                    try {
                        int codigoD = Integer.parseInt(scanner.nextLine());
                        biblioteca.registrarDevolucao(codigoD, leitor1, funcionario);
                    } catch (NumberFormatException e) {
                        System.out.println("Código inválido.");
                    }
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
        System.out.println("Encerrando sistema da biblioteca.");
    }
}