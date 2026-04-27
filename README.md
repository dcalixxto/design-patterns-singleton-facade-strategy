# Design Patterns: Singleton, Facade e Strategy

Este repositório contém implementações práticas dos padrões de projeto **Singleton**, **Facade** e **Strategy**, desenvolvidas para a disciplina de **Arquitetura e Construção de Software**.

## Objetivo

O objetivo deste repositório é apresentar, de forma prática e organizada, três padrões de projeto da GoF (Gang of Four), pertencentes a diferentes categorias:

- **Singleton** → Criacional
- **Facade** → Estrutural
- **Strategy** → Comportamental

Cada padrão possui seu próprio diretório com código-fonte, exemplo de uso e explicação básica.

---
# Aplicação do Design Pattern FACADE

Esse é apenas um exemplo prático de como identificar e aplicar o padrão de projeto *Facade*.
Simulamos nesse exemplo um pedaço de um Sistema de Controle de Clientes em que teria algumas classes de controle para: Avatar, Envio de Email, Banco de Dados, Documentos, etc.

Nesse projeto estamos utilizando a linguagem TypeScript e execução através do Deno porém o conceito pode ser aplicado a qualquer linguagem com suporte ao paradigma de orientação a objetos.

## Estrutura do repositório

```bash
.
│
├── README.md
├── .gitignore
├── singleton/
│   └── src/
│       └── Main.java
│
├── facade/
│   └── src/
│       └── main.ts
│       └── models/
│           └── cliente.ts
│           └── client-avatar.ts
│           └── cliente-documentos.ts
│           └── cliente-email.ts
│           └── cliente-historico-acesso.ts
│           └── cliente-service.ts
│       └── facade/
│           └── cliente-facade.ts
│
└── strategy/
    └── src/
        └── Main.java
```

## Integrantes do grupo
- Daniel
- Hamilton
- Lucas Eduardo
- João Alberto
- Vinicius
- Matheus Souza Lima
