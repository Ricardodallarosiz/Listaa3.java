import java.util.Scanner;

public class ProgramaNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.determinarCategoria();

        System.out.println("Categoria do nadador: " + categoria);

        scanner.close(); 
    }
    
}
