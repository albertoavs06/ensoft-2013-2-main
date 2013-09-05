//Classe para modelar um funcionario que tenha nome e salario como atributos 
//podendo ser acrescentado ao seu salario um aumento

public class Empregado {
	
	private String nome;
	private double aumento;
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
	

	public double getAumento() {
		return aumento;
	}



	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
	
	//gets
	
	public String getNome(){
		return this.nome;
	}
	
	
	public double getSalario(){
		return this.salario;
	}
	
	public void AumentoSalario(double aumento){
		double newSalario;
		this.setAumento(aumento);
		newSalario = this.getSalario()+(this.getSalario() * this.getAumento())/100;
		this.setSalario(newSalario);
		System.out.println("novo salario: "+this.getSalario());
	}
	
	//construtor
	
	public Empregado(String _nome,double _salario ){
	       this.setNome(_nome);

		   this.setSalario(_salario);
	}

}
