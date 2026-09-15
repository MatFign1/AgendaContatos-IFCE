package br.edu.principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//int capacidade = 2;
		
		List<String> nomes = new ArrayList<>();
		List<String> celulares = new ArrayList<>();
		List<String> emails = new ArrayList<>();

        int cont = 0;
        Scanner sc = new Scanner(System.in); 
        int opcao;
        
        boolean continuar = true;
        
		System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v0.2.0           ");
        System.out.println("==========================");

        System.out.println("Bem-vindo!");
        
        while(continuar) {
        	System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Procurar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao) {
    	        case 1 -> {
    	        	System.out.println("\n--- ADICIONAR CONTATO ---");

    	            System.out.print("Nome: ");
    	            nomes.add(sc.nextLine());

    	            System.out.print("Celular: ");
    	            celulares.add(sc.nextLine());

    	            System.out.print("E-mail: ");
    	            emails.add(sc.nextLine());
    	            
    	            cont++;

    	            System.out.println("Contato salvo com sucesso!");

    	        }
    	        case 2 -> {
    	            System.out.println("Listar contato");
    	            if(nomes.size() == 0) {
    	            	System.out.println("Nenhum contato encontrado!");
    	            }
    	            else {
    	            	for(int i = 0; i < nomes.size(); i++) {
    	                    System.out.println("\nContato " + (i + 1));
    	                    System.out.println("Nome: " + nomes.get(i));
    	                    System.out.println("Celular: " + celulares.get(i));
    	                    System.out.println("E-mail: " + emails.get(i));
    	                }
    	            }
    	        }
    	        case 3 -> {
    	        	System.out.println("\n--- PROCURAR CONTATO ---");
    	            System.out.print("Digite o nome que deseja procurar: ");
    	            String nomeBusca = sc.nextLine();
    	            boolean encontrado = false;

    	            for(int i = 0; i < nomes.size(); i++) {
    	                if(nomes.get(i).equalsIgnoreCase(nomeBusca)) {
    	                    System.out.println("Contato encontrado!");
    	                    System.out.println("Nome: " + nomes.get(i));
    	                    System.out.println("Celular: " + celulares.get(i));
    	                    System.out.println("E-mail: " + emails.get(i));

    	                    encontrado = true;
    	                }
    	            }
    	            if(!encontrado) {
    	                System.out.println("Contato não encontrado.");
    	            }
    	        }
    	        case 4 -> {
    	        	System.out.println("\n--- EXCLUIR CONTATO ---");
    	            if(cont == 0) {
    	                System.out.println("Nenhum contato cadastrado.");
    	            }
    	            else {
    	                System.out.print("Digite o nome do contato que deseja excluir: ");
    	                String nomeExcluir = sc.nextLine();
    	                int indiceExcluir = -1;
    	                for(int i = 0; i < cont; i++) {
    	                    if(nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
    	                        indiceExcluir = i;
    	                    }
    	                }
    	                if(indiceExcluir == -1) {
    	                    System.out.println("Contato não encontrado.");
    	                }
    	                else {
    	                	nomes.remove(indiceExcluir);
    	                    celulares.remove(indiceExcluir);
    	                    emails.remove(indiceExcluir);

    	                    cont--;

    	                    System.out.println("Contato excluído com sucesso!");
    	                }
    	            }
    	        }
    	        case 5 -> {
    	            System.out.println("Saindo...");
    	            continuar = false;
    	        }
    	        default ->  System.out.println("Opção inválida!");
    	    }//switch
        }//while
	}//main
}//principal