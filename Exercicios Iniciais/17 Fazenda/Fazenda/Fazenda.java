package Fazenda;

import java.util.ArrayList;
//import java.util.List;

public class Fazenda {

	private ArrayList<Bicho> MeusBichos = new ArrayList<Bicho>(); //Lista de bichos

	private int contsatisfeitos;	//Qtde de bichos satisfeitos

	private int contfelicidade;		//Qtde de bichos felizes

	private boolean todosalimentados;	//Variavel que parti do principio que todos os bichos nao foram alimentados

	private boolean todosfelizes;		//Variavel que parti do principio que todos os bichos nao estao felizes

	/// <summary>
    /// BrincarBicho -  Segue a mesma ideia do m�todo alimentar,
    /// Verifica primeiro o estado de cada bicho e coloca dentro de uma variavel contadora
    /// Se a quantidade de bichos for igual a quantidade de bichos satisfeitos
    /// A variavel todosFelizes recebe true. e o m�todo retorna isso.
    /// </summary>
  	public boolean BrincarBichos() {
        for (Bicho bicho : MeusBichos)
        {
            int qtde = retornaQtde();
            boolean estado;
            estado = bicho.BrincharBicho();
            if(estado == true)
            {
                contfelicidade++;
            }
            if (contfelicidade == qtde)
            {
            	todosfelizes = true;
            }
        }
        return todosfelizes;
    }
  	
  /// <summary>
    /// EscutarBicho -  Segue a mesma ideia do m�todo de brincar,
    /// Verifica primeiro o estado de cada bicho e coloca dentro de uma variavel contadora
    /// Se a quantidade de bichos for igual a quantidade de bichos satisfeitos
    /// A variavel todosFelizes recebe true. e o m�todo retorna isso.
    /// </summary>
	public boolean EscutarBichos() {
		for(Bicho bicho : MeusBichos)
        {
            int qtde = retornaQtde();
            boolean estado;
            estado = bicho.EscutarBicho();
            if (estado == true)
            {
                contfelicidade++;
            }
            if (contfelicidade == qtde)
            {
                todosfelizes = true;
            }
        }
        return todosfelizes;
	}

	/// <summary>
    /// Alimentar Bicho - Percorre toda a lista e chama o m�todo alimentar o bicho 
    /// Enquanto todos nao forem alimentados retornar� false
    /// quando todos forem alimentados direitinho retornar� true
    /// </summary>
	public boolean AlimentarBichos() {
		for (Bicho bicho : MeusBichos)
        {
            int qtde = retornaQtde();
            
            boolean estado;
            estado = bicho.AlimentarBicho();
            if (estado == true)
            {
                contsatisfeitos++;    
            }
            if ( contsatisfeitos == qtde)
            {
            	todosalimentados = true;
            }
          
        }

        return todosalimentados;
	}


   /// <summary>
   /// M�todo CriarBicho - Cria um bicho dentro da lista
   /// </summary>
	public void CriarBicho() {

	 this.MeusBichos.add(new Bicho());
	}

	/// <summary>
    /// Retorna a quantidade de elementos da lista
    /// </summary>
    /// <returns>this.MeusBichos.Count</returns>
	public int retornaQtde() {
		return this.MeusBichos.size();
	}

}
