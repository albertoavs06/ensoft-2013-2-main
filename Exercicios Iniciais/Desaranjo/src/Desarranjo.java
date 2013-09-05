import java.awt.List;
import java.lang.*;
public class Desarranjo{
	public List GerarArranjo(int n){
		String aux = null;
		List list = new List();
		for(Integer i=0; i<n; i++){
	
			list.add();
		}
		return list;
	}
	
	public void ImprimirDesarranjo(List arranjo){
		int max = arranjo.getItemCount();
		String[arranjo.getItemCount()] desarranjo = null;
		String[arranjo.getItemCount()] arranjoCerto = null;
		for(int = 0 ; i < max; i++){
			    if(i==max-1){
					desarranjo[i+1] = arranjo.getItem(i);
				}else{
					desarranjo[0] = arranjo.getItem(i);
				}
				arranjoCerto[i] = arranjo.getItem(i);
			}
		int i = 0;
		do{
			for(int = 0 ; i < max; i++){
				System.out.print(desarranjo[i] + " ");
			}
			for(int = 0 ; i < max; i++){
				if(i==max-1){
					String temp = desarranjo[i+1];
					desarranjo[i+1] = desarranjo[i] ;
					desarranjo[i] = temp;
				}else{
					desarranjo[0] = desarranjo[max-1];
				}
			}
			
		}while(desarranjo != arranjoCerto);
	}
	public static void Main(String[] args){
		ImprimirDesarranjo(GerarArranjo(3));
	}





}