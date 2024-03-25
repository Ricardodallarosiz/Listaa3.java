import java.util.Scanner;

public class ProgramaGeneroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da " + i + "ª pessoa (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            Pessoa pessoa = new Pessoa(nome, sexo);
            String genero = pessoa.getSexo();

            System.out.println("Nome: " + pessoa.getNome() + " - Sexo: " + genero);

            if (genero.equals("Homem")) {
                totalHomens++;
            } else if (genero.equals("Mulher")) {
                totalMulheres++;
            }
        }

        System.out.println("\nTotal de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close(); 
    }
    
}
