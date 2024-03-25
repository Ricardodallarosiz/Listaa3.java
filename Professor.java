public class Professor {
    private String nome;
    private int nivel;
    private double valorHoraAula;

    public Professor(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        setValorHoraAula(); // Configura o valor da hora/aula com base no nível do professor
    }

    private void setValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido. Definindo valor padrão para hora/aula.");
                valorHoraAula = 12.00; // Valor padrão para nível 1
        }
    }

    public double calcularSalario(int horasAula) {
        return horasAula * valorHoraAula;
    }

    public void imprimirSalario(int horasAula) {
        double salario = calcularSalario(horasAula);
        System.out.println("Nome do Professor: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Horas/Aula Trabalhadas: " + horasAula);
        System.out.println("Salário: R$" + salario);
    }
}
