public class PretendenteSeguro {
    private String nome;
    private int idade;
    private int grupoRisco;

    public PretendenteSeguro(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public void determinarCategoria() {
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco >= 1 && grupoRisco <= 3) {
                System.out.println("Categoria: Baixo");
            } else if (grupoRisco >= 4 && grupoRisco <= 6) {
                System.out.println("Categoria: Médio");
            } else {
                System.out.println("Categoria: Alto");
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco >= 2 && grupoRisco <= 4) {
                System.out.println("Categoria: Baixo");
            } else if (grupoRisco >= 5 && grupoRisco <= 7) {
                System.out.println("Categoria: Médio");
            } else {
                System.out.println("Categoria: Alto");
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco >= 3 && grupoRisco <= 5) {
                System.out.println("Categoria: Baixo");
            } else if (grupoRisco >= 6 && grupoRisco <= 8) {
                System.out.println("Categoria: Médio");
            } else {
                System.out.println("Categoria: Alto");
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco >= 4 && grupoRisco <= 6) {
                System.out.println("Categoria: Baixo");
            } else if (grupoRisco >= 7 && grupoRisco <= 9) {
                System.out.println("Categoria: Médio");
            } else {
                System.out.println("Categoria: Alto");
            }
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco >= 7 && grupoRisco <= 9) {
                System.out.println("Categoria: Baixo");
            } else {
                System.out.println("Categoria: Alto");
            }
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }
    }
    
}
