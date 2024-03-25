public class Carroo {
    private int ano;

    public Carroo(int ano) {
        this.ano = ano;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12; 
        } else {
            return 0.07; 
        }
    }
    
}
