import java.util.Scanner;

public class ProgramaSalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivelProfessor = scanner.nextInt();

        System.out.print("Digite a quantidade de horas/aula trabalhadas: ");
        int horasAula = scanner.nextInt();

        Professor professor = new Professor(nomeProfessor, nivelProfessor);
        professor.imprimirSalario(horasAula);

        scanner.close(); 
    }
    
}
