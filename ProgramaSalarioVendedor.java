import java.util.Scanner;

public class ProgramaSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês: R$ ");
        double totalVendas = scanner.nextDouble();

        
        Vendedor vendedor = new Vendedor(nomeVendedor, salarioFixo, totalVendas);

        
        double salarioFinal = vendedor.calcularSalarioFinal();

        
        System.out.println("\nNome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$ " + vendedor.getSalarioFixo());
        System.out.println("Salário no final do mês (com comissão): R$ " + salarioFinal);

        scanner.close(); 
    }
    
}
