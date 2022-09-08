
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		f1.setNome("Nico Steppat");
		f1.setCpf("22335566 - 9");
		f1.setSalario(2600.00);

		System.out.println(f1.getNome() + " " + f1.getBonificacao());

		
	}

}
