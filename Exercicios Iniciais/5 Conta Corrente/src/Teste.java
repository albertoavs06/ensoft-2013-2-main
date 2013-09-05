import java.util.Scanner;


public class Teste {

	int Valor;
	int Nconta;
	String nome;

	
	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
		while(entrada > 0 ){
	 	System.out.println("Digite 1 para abrir conta");
		System.out.println("Digite 2 para deposito");
		System.out.println("3 para saque");
		int enter = entrada.nextInt();
		
		if (enter == 1)
			{
			System.out.println("1 para conta com saldo, e 2 para saldo 0!");
				enter = entrada.nextInt();
			 if (enter == 1)
			 {
				 
			 }
			}
		
	
		}
	
	}

}
