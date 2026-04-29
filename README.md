# Design Patterns: Singleton, Facade e Strategy

Este repositorio contem exemplos praticos dos padroes de projeto `Singleton`, `Facade` e `Strategy`, desenvolvidos para a disciplina de Arquitetura e Construcao de Software.

## Objetivo

O projeto organiza tres padroes da GoF em diretorios separados:

- `Singleton` - padrao criacional
- `Facade` - padrao estrutural
- `Strategy` - padrao comportamental

Cada pasta concentra o codigo-fonte do respectivo exemplo.

## Estrutura do repositorio

```text
.
|-- README.md
|-- .gitignore
|-- singleton/
|   |-- pom.xml
|   `-- src/
|       `-- example/
|           |-- GerenciadorConexao.java
|           `-- Main.java
|-- facade/
|   `-- src/
|       |-- main.ts
|       |-- facade/
|       |   `-- cliente-facade.ts
|       `-- models/
|           |-- cliente.ts
|           |-- cliente-avatar.ts
|           |-- cliente-documentos.ts
|           |-- cliente-email.ts
|           |-- cliente-historico-acesso.ts
|           `-- cliente-service.ts
`-- strategy/
    `-- src/
        |-- Main.java
        |-- CalculadoraDeFrete.java
        |-- EstrategiaFrete.java
        |-- FretePorTransportadora.java
        |-- FreteViaPAC.java
        `-- FreteViaSedex.java
```

## Sobre cada exemplo

### Facade

O exemplo em `facade/src` simula um sistema de clientes com uma fachada que centraliza operacoes relacionadas a conta, avatar, documentos, email e historico de acesso.

Arquivo principal:

- `facade/src/main.ts`

Arquivos relacionados:

- `facade/src/facade/cliente-facade.ts`
- `facade/src/models/cliente.ts`
- `facade/src/models/cliente-avatar.ts`
- `facade/src/models/cliente-documentos.ts`
- `facade/src/models/cliente-email.ts`
- `facade/src/models/cliente-historico-acesso.ts`
- `facade/src/models/cliente-service.ts`

### Strategy

O exemplo em `strategy/src` demonstra a troca de estrategias de calculo de frete em tempo de execucao.

Arquivo principal:

- `strategy/src/Main.java`

Estrategias e classes de apoio:

- `strategy/src/CalculadoraDeFrete.java`
- `strategy/src/EstrategiaFrete.java`
- `strategy/src/FretePorTransportadora.java`
- `strategy/src/FreteViaPAC.java`
- `strategy/src/FreteViaSedex.java`

### Singleton

O exemplo em `singleton/src/example` demonstra o padrao Singleton aplicado a um gerenciador de conexao com inicializacao unica da instancia.

Arquivos do modulo:

- `singleton/pom.xml`
- `singleton/src/example/GerenciadorConexao.java`
- `singleton/src/example/Main.java`

Arquivos gerados em compilacao:

- `singleton/target/classes/org/example/GerenciadorConexao.class`
- `singleton/target/classes/org/example/Main.class`

## Integrantes do grupo

- Daniel
- Hamilton
- Lucas Eduardo
- Joao Alberto
- Vinicius
- Matheus Souza Lima
