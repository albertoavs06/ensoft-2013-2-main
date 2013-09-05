import java.util.Scanner;
public class RetanguloMain {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClasseRetangulo ComodoRetangular = new ClasseRetangulo(0, 0);
		float rodape ;
		float piso ;
		
		System.out.println("Informe as medidas de seu Cômodo : base e altura");
		
		ComodoRetangular.setAltura(input.nextFloat());
		ComodoRetangular.setBase(input.nextFloat());
		//Adotando que cada ceramica tem 1m quadrado 
		rodape = ComodoRetangular.Perimetro()/3 ;
		piso = ComodoRetangular.Area();
		//System.out.println(ComodoRetangular.getAltura()  + " " +  ComodoRetangular.getBase());
		System.out.println("Adotando que cada ceramica tem 1m quadrado");
		System.out.println("A quantidade de ceramicas utilizados no rodapé são" + ": "+rodape);
		System.out.println("A quantidade de ceramicas utilizados no piso são" + ": "+piso);
	}

}
