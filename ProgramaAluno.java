import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        
        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);
        double media = aluno.calcularMedia();

        
        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Média aritmética: " + media);

        scanner.close(); 
    }
    
}
