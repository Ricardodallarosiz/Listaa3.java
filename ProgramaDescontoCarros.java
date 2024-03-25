public class ProgramaDescontoCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;
        do {
            System.out.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); 

            Carro carro = new Carro(ano);
            double desconto = carro.calcularDesconto();

            System.out.println("Desconto: " + (desconto * 100) + "%");

            totalGeral++;
            if (ano <= 2000) {
                totalCarrosAte2000++;
            }

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.nextLine().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nTotal de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close(); 
    }
}