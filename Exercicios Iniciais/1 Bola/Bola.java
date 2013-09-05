package Bola;

public class Bola {

	 // Variaveis da Bola
	private String Cor;

	private double circurferencia;

	private String Material;

	/// <summary>
    /// Metodo para trocar a cor 
    /// </summary>
    /// <param name="entrada"></param>
	public void TrocarCor(string entrada) {

		Cor = entrada;
	}

    /// <summary>
    /// Método para mostrar a cor
    /// </summary>
	public void MostrarCor() {

		 System.out.println("A cor é:" + Cor);
	}

	/// <summary>
    /// Método construtor da classe.
    /// </summary>
    /// <param name="cor"></param>
    /// <param name="diametro"></param>
    /// <param name="material"></param>
	public void Bola(String Cor, double circurferencia, String Material) {

        Cor = cor;
        Circurferencia = circurferencia;
        Material = material;

	}

}
