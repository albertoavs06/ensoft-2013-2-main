import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe retangulo
 * @author Giovanni
 * @version 2013
 *
 */

public class Retangulo{
	
	//Variaveis de instancia
	float largura, altura;
	Ponto ponto;
	
	/**
	 * Construtor cria um ponto e o adiciona a lista de pontos existentes
	 * @param ListaPonto lista a qual será adicionada o ponto
	 */
	
	public Retangulo(ArrayList<Ponto> ListaPonto){
		
		int p=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Largura: ");
		this.largura = entrada.nextFloat();
		System.out.println("Altura: ");
		this.altura = entrada.nextFloat();
		do{
			System.out.println("Ponto de partida");
			this.ponto = new Ponto();
			
			for(int cont = 0; cont < ListaPonto.size(); cont++){
				if(ListaPonto.get(cont).getX() == this.ponto.getX() && ListaPonto.get(cont).getY() == this.ponto.getY()){
					p=1;
					break;
				}
			}
			
		}while(p != 1);
		
		
	}
	
	//Getters e Setters
	
	Ponto getPonto(){
		return this.ponto;
	}
	
	void setPonto(Ponto ponto){
		this.ponto = ponto;
	}
	
	float getLargura(){
		return this.largura;
	}
	
	void setLargura(float largura){
		this.largura = largura;
	}
	
	float getY(){
		return this.altura;
	}
	
	void setAltura(float altura){
		this.altura = altura;
	}
	
	/**
	 * Método que retorna o ponto central do retangulo
	 * @return
	 */
	
	Ponto Centro(){
		
		float meioLargura, meioAltura;
		
		meioLargura = largura/2;
		meioAltura = altura/2;
		
		Ponto centro = new Ponto(meioLargura, meioAltura); 
		
		return centro;
		
	}

}
