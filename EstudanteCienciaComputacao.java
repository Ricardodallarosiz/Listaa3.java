public class EstudanteCienciaComputacao {
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;
    private double pesoLaboratorio = 2;
    private double pesoAvaliacaoSemestral = 3;
    private double pesoExameFinal = 5;

    public EstudanteCienciaComputacao(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral +
                notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
    }

    public void imprimirNotaFinal() {
        double notaFinal = calcularNotaFinal();
        System.out.println("Nota Final: " + notaFinal);
    
}
