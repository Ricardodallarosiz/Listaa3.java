public class ContaLuz {
    private int tipoCliente;
    private double consumoKWh;
    private double valorKWh;

    public ContaLuz(int tipoCliente, double consumoKWh) {
        this.tipoCliente = tipoCliente;
        this.consumoKWh = consumoKWh;
        setValorKWh(); // Configura o valor do kWh com base no tipo de cliente
    }

    private void setValorKWh() {
        switch (tipoCliente) {
            case 1: // Residência
                valorKWh = 0.60;
                break;
            case 2: // Comércio
                valorKWh = 0.48;
                break;
            case 3: // Indústria
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Definindo valor padrão para kWh.");
                valorKWh = 0.60; // Valor padrão para residência
        }
    }

    public double calcularValorConta() {
        return consumoKWh * valorKWh;
    }

    public void imprimirValorConta() {
        System.out.println("Valor da conta de luz: R$" + calcularValorConta());
    }
    
}
