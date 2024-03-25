import java.util.Scanner;

public class ProgramaPrestacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        
        Compra compra = new Compra(valorCompra);

        
        double valorPrestacao = compra.calcularValorPrestacao();
        System.out.println("\nValor de cada prestação (5x sem juros): R$ " + valorPrestacao);

        scanner.close(); 
    }
}
