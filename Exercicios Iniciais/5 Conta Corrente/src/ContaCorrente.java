

public class ContaCorrente {

    //Atributos da classe!
	private int NConta;

	private int Saldo;

	private String Nome;

	/// <summary>
    /// Fun��o que altera o nome
    /// </summary>
    /// <param name="entrada"></param>
    public void AlterarNome(String entrada) {

        Nome = entrada;
        
	}
    /// <summary>
    /// M�todo para depositar dinheiro
    /// </summary>
    /// <param name="entrada"></param>
	public void Deposito(int valor) {

	    Saldo = Saldo + valor;
        System.out.println("Foi depositado:" + valor);

	}

	 /// <summary>
    /// Fun��o de saque, que s� ser� disponivel se o saldo for positivo antes da opera��o 
    /// </summary>
    /// <param name="entrada"></param>
	public void Saque(int valor) {

	    if (Saldo < 0)
        {
            System.out.println("Saque indisponivel! Conta Negativa!");
        }
        else
        {
            Saldo = Saldo - valor;
        }
	}
	

	/// <summary>
    ///  Construtor onde s� passa o nome do usu�rio e o numero da conta
    /// </summary>
    /// <param name="nome"></param>
    /// <param name="numero"></param>
	public ContaCorrente(int numero, String nome) {
	    Nome = nome;
        NConta = numero;
        Saldo = 0;
	}

    /// <summary>
    /// Construtor onde passa o nome do usu�rio, o numero da conta e o Saldo inicial
    /// </summary>
    /// <param name="nome"></param>
    /// <param name="numero"></param>
    /// <param name="saldo"></param>
	public ContaCorrente(int numero, String nome, int saldo) {

        Nome = nome;
        NConta = numero;
        Saldo = saldo;
	}

}
