package br.com.fiapride.model;

public class Mouse {

    private String cor;
    private String tipo;
    
    // Construtor
    public Mouse(String cor, String tipo) {
        setCor(cor);
        setTipo(tipo);
    }

    // Métodos de alteração
    public void alterarCor(String novaCor) {
        setCor(novaCor);
        System.out.println("Cor do mouse alterada com sucesso!");
    }

    public void alterarTipo(String novoTipo) {
        setTipo(novoTipo);
        System.out.println("Tipo do mouse alterado com sucesso!");
    }

    // Getters
    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters privados com validação
    private void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("A cor do mouse não pode ser vazia.");
        }

        this.cor = cor;
    }

    private void setTipo(String tipo) {
        if (tipo == null
                || (!tipo.equalsIgnoreCase("Óptico")
                && !tipo.equalsIgnoreCase("Laser"))) {

            throw new IllegalArgumentException("Tipo de mouse inválido.");
        }

        this.tipo = tipo;
    }
}