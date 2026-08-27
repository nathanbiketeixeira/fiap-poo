# Projeto FiapRide - Teclado

## Sobre o projeto

Este projeto representa um teclado utilizando conceitos de Programação Orientada a Objetos.

O objeto Teclado representa um teclado do mundo real e possui informações sobre sua cor e seu formato.

## Atributos

A classe Teclado possui os seguintes atributos:

- `cor`: representa a cor do teclado.
- `formato`: representa o formato do teclado.

Ambos os atributos são do tipo `String`.

## Métodos

### alterarCor()

O método `alterarCor()` permite alterar a cor do teclado.

Regra de negócio:
- A cor não pode ser vazia ou nula.

Exemplo:

```java
teclado.alterarCor("Branco");