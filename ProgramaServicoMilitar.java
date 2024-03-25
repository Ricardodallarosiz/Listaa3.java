import java.util.Scanner;

public class ProgramaServicoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAptas = 0;
        int totalInaptas = 0;

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Dados da " + i + "ª pessoa:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Saúde (Boa/Ruim): ");
            String saude = scanner.nextLine();

            Pessoa persona = new Persona(nome, sexo, idade, saude);

            if (persona.estaApta()) {
                System.out.println("Está apta para o serviço militar.");
                totalAptas++;
            } else {
                System.out.println("Não está apta para o serviço militar.");
                totalInaptas++;
            }

            System.out.println();
        }

        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);

        scanner.close(); 
    }
    
}
