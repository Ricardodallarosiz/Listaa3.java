import java.util.Scanner;

public class ProgramaClassificacaoEstudante {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de matrícula do estudante: ");
        int matricula = scanner.nextInt();

        System.out.print("Digite a primeira nota do estudante: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do estudante: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota do estudante: ");
        double nota3 = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, matricula, nota1, nota2, nota3);
        estudante.imprimirDados();

        scanner.close(); 
    }
    
}
