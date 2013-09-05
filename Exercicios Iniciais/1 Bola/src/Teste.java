import java.util.Scanner;


public class Teste {
	public static String Cor;
	public static String Material;
	public static float Circurferencia;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva cor:");
		Cor = entrada.next();
		
		System.out.println("Escreva Material:");
		Material = entrada.next();
		
		System.out.println("Escreva Circurferencia");
		Circurferencia = entrada.nextFloat();
		
		Bola bola = new Bola(Cor, Circurferencia, Material);
		
		bola.MostrarCor();
		System.out.println("Escreva a proxima cor:");
		Cor = entrada.next();
		bola.TrocarCor(Cor);
		bola.MostrarCor();
		entrada.close();
		
		}
}