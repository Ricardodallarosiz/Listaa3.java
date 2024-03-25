import java.util.Scanner;

public class ProgramaSeguradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o grupo de risco do pretendente (1 a 9): ");
        int grupoRisco = scanner.nextInt();

        PretendenteSeguro pretendente = new PretendenteSeguro(nome, idade, grupoRisco);
        pretendente.determinarCategoria();

        scanner.close(); // Fechar o scanner após a leitura
    }
    
}
