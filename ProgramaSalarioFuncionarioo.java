import java.util.Scanner;

public class ProgramaSalarioFuncionarioo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioFixo);
        funcionario.mostrarDados();

        scanner.close(); 
    }
    
}
