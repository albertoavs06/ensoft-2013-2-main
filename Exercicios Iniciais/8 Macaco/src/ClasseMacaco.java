import java.awt.List;
//Classe macaco : 

public class ClasseMacaco {

	private String nomeMacaco;
	private List bucho;

	
	public ClasseMacaco(){
		this.bucho = new List();
	
	}
	public String getNomeMacaco() {
		return nomeMacaco;
	}
	public void setNomeMacaco(String nomeMacaco) {
		this.nomeMacaco = nomeMacaco;
	}
	public List getBucho() {
		return bucho;
	}
	public void setBucho(String bucho) {
		this.bucho.add(bucho);
	}

	public void ComerAlimentos(String idAlimento){
	 if(VerBucho().getItemCount() < 6){	
		this.setBucho(idAlimento);
	 }
	 else{
		 digerir();
		 this.setBucho(idAlimento);
	 }
	}
	public void digerir(){
		this.bucho.remove(0);
	}
	public List VerBucho(){
		return this.getBucho();
	}
}
