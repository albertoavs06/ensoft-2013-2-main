import java.util.Scanner;
/**
 * Classe pessoa
 * @author Giovanni
 * @version 2013
 */
public class Pessoa {
	
	//Variáveis de Instancia
	
	private int idade;
	private float peso, altura;
	private String nome;
	
	/**
	 * Construtor - cria uma pessoa baseada em informações lidas no teclado
	 */
	
	public Pessoa(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome: ");
		nome = entrada.nextLine();
		System.out.println("Peso: ");
		peso = entrada.nextFloat();
		System.out.println("Altura: ");
		altura = entrada.nextFloat();
		System.out.println("Idade: ");
		idade = entrada.nextInt();
		
	}
	
	//Getters e Setters
	
	int getIdade(){
		return this.idade;
	}
	
	void setIdade(int idade){
		this.idade = idade;
	}
	
	float getPeso(){
		return this.peso;
	}
	
	void setPeso(float peso){
		this.peso = peso;
	}
	
	float getAltura(){
		return this.altura;
	}
	
	void setAltura(float altura){
		this.altura = altura;
	}
	
	String getNome(){
		return this.nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	/**
	 * Método usado para envelhecer a pessoa em 01 ano
	 */
	
	void Envelhecer(){
		
		this.idade++;
		if(idade <= 21){
			this.altura += 0.05;
		}
		
	}
	
	/**
	 * Método usado para engordar a pessoa a partir de um valor lido
	 */
	
	void Engordar(){
		
		float engorda;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto engordou?");
		engorda = entrada.nextFloat();
		
		this.peso = peso + engorda;
		
	}
	
	/**
	 * Método usado para emagrecer a pessoa a partir de um valor lido
	 */
	
	void Emagrecer(){
		
		float emagrece;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto emagreceu?");
		emagrece = entrada.nextFloat();
		
		this.peso = peso - emagrece;
		
	}
	
	/**
	 * Método usado para fazer a pessoa crescer
	 */
	
	void Crescer(){
		
		float crescimento;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto cresceu?");
		crescimento = entrada.nextFloat();
		
		this.altura = altura + crescimento;
		
	}
	
	

}
