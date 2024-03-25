public class Automovel {
    private double distanciaPercorrida;
    private double combustivelGasto;

    public Automovel(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }
    
}
