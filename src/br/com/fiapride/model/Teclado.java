package br.com.fiapride.model;

public class Teclado {

    private String cor;
    private String formato;
    private String modelo;
    private String idioma;

    // Construtor
    public Teclado(String cor, String formato, String modelo) {
        setCor(cor);
        setFormato(formato);
        setModelo(modelo);
        setIdioma("Português");
    }

    // Métodos de alteração
    public void alterarCor(String novaCor) {
        setCor(novaCor);
        System.out.println("Cor alterada com sucesso!");
    }

    public void alterarFormato(String novoFormato) {
        setFormato(novoFormato);
        System.out.println("Formato alterado com sucesso!");
    }

    public void alterarModelo(String novoModelo) {
        setModelo(novoModelo);
        System.out.println("Modelo alterado com sucesso!");
    }

    public void alterarIdioma(String novoIdioma) {
        setIdioma(novoIdioma);
        System.out.println("Idioma alterado com sucesso!");
    }

    // Getters
    public String getCor() {
        return cor;
    }

    public String getFormato() {
        return formato;
    }

    public String getModelo() {
        return modelo;
    }

    public String getIdioma() {
        return idioma;
    }

    // Setters privados com validação
    private void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser vazia.");
        }

        this.cor = cor;
    }

    private void setFormato(String formato) {
        if (formato == null
                || (!formato.equalsIgnoreCase("Retangular")
                && !formato.equalsIgnoreCase("Ergonômico"))) {

            throw new IllegalArgumentException("Formato inválido.");
        }

        this.formato = formato;
    }

    private void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        }

        this.modelo = modelo;
    }

    private void setIdioma(String idioma) {
        if (idioma == null || idioma.trim().isEmpty()) {
            throw new IllegalArgumentException("O idioma não pode ser vazio.");
        }

        this.idioma = idioma;
    }
}