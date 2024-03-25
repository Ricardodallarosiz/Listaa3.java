import java.util.Scanner;

public class ProgramaConsumoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        
        Automovel automovel = new Automovel(distancia, combustivel);

        
        ConsumoMedio consumoMedio = new ConsumoMedio();
        double consumo = consumoMedio.calcularConsumoMedio(automovel);

        
        System.out.println("\nO consumo médio do automóvel é: " + consumo + " km/l");

        scanner.close(); 
    }
}
