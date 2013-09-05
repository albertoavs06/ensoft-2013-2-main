package Quadrado;

public class Quadrado {

	//Variavel Lado
	private int Lado;

    /// <summary>
    /// Metodo mudar de lado - Que passa como parametro uma entrada e seta Lado
    /// </summary>
    /// <param name="Valor"></param>
	public void MudarValor(int Valor) {

        Lado = entrada;

	}
    /// <summary>
    /// Metodo RetornarValor - Retorna o valor do lado
    /// </summary>
    /// <returns></returns>

	public int RetornaValor() {
		return lado;
	}


	/// <summary>
    /// Método para o calculo da area do quadrado
    /// </summary>
    /// <param name="Valor"></param>
    /// <returns></returns>
	public void CalcularArea(int Valor) {

        int area;
        area = lado * lado;
        return area;

	}

    /// <summary>
    /// Método construtor da classe
    /// </summary>
    /// <param name="lado"></param>
	public Quadrado(int lado) {

        Lado = lado;

	}

}
