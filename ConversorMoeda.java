public class ConversorMoeda {
    private double cotacaoDolar;

    public ConversorMoeda(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * cotacaoDolar;
    }
    
}
