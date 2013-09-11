import java.awt.List;

public class Desarranjo {
	public static List GerarArranjo(int n){
		List list = new List();
		for(int i=0; i<n; i++){
			list.add(Integer.toString(i+1));
		}
		return list;	
	}
// Função que imprime o desarranjo o gerando
	public static void ImprimirDesarranjo(List arranjo){
		int max = arranjo.getItemCount();
		String[] desarranjo = new String[max];
		String[] arranjoCerto = new String[max];
		for(int i = 0 ; i < max; i++){//neste for, passamos o arranjo gerado na função anterior para um vetor para melhorar as operações
			arranjoCerto[i] = arranjo.getItem(i);
		}
		for(int i = 0 ; i < max; i++){//gera-se o 1 desarranjo
			if(i!=max-1){
				String temp = arranjoCerto[i];
				desarranjo[i] = arranjoCerto[i+1];
				arranjoCerto[i+1] = temp;
		}else{
			desarranjo[max-1] = arranjo.getItem(0);
		}
		}
		int i = 0;
		do{
			for(int ind = 0 ; ind < max; ind++){
				System.out.print(desarranjo[ind] + " ");//imprime-se os desarranjos
			}
			System.out.println(" |");
			String  inicial = desarranjo[0];
			for(int ind2 = 0 ; ind2 < max; ind2++){ //com a sequencia de swaps aqui dentro deste laço, temos os desarranjos sendo gerados e na proxima volta do do/while ele será impresso
				if(ind2!=max-1){
					String temp = desarranjo[ind2+1];
					desarranjo[ind2+1] = desarranjo[ind2] ;
					desarranjo[ind2] = temp;
				}else{
					desarranjo[max-1] = inicial;
				}
			}
			i+=1;
		}while(i<max-1);
	}
	//class main que irá iniciar e executar o programa
	public static void main(String[] args) {
		ImprimirDesarranjo(GerarArranjo(4));

	}
}