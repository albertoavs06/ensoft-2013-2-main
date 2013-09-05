import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe teste para o problema do retangulo
 * @author Giovanni
 * @version 2013
 */

public class Main {
	
	public static void main (String args[]){
		
		int opcao;
		Ponto centro;		
		
		ArrayList<Ponto> ListaPonto = new ArrayList<Ponto>();
		Scanner entrada = new Scanner(System.in);
		Retangulo retangulo = null;
		
		//Menu usado na execução
		
		do{
			System.out.println("\tMenu\t");
			System.out.println("1 - Criar ponto");
			System.out.println("2 - Criar retangulo");
			System.out.println("3 - Alterar retangulo");
			System.out.println("4 - Imprimir retangulo");
			System.out.println("5 - Sair");
			System.out.println("Opção: ");
			
			opcao = entrada.nextInt();
			
			switch(opcao){
			
			case 1: ListaPonto.add(new Ponto());
					break;
			case 2: retangulo = new Retangulo(ListaPonto);
					break;
			case 3: retangulo = new Retangulo(ListaPonto);
					break;
			case 4: if(retangulo != null){
						centro = retangulo.Centro();
						centro.Imprimir();
					}else{
						System.out.println("Rentângulo não foi criado ainda");
					}
					break;
			}
		}while(opcao != 5);		
	}

}
