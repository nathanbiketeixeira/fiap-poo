# FIAP POO - Teclado

Projeto desenvolvido para as aulas de Programação Orientada a Objetos (POO) da FIAP.

## Objeto escolhido

O objeto escolhido para o projeto é um Teclado.

A classe `Teclado` possui os seguintes atributos:

- `cor`: String
- `formato`: String
- `modelo`: String
- `idioma`: String

Todos os atributos são privados, seguindo o conceito de encapsulamento.

## Aulas desenvolvidas

### Aula 1 - Classes e Objetos

Foi criada a classe `Teclado`, representando o objeto escolhido para o projeto.

Foram definidos seus atributos e realizada a criação de um objeto da classe no sistema principal.

### Aula 2 - Métodos e Comportamentos

Foram adicionados métodos para alterar os dados do teclado:

- `alterarCor()`
- `alterarFormato()`

Os métodos possuem regras de validação para impedir valores inválidos.

Também foram realizados testes com valores válidos e inválidos.

### Aula 3 - Encapsulamento

Os atributos da classe foram definidos como `private`.

Foram adicionados getters públicos para permitir a consulta dos atributos:

- `getCor()`
- `getFormato()`
- `getModelo()`
- `getIdioma()`

Os setters foram definidos como `private`, protegendo a alteração direta dos atributos.

As alterações são realizadas por meio de métodos públicos de comportamento.

### Aula 4 - Construtores

Foi criado um construtor para a classe `Teclado`.

O construtor recebe os três atributos principais:

- `cor`
- `formato`
- `modelo`

O atributo `idioma` recebe inicialmente o valor padrão `"Português"`.

O construtor utiliza os métodos privados de definição dos atributos, mantendo as regras de validação e o encapsulamento.

Também foram adicionados comportamentos para alteração de:

- cor
- formato
- modelo
- idioma

Todos os atributos possuem regras de validação.

### Aula 5 - Associação de Objetos

Foi criada a classe `Mouse` e realizada uma associação entre `Teclado` e `Mouse`.

A classe `Teclado` possui um objeto `Mouse` como atributo:

- `mouse`: Mouse

O construtor do `Teclado` foi atualizado para receber o objeto `Mouse`.

Também foi criado o método `getMouse()`, permitindo acessar os dados do mouse associado.

No `SistemaPrincipal`, foi realizado um teste da associação, acessando dados do mouse através do teclado.

Exemplo:

`teclado.getMouse().getCor()`

Esse teste demonstra a comunicação entre os objetos e o conceito de associação.

A classe `Mouse` possui os atributos:

- `cor`: String
- `tipo`: String

Também foram adicionados métodos para alteração e consulta desses atributos, com validações.

## Validações

### Cor

A cor não pode ser nula ou vazia.

### Formato

O formato deve ser:

- Retangular
- Ergonômico

### Modelo

O modelo não pode ser nulo ou vazio.

### Idioma

O idioma não pode ser nulo ou vazio.

## Testes

O arquivo `SistemaPrincipal.java` realiza testes com valores válidos e inválidos.

Foram testados:

- Alteração de cor válida
- Alteração de cor inválida
- Alteração de formato válida
- Alteração de formato inválida
- Alteração de modelo válida
- Alteração de modelo inválida
- Alteração de idioma válida
- Alteração de idioma inválida

Os testes demonstram que as regras de validação estão funcionando corretamente.

## Estrutura do projeto

```text
fiap-poo
├── src
│   └── br.com.fiapride
│       ├── main
│       │   └── SistemaPrincipal.java
│       └── model
│           └── Teclado.java
├── README.md
└── Teclado.asta
