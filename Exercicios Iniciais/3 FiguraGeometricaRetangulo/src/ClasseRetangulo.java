public class ClasseRetangulo {

	private float base;
	private float altura;


	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getBase() {
		return base;
	}



	public void setBase(float base) {
		this.base = base;
	}	
	
	
	public ClasseRetangulo(float base,float altura) {
		this.setAltura(altura);
		this.setBase(base);		
		
	}

	public void MudarValores(float novaBase, float novaAltura){
		
		this.setAltura(novaAltura);
		this.setBase(novaBase);
	}
	
	public float Area() {
		return this.getAltura()*this.getBase();
		
	}
	public float Perimetro() {
		return (this.getAltura()*2)+(2*this.getBase());
		
	}
}
