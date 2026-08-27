package br.com.fiapride.model;

public class Teclado {

    private String cor;
    private String formato;

    public Teclado(String cor, String formato) {
        this.cor = cor;
        this.formato = formato;
    }

    public void alterarCor(String novaCor) {

        if (novaCor == null || novaCor.trim().isEmpty()) {
            System.out.println("Erro: a cor não pode ser vazia.");
            return;
        }

        cor = novaCor;

        System.out.println("Cor alterada com sucesso!");
    }

    public void alterarFormato(String novoFormato) {

        if (!novoFormato.equalsIgnoreCase("Retangular")
                && !novoFormato.equalsIgnoreCase("Ergonômico")) {

            System.out.println("Erro: formato inválido.");
            return;
        }

        formato = novoFormato;

        System.out.println("Formato alterado com sucesso!");
    }

    public String getCor() {
        return cor;
    }

    public String getFormato() {
        return formato;
    }
}