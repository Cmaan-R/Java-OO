//Gerente Herda da Classe Funcionário
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do Gerente");
		return super.getSalario();
	}

}
