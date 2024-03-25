public class Professor {
    private String nome;
    private int nivel;
    private double valorHoraAula;

    public Professor(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        setValorHoraAula(); 
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
                valorHoraAula = 12.00; 
        }
    
}
}
