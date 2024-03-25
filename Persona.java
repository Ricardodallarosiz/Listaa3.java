public class Persona {
    private String nome;
    private char sexo;
    private int idade;
    private String saude;

    public Persona(String nome, char sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApta() {
        return (idade >= 18 && saude.equalsIgnoreCase("boa"));
    }

    public String getSexo() {
        if (sexo == 'M' || sexo == 'm') {
            return "Masculino";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Feminino";
        } else {
            return "Indefinido";
        }
    }
    
}
