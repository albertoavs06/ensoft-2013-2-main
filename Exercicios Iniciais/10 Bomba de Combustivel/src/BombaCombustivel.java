import java.util.Scanner;

/**
 * Classe bomba de combustivel
 * @author Giovanni
 * @version 2013
 *
 */

public class BombaCombustivel {
	
	//Variáveis de instancia
	
	String tipoCombustivel;
	float valorLitro, quantidadeCombustivel;
	
	/**
	 * Construtor - Cria uma bomba de combustivel a partir de informações lidas pelo teclado
	 */
	
	public BombaCombustivel(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\tValores Iniciais\t");
		System.out.println("Tipo de combustível: ");
		this.tipoCombustivel = entrada.nextLine();
		System.out.println("Valor por litro: ");
		this.valorLitro = entrada.nextFloat();
		System.out.println("Quantidade de combustível na bomba: ");
		this.quantidadeCombustivel = entrada.nextFloat();	
		
	}
	
	//Getters e Setters
	
	String getTipoCombustivel(){
		return this.tipoCombustivel;		
	}
	
	void setTipoCombustivel(String tipo){
		this.tipoCombustivel = tipo;
	}
	
	float getValorLitro(){
		return this.valorLitro;		
	}
	
	void setValorLitro(float valor){
		this.valorLitro = valor;
	}
	
	float getQuantidadeCombustivel(){
		return this.quantidadeCombustivel;
	}
	
	void setQuantidadeCombustivel(float quantidade){
		this.quantidadeCombustivel = quantidade;
	}
	
	/**
	 * Método usado para abastecer tendo como base um valor a ser pago
	 */
	
	void AbastecerPorValor(){
		
		float valor, quantidadeAbastecida;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor a ser abastecido: ");
		valor = entrada.nextFloat(); 
		
		quantidadeAbastecida = valor/valorLitro;
		
		if(this.quantidadeCombustivel > quantidadeAbastecida){
			AlterarQuantidadeCombustivel(quantidadeAbastecida);
			
			System.out.println("Valor abastecido: " + quantidadeAbastecida);	
		}else{
			System.out.println("Não existe combustivel suficiente");
		}
	}
	
	/**
	 * Método usado para abastecer tendo como base um valor em litros
	 */
	
	void AbastecerPorLitro(){
		
		float litro, valorPagar;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de litros a ser abastecido ");
		litro = entrada.nextFloat(); 
		
		valorPagar = litro/valorLitro;
		if(this.quantidadeCombustivel > litro){
			AlterarQuantidadeCombustivel(litro);
			
			System.out.println("Valor a pagar: R$" + valorPagar);	
		}else{
			System.out.println("Não existe combustivel suficiente");
		}
		
		
	}
	
	/**
	 * Método usado para alterar o valor do combustivel
	 */
	
	void AlterarValor(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Novo valor de combustivel: ");
		this.valorLitro = entrada.nextFloat();
		
	}
	
	/**
	 * Metodo usado para alterar o tipo de combustivel
	 */
	
	void AlterarCombustivel(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Novo valor de combustivel: ");
		this.tipoCombustivel = entrada.nextLine();
		
	}
	
	/**
	 * Método usado para dimiuir o valor de combustivel na bomba
	 * @param litros valor a ser subtraido
	 */
	
	void AlterarQuantidadeCombustivel(float litros){
		
		this.quantidadeCombustivel -= litros;
	}
	

}
