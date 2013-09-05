

public class ContaCorrente {

    //Atributos da classe!
	private int NConta;

	private int Saldo;

	private String Nome;

	/// <summary>
    /// Função que altera o nome
    /// </summary>
    /// <param name="entrada"></param>
    public void AlterarNome(String entrada) {

        Nome = entrada;
        
	}
    /// <summary>
    /// Método para depositar dinheiro
    /// </summary>
    /// <param name="entrada"></param>
	public void Deposito(int valor) {

	    Saldo = Saldo + valor;
        System.out.println("Foi depositado:" + valor);

	}

	 /// <summary>
    /// Função de saque, que só será disponivel se o saldo for positivo antes da operação 
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
    ///  Construtor onde só passa o nome do usuário e o numero da conta
    /// </summary>
    /// <param name="nome"></param>
    /// <param name="numero"></param>
	public ContaCorrente(int numero, String nome) {
	    Nome = nome;
        NConta = numero;
        Saldo = 0;
	}

    /// <summary>
    /// Construtor onde passa o nome do usuário, o numero da conta e o Saldo inicial
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
