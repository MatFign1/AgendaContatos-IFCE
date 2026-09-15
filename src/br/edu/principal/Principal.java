package br.edu.principal;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) { 
 
        Scanner scanner = new Scanner(System.in); 
        String nome = ""; 
        String celular = ""; 
        String email = ""; 
        boolean continuar = true; 
 
        System.out.println("=========================="); 
        System.out.println("     AGENDA DE CONTATOS    "); 
        System.out.println("          V.0.0.0           "); 
        System.out.println("=========================="); 
 
        while (continuar) { 
            System.out.println(); 
            System.out.println("1 - Adicionar contato"); 
            System.out.println("2 - Listar contato"); 
            System.out.println("3 - Procurar contato"); 
            System.out.println("4 - Excluir contato"); 
            System.out.println("5 - Sair"); 
            System.out.println(); 
            System.out.print("Escolha uma opção: "); 
            int opcao = scanner.nextInt(); 
            scanner.nextLine(); 
            switch (opcao) { 
                case 1: 
                    System.out.println("\n--- ADICIONAR CONTATO ---"); 
                    System.out.print("Nome: "); 
                    nome = scanner.nextLine(); 
                    System.out.print("Celular: "); 
                    celular = scanner.nextLine(); 
                    System.out.print("E-mail: "); 
                    email = scanner.nextLine(); 
                    System.out.println("Contato salvo com sucesso!"); 
                    break; 
                case 2: 
                    System.out.println("\n--- LISTAR CONTATO ---"); 
                    if (nome.isEmpty()) { 
                        System.out.println("Nenhum contato cadastrado."); 
                    } else { 
                        System.out.println("Nome: " + nome); 
                        System.out.println("Celular: " + celular); 
                        System.out.println("E-mail: " + email); 
                    } 
                    break; 
                case 3: 
                    System.out.println("\n--- PROCURAR CONTATO ---"); 
                    if (nome.isEmpty()) { 
                        System.out.println("Nenhum contato cadastrado."); 
                    } else { 
                        System.out.print("Digite o nome que deseja procurar: "); 
                        String nomeBusca = scanner.nextLine(); 
                        if (nome.equalsIgnoreCase(nomeBusca)) { 
                            System.out.println("Contato encontrado!"); 
                            System.out.println("Nome: " + nome); 
                            System.out.println("Celular: " + celular); 
                            System.out.println("E-mail: " + email); 
                        } else { 
                            System.out.println("Contato não encontrado."); 
                        } 
                    } 
                    break; 
                case 4: 
                    System.out.println("\n--- EXCLUIR CONTATO ---"); 
                    if (nome.isEmpty()) { 
                        System.out.println("Nenhum contato cadastrado."); 
                    } else { 
                        nome = ""; 
                        celular = ""; 
                        email = ""; 
                        System.out.println("Contato excluído com sucesso!"); 
                    } 
                    break; 
                case 5: 
                    System.out.println("Saindo..."); 
                    continuar = false; 
                    break; 
                default: 
                	System.out.println("Opção inválida!"); 
            } 
        } 
    } 
}