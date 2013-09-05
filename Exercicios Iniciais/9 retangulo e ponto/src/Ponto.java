import java.util.Scanner;

/**
 * Classe ponto
 * @author Giovanni
 * @version 2013
 */

public class Ponto {
	
	//Variaveis de instancia
	
	float x, y;
	
	/**
	 * Construtor que cria um ponto a partir de informações lidas do teclado
	 */
	
	public Ponto(){
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Coordenada X: ");
		this.x = entrada.nextFloat();
		System.out.println("Coordenada Y: ");
		this.y = entrada.nextFloat();
		
	}
	
	/**
	 * Construtor que cria um ponto a partir de valores pré-definidos
	 * @param x coordenada do eixo das abscissas
	 * @param y coordenada do eixo das ordenadas 
	 */
	
	Ponto(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	//Getters e Setters
	
	float getX(){
		return this.x;
	}
	
	void setX(float x){
		this.x = x;
	}
	
	float getY(){
		return this.y;
	}
	
	void setY(float y){
		this.y = y;
	}
	
	/**
	 * Método que imprime as coordenada de um determinado ponto
	 */
	
	void Imprimir(){
		
		System.out.println("X: " + this.x);
		System.out.println("Y: " + this.y);
		
	}

}
