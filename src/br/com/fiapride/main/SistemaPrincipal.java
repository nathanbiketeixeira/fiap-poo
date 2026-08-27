package br.com.fiapride.main;

import br.com.fiapride.model.Teclado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando o objeto Teclado
        Teclado teclado = new Teclado("Preto", "Retangular");

        // Estado inicial
        System.out.println("=== TECLADO ===");
        System.out.println("Cor: " + teclado.getCor());
        System.out.println("Formato: " + teclado.getFormato());

        // Teste 1 - Cor válida
        System.out.println("\n--- Teste 1: Cor válida ---");

        teclado.alterarCor("Branco");

        System.out.println("Cor atual: " + teclado.getCor());

        // Teste 2 - Cor inválida
        System.out.println("\n--- Teste 2: Cor inválida ---");

        teclado.alterarCor("");

        System.out.println("Cor atual: " + teclado.getCor());

        // Teste 3 - Formato válido
        System.out.println("\n--- Teste 3: Formato válido ---");

        teclado.alterarFormato("Ergonômico");

        System.out.println("Formato atual: " + teclado.getFormato());

        // Teste 4 - Formato inválido
        System.out.println("\n--- Teste 4: Formato inválido ---");

        teclado.alterarFormato("Redondo");

        System.out.println("Formato atual: " + teclado.getFormato());

        // Teste 5 - Voltando para o formato Retangular
        System.out.println("\n--- Teste 5: Retangular ---");

        teclado.alterarFormato("Retangular");

        System.out.println("Formato final: " + teclado.getFormato());
    }
}