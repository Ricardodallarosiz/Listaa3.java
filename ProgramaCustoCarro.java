import java.util.Scanner;

public class ProgramaCustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        
        Carro carro = new Carro(custoFabrica);

        
        double custoConsumidor = carro.calcularCustoConsumidor();
        System.out.println("\nCusto ao consumidor do carro: R$ " + custoConsumidor);

        scanner.close(); 
    }
}
