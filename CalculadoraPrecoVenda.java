import java.util.Scanner;

public class CalculadoraPrecoVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o preço de custo do produto: R$ ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = scanner.nextDouble();

        
        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);

        
        System.out.println("\nValor de venda do produto: R$ " + valorVenda);

        scanner.close(); 
    }
    
}
