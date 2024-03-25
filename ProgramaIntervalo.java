import java.util.Scanner;

public class ProgramaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorIntervalo verificador = new VerificadorIntervalo();

        for (int i = 1; i <= 80; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            verificador.verificarNumero(numero);
        }

        int numerosNoIntervalo = verificador.getContadorIntervalo();
        System.out.println("\nQuantidade de números no intervalo [10, 150]: " + numerosNoIntervalo);

        scanner.close(); 
    }
    
}
