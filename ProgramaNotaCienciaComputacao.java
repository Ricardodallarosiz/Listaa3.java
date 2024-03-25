import java.util.Scanner;

public class ProgramaNotaCienciaComputacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = scanner.nextDouble();

        EstudanteCienciaComputacao estudante = new EstudanteCienciaComputacao(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        estudante.imprimirNotaFinal();

        scanner.close(); // Fechar o scanner após a leitura
    }
    
}
