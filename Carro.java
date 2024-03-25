public class Carro {
    private double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * 0.45; 
        double precoDistribuidor = custoFabrica + impostos;
        double custoConsumidor = precoDistribuidor * 1.28; 

        return custoConsumidor;
    }
}
