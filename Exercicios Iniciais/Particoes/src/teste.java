import java.util.Scanner;


public class teste {

	public static void main(String[] args) {
		 Particoes p = new Particoes(5);

         p.imprimeParticoes();

         while (p.existeParticaoValida())
         {
             p.imprimeParticoes();
         }

         System.out.println("Pressione qualquer tecla para continuar....");
         Scanner read = new Scanner(System.in);
         read.nextLine();
         read.close();


	}

}
