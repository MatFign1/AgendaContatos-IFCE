package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int capacidade = 2;
		String [] nomes = new String[capacidade];
        String celulares []  = new String[capacidade];
        String emails []  = new String[capacidade];
        int cont = 0;
        Scanner sc = new Scanner(System.in); 
        int opcao;
        
        boolean continuar = true;
        
		System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v0.1.0           ");
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
    	            nomes[cont] = sc.nextLine();

    	            System.out.print("Celular: ");
    	            celulares[cont] = sc.nextLine();

    	            System.out.print("E-mail: ");
    	            emails[cont] = sc.nextLine();
    	            
    	            cont++;

    	            System.out.println("Contato salvo com sucesso!");

    	        }
    	        case 2 ->{
    	            System.out.println("Listar contato");
    	            if(cont == 0) {
    	            	System.out.println("Nenhum contato encontrado!");
    	            }
    	            else {
    	            	for(int i = 0; i < cont; i++) {
    	                    System.out.println("\nContato " + (i + 1));
    	                    System.out.println("Nome: " + nomes[i]);
    	                    System.out.println("Celular: " + celulares[i]);
    	                    System.out.println("E-mail: " + emails[i]);
    	                }
    	            }
    	        }
    	        case 3 -> {
    	        	System.out.println("\n--- PROCURAR CONTATO ---");
    	            System.out.print("Digite o nome que deseja procurar: ");
    	            String nomeBusca = sc.nextLine();
    	            boolean encontrado = false;

    	            for(int i = 0; i < cont; i++) {
    	                if(nomes[i].equalsIgnoreCase(nomeBusca)) {
    	                    System.out.println("Contato encontrado!");
    	                    System.out.println("Nome: " + nomes[i]);
    	                    System.out.println("Celular: " + celulares[i]);
    	                    System.out.println("E-mail: " + emails[i]);

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
    	                    if(nomes[i].equalsIgnoreCase(nomeExcluir)) {
    	                        indiceExcluir = i;
    	                    }
    	                }
    	                if(indiceExcluir == -1) {
    	                    System.out.println("Contato não encontrado.");
    	                }
    	                else {
    	                    for(int i = indiceExcluir; i < cont - 1; i++) {
    	                        nomes[i] = nomes[i + 1];
    	                        celulares[i] = celulares[i + 1];
    	                        emails[i] = emails[i + 1];
    	                    }
    	                    nomes[cont - 1] = null;
    	                    celulares[cont - 1] = null;
    	                    emails[cont - 1] = null;
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