import java.util.Scanner;

/**
 * Classe teste para bomba de combustivel
 * @author Giovanni
 * @version 2013
 * 
 */

public class Main {

	public static void main (String args[]){
		
		int opcao;
		String tipoCombustivel;
		float valorLitro, quantidadeCombustivel;
		
		Scanner entrada = new Scanner(System.in);
		
		BombaCombustivel bomba = new BombaCombustivel();
		
		//Menu a ser usado na execução
		
		do{
			
			System.out.println("\tMenu\t");
			System.out.println("1 - Abastecer por valor");
			System.out.println("2 - Abastecer por litro");
			System.out.println("3 - Alterar valor do combustível");
			System.out.println("4 - Alterar tipo de combustível");
			System.out.println("5 - Sair");
			System.out.println("Opção: ");
			
			opcao = entrada.nextInt();
			
			switch(opcao){
			
			case 1: bomba.AbastecerPorValor();
					break;
			case 2: bomba.AbastecerPorLitro();
					break;
			case 3: bomba.AlterarValor();
					break;
			case 4: bomba.AlterarCombustivel();
					break;
			}
		}while(opcao != 5);
	}
}
