
public class TestEmpregado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 empregado emp = new empregado("Daniel",1500);
			empregado emp2 = new empregado("Thiago",1351);
			
			System.out.println("O Funcionario : "+ emp.getNome() +" tem salario de " +emp.getSalario());
			System.out.println("O Funcionario : "+ emp2.getNome() +" tem salario de " +emp2.getSalario());
	}

}
