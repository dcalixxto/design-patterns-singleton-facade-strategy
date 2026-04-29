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
|   `-- src/
|       `-- Main.java
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

O diretorio `singleton/src` contem o arquivo:

- `singleton/src/Main.java`

No estado atual do repositorio, esse arquivo esta vazio e ainda nao possui implementacao do exemplo.

## Integrantes do grupo

- Daniel
- Hamilton
- Lucas Eduardo
- Joao Alberto
- Vinicius
- Matheus Souza Lima
