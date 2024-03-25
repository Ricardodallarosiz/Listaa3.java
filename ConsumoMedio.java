public class ConsumoMedio {
    public double calcularConsumoMedio(Automovel automovel) {
        return automovel.getDistanciaPercorrida() / automovel.getCombustivelGasto();
    }
    
}
