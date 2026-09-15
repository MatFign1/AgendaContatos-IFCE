# Agenda de Contatos

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos.

O sistema será desenvolvido de forma incremental. Cada versão introduzirá novos conceitos, estruturas e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

## Evolução do projeto

| Versão | Armazenamento | Descrição |
|---|---|---|
| v0.0.0 | Variáveis simples | Permite armazenar apenas um contato |
| v0.1.0 | Arrays | Permite vários contatos com capacidade fixa |
| v0.2.0 | List + ArrayList | Permitirá vários contatos com tamanho dinâmico |

### v0.0.0 — Programação Procedural Básica

Primeira versão da Agenda.

Principais características:

- uma única classe `Principal`;
- todo o código dentro do método `main()`;
- armazenamento de apenas um contato;
- variáveis `nome`, `celular` e `email`;
- menu em console;
- uso de `Scanner`;
- uso de `if-else`;
- uso de `switch-case`;
- uso de `while`;
- funcionalidades:
  - adicionar contato;
  - listar contato;
  - procurar contato;
  - excluir contato;
  - sair.

Nesta versão, um novo contato substitui o contato armazenado anteriormente.

## Versão atual

**v0.1.0**

Nesta versão, a Agenda de Contatos passou a utilizar arrays para armazenar vários contatos.

### Principais conceitos

- Arrays
- Índices
- Estrutura `for`
- Controle de quantidade
- Capacidade fixa
- Pesquisa em arrays
- Exclusão e reorganização dos elementos

### Próximas versões

O projeto continuará evoluindo.
<!-- - `v0.1.0` — armazenamento com Arrays; -->
- `v0.2.0` — armazenamento com List e ArrayList;
- versões posteriores — modularização, classes, encapsulamento, DAO, MVC, Swing, JDBC e banco de dados.

## Controle de versões

As versões estáveis do projeto serão identificadas por tags Git.

Exemplo:

```text
v0.0.0
v0.1.0
v0.2.0