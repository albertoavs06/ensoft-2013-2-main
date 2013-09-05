//Modelar uma classe empregado onde a mesma tenha nome e salario como abributos 
public class empregado{
	
	private String nome;
	
	private double salario;
	
	//sets
	public void setNome(String _nome){
	     this.nome = _nome;
	}
	

	
	public void setSalario(double _salario){
		if(_salario > 0){
			this.salario = _salario;
		}
	}
	
	//gets
	
	public String getNome(){
		return this.nome;
	}
	
	
	public double getSalario(){
		return this.salario;
	}
	//construtor
	
	public empregado(String _nome,double _salario ){
	       this.setNome(_nome);

		   this.setSalario(_salario);
	}
	
	//calcular salario
	
}