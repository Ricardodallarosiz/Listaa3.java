import java.util.Scanner;

public class ProgramaTipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        System.out.print("Lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.print("Lado 3: ");
        int lado3 = scanner.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipoTriangulo = triangulo.determinarTipoTriangulo();

        System.out.println("O triângulo formado é do tipo: " + tipoTriangulo);

        scanner.close(); 
    }
    
}
