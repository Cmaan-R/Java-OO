
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");
		// Agora em duas linhas:

//		Cliente titularDaConta = conta.getTitular();
//		titularDaConta.setProfissao("Programador");

//		Também Poderia Ser Dessa Forma
//		paulo.setProfissao("Programador");

		System.out.println(conta.getTitular().getProfissao());

	}

}
