package Fazenda;

import java.util.Random;


public class Bicho {


	//Declaração de variavel
	private int Fome;

	private int Tedio;

    /// <summary>
    /// Construtor - Cria um novo bicho, e seta um numero aleatorio para fome e tedio
    /// </summary>

	public Bicho() {

        Random randomNumber = new Random();
        
        Fome = randomNumber.nextInt(10) + 1;
        Tedio = randomNumber.nextInt(10) + 1;

	}

    /// <summary>
    /// Método para alimentar individualmente cada bicho
    /// retornando true se o bicho estiver cheio, e false se nao tiver cheio.
    /// </summary>
	public boolean AlimentarBicho() {
        boolean cheio;
        if (Fome > 10)
        {
            cheio = true;
        }
        else
        {
            Fome++;
            cheio = false;
        }
        return cheio;
	}

	/// <summary>
    /// Brincar - Enquanto nao brincar 10 vezes, ele nao ficara feliz e retornará false
    /// </summary>
    /// <returns>Feliz</returns>
	public boolean BrincharBicho() {
        boolean feliz;
        if (Tedio > 10)
        {
            feliz = true;
        }
        else
        {
            Tedio++;
            feliz = false;
        }
     return feliz;

	}

    /// <summary>
    /// Escutar - Enquanto nao brincar 10 vezes, ele nao ficara feliz e retornará false
    /// </summary>
    /// <returns>Feliz</returns>
	public boolean EscutarBicho() {
        boolean feliz;
        if (Tedio > 10)
        {
            feliz = true;
        }
        else
        {
            Tedio++;
            feliz = false;
        }
        return feliz;
	}

}
