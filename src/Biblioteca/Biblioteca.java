package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Coleção: ArrayList de livros
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Cadastrar novos livros (apenas por funcionário)
    // polimorfismo: recebe um Usuario, mas checa se é Funcionario.
    public boolean cadastrarLivro(Livro livro, Usuario usuario) {
        if (usuario != null && usuario.podeCadastrarLivro()) {
            livros.add(livro);
            System.out.println(usuario.realizarAcao("cadastrou o livro: " + livro.getTitulo()));
            return true;
        } else {
            System.out.println("Usuário não tem permissão para cadastrar livros.");
            return false;
        }
    }

    // Listar livros disponíveis
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro l : livros) {
            if (l.getQuantidade() > 0) {
                disponiveis.add(l);
            }
        }
        return disponiveis;
    }

    // Sobrecarga de metodo: buscarLivro por título (retorna lista)
    public List<Livro> buscarLivro(String titulo) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro l : livros) {
            if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                encontrados.add(l);
            }
        }
        return encontrados;
    }

    // Sobrecarga de metodo: buscarLivro por código (retorna um único livro ou null)
    public Livro buscarLivro(int codigo) {
        for (Livro l : livros) {
            if (l.getCodigo() == codigo) {
                return l;
            }
        }
        return null;
    }

    // Registrar empréstimo de livro para um leitor (operado por um funcionário)
    // Recebe: código do livro, leitor que recebe o empréstimo, e o usuário operador (deve ser funcionário)
    public boolean registrarEmprestimo(int codigoLivro, Leitor leitor, Usuario operador) {
        if (operador == null || !operador.podeCadastrarLivro()) { // reutilizando o método como verificação simples
            System.out.println("Operador sem permissão para registrar empréstimos.");
            return false;
        }

        Livro livro = buscarLivro(codigoLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return false;
        }

        if (livro.emprestar()) {
            System.out.println(operador.realizarAcao(
                    String.format("registrou empréstimo do livro '%s' para %s", livro.getTitulo(), leitor.getNome())
            ));
            return true;
        } else {
            System.out.println("Não há exemplares disponíveis para empréstimo.");
            return false;
        }
    }

    // Registrar devolução (operado por funcionário)
    public boolean registrarDevolucao(int codigoLivro, Leitor leitor, Usuario operador) {
        if (operador == null || !operador.podeCadastrarLivro()) {
            System.out.println("Operador sem permissão para registrar devoluções.");
            return false;
        }

        Livro livro = buscarLivro(codigoLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return false;
        }

        livro.devolver();
        System.out.println(operador.realizarAcao(
                String.format("registrou devolução do livro '%s' por %s", livro.getTitulo(), leitor.getNome())
        ));
        return true;
    }
}