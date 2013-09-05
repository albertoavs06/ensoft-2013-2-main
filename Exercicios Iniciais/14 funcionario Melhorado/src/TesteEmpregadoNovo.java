//Classe funcionario de teste referente a questa 14 a 
// qual aprimora a questao 13 acrescentando o aumento salarial
public class TesteEmpregadoNovo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado emp = new Empregado("Daniel",1500);
		Empregado emp2 = new Empregado("Thiago",100);
		
		System.out.println("O Funcionario : "+ emp.getNome() +" tem salario de " +emp.getSalario());
		System.out.println("O Funcionario : "+ emp2.getNome() +" tem salario de " +emp2.getSalario());
		emp.AumentoSalario(10);
		emp2.AumentoSalario(2.5);
		System.out.println("O Funcionario : "+ emp.getNome() +" tem um novo salario de " +emp.getSalario());
		System.out.println("O Funcionario : "+ emp2.getNome() +" tem um novo salario de " +emp2.getSalario());
	}

}
