import java.util.Scanner;

/**
 * Classe Teste da classe pessoa
 * @author Giovanni
 * @version 2013
 */

public class Main {
	
	public static void main (String args[]){
		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		//Menu utilizado para realizar as funções
				
		do{
			System.out.println("\tMenu\t");
			System.out.println("1 - Envelhecer");
			System.out.println("2 - Engordar");
			System.out.println("3 - Emagrecer");
			System.out.println("4 - Crescer");
			System.out.println("5 - Sair");
			System.out.println("Opção: ");
			
			opcao = entrada.nextInt();
			
			switch(opcao){
			
			case 1: pessoa.Envelhecer();
					break;
			case 2:	pessoa.Engordar();
					break;
			case 3: pessoa.Emagrecer();
					break;
			case 4: pessoa.Crescer();
					break;
				
			}
		}while(opcao != 5);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getPeso());
		System.out.println(pessoa.getAltura());
		
	}

}
