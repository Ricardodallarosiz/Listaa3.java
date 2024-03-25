public class ProgramaMaiorMenorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            VerificadorIdade verificador = new VerificadorIdade(idade);
            String mensagem = verificador.verificarMaioridade();

            System.out.println("Pessoa " + i + ": " + mensagem);
        }

        scanner.close(); 
    }
}