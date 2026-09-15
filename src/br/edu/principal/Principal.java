package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;

        boolean continuar = true;

        mostrarCabecalho();

        while (continuar) {

        	mostrarMenu();
        	
        	opcao = selecionarOpcao(sc);
        	
            switch (opcao) {
                case 1->{
                   adicionar(sc, nomes, celulares, emails);
            	}
                case 2->{
                    listar(nomes, celulares, emails);
            	}
                case 3->{
                    pesquisar(sc, nomes, celulares, emails);
            	}
                case 4-> {
                	atualizar(sc, nomes, celulares, emails);
                }         	
                case 5-> {
                	excluir(sc, nomes, celulares, emails);
                }          	
                case 6-> {
                	sair(continuar);
                }
  
                default ->{
                   System.out.println("Opção inválida!");
                }
            }
        }
        sc.close();//ele "desliga" a ferramenta do scanner
    }
    
    public static void mostrarCabecalho() {
    	System.out.println("==========================");  
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v1.0.0           ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }
    public static void mostrarMenu() {
    	System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
    }
    public static int selecionarOpcao(Scanner sc) {
    	int op;
    	System.out.print("Escolha uma opção: ");
        op = sc.nextInt();
        sc.nextLine();
        return op;
        
    }
    public static void adicionar(Scanner sc, 
    		List<String> nomes, 
    		List<String> celulares, 
    		List<String> emails) {
    	 System.out.println("=== ADICIONAR CONTATO ===");
         System.out.print("Digite o nome: ");
         String nome = sc.nextLine();
         System.out.print("Digite o celular: ");
         String celular = sc.nextLine();
         System.out.print("Digite o email: ");
         String email = sc.nextLine();

         nomes.add(nome);
         celulares.add(celular);
         emails.add(email);
         
         System.out.println("Contato adicionado com sucesso!");
    }
    public static void listar(List<String> nomes,
    		List<String> celulares, 
    		List<String> emails) {
    	System.out.println("=== LISTAR CONTATOS ===");
        if (nomes.size() == 0) {
            System.out.println("Nenhum contato cadastrado!");

        } 
        else {
            for (int i = 0; i < nomes.size(); i++) {

                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
            }
        }
    }
    
    public static void pesquisar(Scanner sc, 
    		List<String> nomes,
    		List<String> celulares, 
    		List<String> emails) {
    	System.out.println("=== PESQUISAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));

                encontrado = true;
            }
        }
        //basicamente ele inverte o sinal do booleano no if(que só entra quando é true), ou seja se for false ele vira true(entrando no if e consequentemente mostrando que o contato não foi encontrado) e se for true vira false(não entrand no if e consequentemente não printando nada), dava pra fazer com 0 e 1 tambem
        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }
    public static void atualizar(
            Scanner sc,
            List<String> nomes,
            List<String> celulares,
            List<String> emails) {
    	System.out.println("=== ALTERAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        int posicao = -1;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeProcurado)) {
                posicao = i;
            }
        }
        if (posicao != -1) {

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            nomes.set(posicao, novoNome);
            celulares.set(posicao, novoCelular);
            emails.set(posicao, novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void excluir(
            Scanner sc,
            List<String> nomes,
            List<String> celulares,
            List<String> emails) {
    	System.out.println("=== EXCLUIR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();
        boolean excluido = false;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
                nomes.remove(i);
                celulares.remove(i);
                emails.remove(i);

                excluido = true;

                System.out.println("Contato excluído com sucesso!");
                break;
            }
        }
        if (!excluido) {
            System.out.println("Contato não encontrado!");
        }
    }   
    public static void sair(boolean continuar) {
    	System.out.println("Saindo da Agenda de Contatos...");
        continuar = false;
    }
}