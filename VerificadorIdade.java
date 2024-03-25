public class VerificadorIdade {
    private int idade;

    public VerificadorIdade(int idade) {
        this.idade = idade;
    }

    public String verificarMaioridade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
    
}
