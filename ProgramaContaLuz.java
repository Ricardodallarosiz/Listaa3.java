import java.util.Scanner;

public class ProgramaContaLuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de Cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        System.out.print("Digite o tipo de cliente (1, 2 ou 3): ");
        int tipoCliente = scanner.nextInt();

        System.out.print("Digite o consumo em kWh: ");
        double consumoKWh = scanner.nextDouble();

        ContaLuz contaLuz = new ContaLuz(tipoCliente, consumoKWh);
        contaLuz.imprimirValorConta();

        scanner.close(); 
    }
    
}
