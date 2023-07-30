import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    String email;

    Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone + " | Email: " + email;
    }
}

public class ListaContatos {
    public static void main(String[] args) {
        ArrayList<Contato> listaDeContatos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\nMenu de Opções:"); // Sistemas de opções gerada no console para dar seguimento no codigo.
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Exibir lista completa de contatos ordenada por ordem alfabética de nome");
            System.out.println("4. Buscar contato pelo nome");
            System.out.println("5. Remover contato pelo nome");
            System.out.println("6. Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) { // Sistema de registro via input
                case 1:
                    System.out.print("Digite o nome do novo contato: ");
                    String nome = input.next();
                    System.out.print("Digite o telefone do novo contato: ");
                    String telefone = input.next();
                    System.out.print("Digite o email do novo contato: ");
                    String email = input.next();
                    listaDeContatos.add(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    if (listaDeContatos.isEmpty()) { //Sistema que mostra a lista de candidados, na linha 58
                        System.out.println("Não há contatos na lista!");
                    } else {
                        System.out.println("\nLista de contatos:");
                        for (Contato contato : listaDeContatos) {
                            System.out.println(contato);
                        }
                    }
                    break;

                case 3:
                    if (listaDeContatos.isEmpty()) {
                        System.out.println("Não há contatos na lista!"); // Caso de algum erro ele retorna essa mensage (ou não tenha um candidato registrado), Linha 66,82 e 103
                    } else {
                        Collections.sort(listaDeContatos, new Comparator<Contato>() {
                            public int compare(Contato c1, Contato c2) {
                                return c1.nome.compareTo(c2.nome);
                            }
                        });
                        System.out.println("\nLista de contatos ordenada por nome:");
                        for (Contato contato : listaDeContatos) {
                            System.out.println(contato);
                        }
                    }
                    break;

                case 4:
                    if (listaDeContatos.isEmpty()) { // Sistema que filtra a busca de cadidaos via nome.
                        System.out.println("Não há contatos na lista!");
                    } else {
                        System.out.print("Digite o nome do contato que deseja buscar: ");
                        String nomeBusca = input.next();
                        boolean encontrado = false;
                        for (Contato contato : listaDeContatos) {
                            if (contato.nome.equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Contato encontrado:");
                                System.out.println(contato);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Contato não encontrado!");
                        }
                    }
                    break;

                    case 5:
                    if (listaDeContatos.isEmpty()) { // Sistema para remover o candidato de sua lista
                        System.out.println("Não há contatos na lista!");
                    } else {
                        System.out.print("Digite o nome do contato que deseja remover: ");
                        String nomeRemocao = input.next();
                        boolean removido = false;
                        for (Contato contato : listaDeContatos) {
                            if (contato.nome.equalsIgnoreCase(nomeRemocao)) {
                                listaDeContatos.remove(contato);
                                System.out.println("Contato removido com sucesso!");
                                removido = true;
                                break;
                            }
                        }
                        if (!removido) {
                            System.out.println("Contato não encontrado!");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 6);
    }
}

