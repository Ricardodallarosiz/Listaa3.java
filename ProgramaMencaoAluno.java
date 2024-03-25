import java.util.Scanner;

public class ProgramaMencaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();

        // Criar objeto Aluno
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        // Calcular a média e obter a menção do aluno
        double media = aluno.calcularMedia();
        String mencao = aluno.obterMencao();

        // Exibir o nome do aluno, sua média e sua menção
        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + media);
        System.out.println("Menção: " + mencao);

        scanner.close(); // Fechar o scanner após a leitura
    }
    
}
