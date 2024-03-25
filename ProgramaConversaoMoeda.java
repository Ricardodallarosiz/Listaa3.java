public class ProgramaConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a cotação do dólar (em reais): R$ ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: US$ ");
        double valorDolar = scanner.nextDouble();

        
        ConversorMoeda conversorMoeda = new ConversorMoeda(cotacaoDolar);

        
        double valorReal = conversorMoeda.converterDolarParaReal(valorDolar);

        
        System.out.println("\nValor em dólar: US$ " + valorDolar);
        System.out.println("Cotação do dólar: R$ " + cotacaoDolar);
        System.out.println("Valor em reais: R$ " + valorReal);

        scanner.close(); 
    }
}