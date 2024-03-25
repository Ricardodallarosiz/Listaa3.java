public class Compra {
    
        private double valorTotal;
    
        public Compra(double valorTotal) {
            this.valorTotal = valorTotal;
        }
    
        public double calcularValorPrestacao() {
            return valorTotal / 5;
        }
    
    
}
