import java.util.Scanner;


public class Sequencia {

	private int vet[];
	private int tam;
		
			
	public void setSeq()
	{
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o tamanho da sequencia:");
		tam = entrada.nextInt();
		int vet[] = new int[tam];
		System.out.println("Entre com os valores da sequencia:");
		for(int i = 0; i < tam; i++)
		{
			vet[i] = entrada.nextInt();
		}
	entrada.close();
	}
	
	public void shwSeq(int fatorK) 
	{
	 int qtde = tam/fatorK;
		while(qtde > 0)
		{
			System.out.print("(");
			int cont = 0;
			for(int i = cont; i< cont+fatorK ; i++)
			{
				System.out.println(vet[cont]);
				cont = cont+fatorK;
			}//Fim do for
			System.out.print(")");
			qtde--;
			
		}//Fim do while
		
		
	}
	
}

	

