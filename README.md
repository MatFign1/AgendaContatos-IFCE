# Agenda de Contatos

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos.

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

## Evolução do projeto

| Versão | Armazenamento | Descrição |
|---|---|---|
| v0.0.0 | Variáveis simples | Permite armazenar apenas um contato por vez |
| v0.1.0 | Arrays (Vetores) | Permite vários contatos com capacidade fixa |
| v0.2.0 | List + ArrayList | Permite vários contatos com tamanho dinâmico |
| v0.3.0 | List + ArrayList | Adiciona a funcionalidade de alteração de contatos |
| v1.0.0 | List + ArrayList | Modularização do código em métodos e pacotes |

### v0.0.0 — Programação Procedural Básica

Primeira versão da Agenda.

Principais características:

- uso de variáveis simples (`String`) para `nome`, `celular` e `email`;
- armazenamento em memória estática de apenas um contato por vez;
- controle de menu em console via `Scanner` e `switch-case`;
- estrutura de repetição para navegação do menu;
- funcionalidades:
  - adicionar contato;
  - listar contato;
  - procurar contato (com `equalsIgnoreCase`);
  - excluir contato (limpando o valor das variáveis);
  - sair.

Nesta versão, um novo contato substitui o contato armazenado anteriormente.

### v0.1.0 — Arrays e Capacidade Fixa

Segunda versão da Agenda.

Principais características:

- substituição de variáveis simples por arrays paralelos (`String[]`);
- controle de capacidade máxima pré-definida (`capacidade = 2`);
- uso de contador de controle (`cont`) para mapeamento do limite;
- varredura e busca sequencial nos vetores com a estrutura `for`;
- remoção de elementos com reorganização física do array (deslocamento/shift para evitar posições `null`).

### v0.2.0 — Armazenamento Dinâmico com ArrayList

Terceira versão da Agenda.

Principais características:

- transição para a API de Coleções do Java (`List` e `ArrayList`);
- remoção dos vetores fixos e do limite pré-determinado de capacidade;
- utilização dos métodos nativos `.add()`, `.get()`, `.size()` e `.remove()`;
- alocação e redimensionamento dinâmico sem necessidade de deslocamento manual.

### v0.3.0 — Alteração de Contatos & Boas Práticas

Quarta versão da Agenda.

Principais características:

- inclusão do CRUD completo (Create, Read, Update, Delete);
- nova opção no menu: **Alterar contato**;
- atualização de registros através do método `.set(posicao, novoValor)`;
- reajuste na numeração do menu e encerramento do recurso via `sc.close()`.

## Versão atual

**v1.0.0 — Modularização e Organização do Código**

Nesta versão, a Agenda de Contatos passou pela primeira refatoração arquitetural, organizando o código procedural em métodos especialistas e pacotes.

### Principais características e conceitos

- **Estruturação em Pacotes:** Organização do código sob o pacote `br.edu.principal`;
- **Modularização:** Separação das responsabilidades do método `main` em métodos `public static` (`adicionar`, `listar`, `pesquisar`, `atualizar`, `excluir`, `mostrarMenu`, etc.);
- **Sintaxe Moderna:** Uso de *Switch Expressions* (`->`) para um fluxo mais limpo e sem a necessidade de múltiplos `break`.

### Próximas versões

O projeto continuará evoluindo.
<!-- - `v0.0.0` — armazenamento simples com variáveis; -->
<!-- - `v0.1.0` — armazenamento com Arrays; -->
<!-- - `v0.2.0` — armazenamento com List e ArrayList; -->
<!-- - `v0.3.0` — funcionalidade de alterar contato; -->
<!-- - `v1.0.0` — modularização e switch expressions; -->
- `v2.0.0` e posteriores — introdução de Orientação a Objetos (classe `Contato`), encapsulamento, persistência de dados (DAO/Banco de Dados) e interface gráfica.

## Controle de versões

As versões estáveis do projeto são identificadas por tags Git.

Exemplo:

```text
v0.0.0
v0.1.0
v0.2.0
v0.3.0
v1.0.0