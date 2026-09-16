package br.com.fiapride.main;

import br.com.fiapride.model.Teclado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criação do objeto utilizando o construtor
        Teclado teclado = new Teclado(
                "Preto",
                "Retangular",
                "Gamer RGB"
        );

        // Exibindo os dados iniciais
        System.out.println("=== DADOS INICIAIS ===");
        System.out.println("Cor: " + teclado.getCor());
        System.out.println("Formato: " + teclado.getFormato());
        System.out.println("Modelo: " + teclado.getModelo());
        System.out.println("Idioma: " + teclado.getIdioma());

        // Alterando a cor
        System.out.println("\n=== ALTERANDO COR ===");
        teclado.alterarCor("Branco");
        System.out.println("Nova cor: " + teclado.getCor());

        // Testando cor inválida
        System.out.println("\n=== TESTANDO COR INVÁLIDA ===");
        try {
            teclado.alterarCor("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Alterando formato
        System.out.println("\n=== ALTERANDO FORMATO ===");
        teclado.alterarFormato("Ergonômico");
        System.out.println("Novo formato: " + teclado.getFormato());

        // Testando formato inválido
        System.out.println("\n=== TESTANDO FORMATO INVÁLIDO ===");
        try {
            teclado.alterarFormato("Redondo");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Alterando modelo
        System.out.println("\n=== ALTERANDO MODELO ===");
        teclado.alterarModelo("Mecânico RGB");
        System.out.println("Novo modelo: " + teclado.getModelo());

        // Testando modelo inválido
        System.out.println("\n=== TESTANDO MODELO INVÁLIDO ===");
        try {
            teclado.alterarModelo("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Alterando idioma
        System.out.println("\n=== ALTERANDO IDIOMA ===");
        teclado.alterarIdioma("Inglês");
        System.out.println("Novo idioma: " + teclado.getIdioma());

        // Testando idioma inválido
        System.out.println("\n=== TESTANDO IDIOMA INVÁLIDO ===");
        try {
            teclado.alterarIdioma("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}