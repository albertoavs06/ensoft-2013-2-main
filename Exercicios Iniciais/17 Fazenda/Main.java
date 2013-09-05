
import java.util.Scanner;

import Fazenda.Fazenda;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		Fazenda fazenda = new Fazenda(); //Cria a fazenda
        int escolha = 1; // Variavel de escolha
        Scanner entrada = new Scanner(System.in); // Variavel de entrada de dados
        
        while (escolha == 1)        //Entra no primeiro painel
        {
            
        	System.out.println ("Aperte 1 para criar bicho");
            System.out.println ("Aperte outro para administrar a fazenda");
           
            escolha = entrada.nextInt();
            
            if (escolha == 1)
            {
                fazenda.CriarBicho();
                System.out.println("Voce agora tem:" + fazenda.retornaQtde() + " Bichos");
            }
            else
            {
                break;
            }
        }// Fim do primeiro painel
            escolha = 1;
            while (escolha != 0)        //Entra no segundo Painel
            {
                boolean todosalimentados, todosfelizes; // Variaveis para receber os resultados dos metodos 
                // Entra com as escolhas do usuario para administrar a fazenda
                System.out.println("Entre com 1 para Alimentar os bichos");
                System.out.println("Entre com 2 para brincar com os bichos");
                System.out.println("Entre com 3 para brincar com os bichos");
                System.out.println("Entre com 0 para sair do programa");
               
                escolha = entrada.nextInt();

                // Caso escolha alimentar os bichos
                if (escolha == 1)
                {
                   todosalimentados = fazenda.AlimentarBichos();
                   if (todosalimentados == true)                //Se todos estiverem Defidamente alimentados
                	   System.out.println("Todos devidamente alimentados!");
                   else
                	   System.out.println("Ainda tem bicho com fome :/, tente denovo");
                }
                // Caso escolha Brincar os bichos
                if (escolha == 2)
                {
                    todosfelizes = fazenda.BrincarBichos();
                    if (todosfelizes == true)        //Se todos estiverem defidamente felizes
                    	System.out.println("Todos estão alegres!!");
                    else
                    	System.out.println("Ainda tem animal entediado, tente denovo!");
                }

                // Caso escolha escutar os bichos
                if (escolha == 3)
                {
                    todosfelizes = fazenda.EscutarBichos();
                    if (todosfelizes == true)        //Se todos estiverem defidamente felizes
                    	System.out.println("Todos estão alegres!!");
                    else
                    	System.out.println("Ainda tem animal entediado, tente denovo!");
                }

            }//Fim do segundo Painel  
	entrada.close();
	}//Fim da classe Main()

}
