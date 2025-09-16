import java.util.Scanner;

public class CadastroProduto {

    // Atributos do produto
    private String nome;
    private double preco;

    // Construtor
    public CadastroProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Produto ---");

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        CadastroProduto produto = new CadastroProduto(nomeProduto, precoProduto);

        System.out.println("\n--- Dados do Produto Cadastrado ---");
        produto.exibirDados();

        scanner.close();
    }
}
