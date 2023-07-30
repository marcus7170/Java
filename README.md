Lista de Contatos em Java
=========================

Este é um programa simples em Java que permite a criação de uma lista de contatos. Ele oferece as seguintes funcionalidades:

1. Adicionar um novo contato.
2. Listar todos os contatos.
3. Exibir a lista completa de contatos em ordem alfabética pelo nome.
4. Buscar um contato pelo nome.
5. Remover um contato pelo nome.

Descrição do código
-------------------

O programa é composto por duas classes: `Contato` e `ListaContatos`.

A classe `Contato` representa um único contato, com nome, telefone e email. Ela possui um construtor que inicializa os atributos e um método `toString()` que retorna uma string com as informações do contato.

A classe `ListaContatos` é a classe principal do programa. Ela possui uma lista de contatos (representada por um objeto da classe `ArrayList`) e um objeto `Scanner` para ler a entrada do usuário.

O programa utiliza um laço de repetição `do-while` para exibir o menu de opções e realizar as operações escolhidas pelo usuário. As opções são:

- Adicionar um novo contato: o programa lê o nome, telefone e email do usuário e cria um novo objeto `Contato` com essas informações. O contato é adicionado à lista de contatos.
- Listar todos os contatos: o programa verifica se a lista de contatos está vazia e exibe todos os contatos da lista, um por linha.
- Exibir a lista completa de contatos em ordem alfabética pelo nome: o programa verifica se a lista de contatos está vazia e ordena os contatos em ordem alfabética pelo nome. Os contatos ordenados são exibidos na tela.
- Buscar um contato pelo nome: o programa verifica se a lista de contatos está vazia e pede ao usuário para digitar o nome do contato que deseja buscar. O programa procura na lista de contatos pelo nome digitado (ignorando letras maiúsculas/minúsculas) e exibe as informações do contato, se encontrado.
- Remover um contato pelo nome: o programa verifica se a lista de contatos está vazia e pede ao usuário para digitar o nome do contato que deseja remover. O programa procura na lista de contatos pelo nome digitado (ignorando letras maiúsculas/minúsculas) e remove o contato da lista, se encontrado.
- Sair: o programa encerra a execução.

Créditos
--------
Marcus Soares

Todos os direitos reservados. Por favor, não retire os créditos.
