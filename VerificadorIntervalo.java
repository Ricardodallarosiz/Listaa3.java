public class VerificadorIntervalo {
    private int contadorIntervalo;

    public VerificadorIntervalo() {
        this.contadorIntervalo = 0;
    }

    public void verificarNumero(int numero) {
        if (numero >= 10 && numero <= 150) {
            contadorIntervalo++;
        }
    }

    public int getContadorIntervalo() {
        return contadorIntervalo;
    }
    
}
