public class Pessoa {
    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        if (sexo == 'M' || sexo == 'm') {
            return "Homem";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Mulher";
        } else {
            return "Sexo não especificado";
        }
    }
}
