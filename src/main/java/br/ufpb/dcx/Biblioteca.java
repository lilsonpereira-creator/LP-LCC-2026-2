package br.ufpb.dcx;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        boolean continuar = true;
        while (continuar){
            System.out.println("Digite uma opcão:" +
                    "\n1. Cadastrar livro " +
                    "\n2. Cadastrar usuário " +
                    "\n3. Empréstimo " +
                    "\n4. Devolução " +
                    "\n5. Listar livros " +
                    "\n6. Listar Usuários Cadastrados " +
                    "\n7. Listar Empréstimos");
            String opcao = leitor.nextLine();
            switch (opcao){
                case "1":
                    cadastramentoDeLivros(leitor);
                    break;
                case "2":
                    cadastrarUsuario(leitor);
                    break;
                case "3":
                    emprestimoDelivro(leitor);
                    break;
                case "4":


            }
        }
    }

    private static void emprestimoDelivro(Scanner leitor) {

        System.out.println("O usuário já tem cadastro? ");
        String resposta = leitor.nextLine();
        if(resposta.equalsIgnoreCase("sim")){

        }
    }

    private static void cadastrarUsuario(Scanner leitor) {
        System.out.println("Digite o nome do usuário: ");
        String nomeDoUsuario = leitor.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = leitor.nextLine();
        System.out.println("Digite o nome da rua onde o usuário mora: ");
        String rua = leitor.nextLine();
        System.out.println("Digite o número da residência: ");
        int numero = leitor.nextInt();
        System.out.println("Ditige o nome do bairro: ");
        String bairro = leitor.nextLine();
        System.out.println("Digite o nome da cidade: ");
        String cidade = leitor.nextLine();
        System.out.println("Digite o nome do estado: ");
        String estado = leitor.nextLine();

        CadastrarUsuario novoUsuario = new CadastrarUsuario(nomeDoUsuario, cpf, rua, numero, bairro, cidade, estado);
    }

    private static void cadastramentoDeLivros(Scanner leitor) {

        System.out.println("Digite o nome do autor do livro: ");
        String autor = leitor.nextLine();
        System.out.println("Digite o título do livro: ");
        String titulo = leitor.nextLine();
        System.out.println("Digite o nome da editora: ");
        String editora = leitor.nextLine();
        System.out.println("Digite o ano de publicação do livro: ");
        int anoDePublicacao = leitor.nextInt();

        CadastrarLivro novoLivro = new CadastrarLivro(autor, titulo, editora, anoDePublicacao);

    }
}
