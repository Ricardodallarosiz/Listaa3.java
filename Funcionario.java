public class Funcionario {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        if (sexo == 'M' && idade >= 30) {
            return 100.00;
        } else if (sexo == 'M' && idade < 30) {
            return 50.00;
        } else if (sexo == 'F' && idade >= 30) {
            return 200.00;
        } else if (sexo == 'F' && idade < 30) {
            return 80.00;
        } else {
            return 0.00; // Não há abono para outras combinações de sexo e idade
        }
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }

    public void mostrarDados() {
        double salarioLiquido = calcularSalarioLiquido();
        System.out.println("Nome: " + nome);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
    
}
