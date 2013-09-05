import java.awt.List;


public class TesteMacaco {

	public static void ImprimirBucho(List bucho){
		for(int i=0;i< bucho.getItemCount(); i++){
			System.out.println(bucho.getItem(i));
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasseMacaco objMacaco1 = new ClasseMacaco();
		ClasseMacaco objMacaco2 = new ClasseMacaco();
		
		objMacaco1.setNomeMacaco("Tina");
		objMacaco2.setNomeMacaco("Tinoco");
		System.out.println("SE ALIMENTAR O MACACO 7 VEZES O ANIMAL COMEÇA A DIGERIR");
		System.out.println("Macaco 1 : "+objMacaco1.getNomeMacaco());
		objMacaco1.ComerAlimentos("Banana");
		System.out.println("Lista : 1 alimento");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("pera");
		System.out.println("Lista: 2 alimento");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("Maca");
		System.out.println("Lista : 3 alimentos");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("LIMA");
		System.out.println("Lista: 4 alimentos");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("morango");
		System.out.println("Lista: 5 alimentos");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("formiga");
		System.out.println("Lista: 6 alimentos");
		ImprimirBucho(objMacaco1.VerBucho());
		objMacaco1.ComerAlimentos("barata");
		System.out.println("Lista");
		ImprimirBucho(objMacaco1.VerBucho());

		
		System.out.println("Macaco 2 : "+objMacaco2.getNomeMacaco());
		objMacaco2.ComerAlimentos("Banana");
		System.out.println("Lista");
		ImprimirBucho(objMacaco2.VerBucho());
		objMacaco2.ComerAlimentos("pera");
		System.out.println("Lista");
		ImprimirBucho(objMacaco2.VerBucho());
		objMacaco2.ComerAlimentos("Uva");
		System.out.println("Lista");
		ImprimirBucho(objMacaco2.VerBucho());
		
		System.out.println("Os Macacos nao podem se comer porque no programa ele nao foi implementado como alimento, ");
		System.out.println("Isso seria possivel se o atributo alimento fosse implementado como obj apenas nesse caso seria possivel obtermos macacos canibais");
		

		
	}
	
}
