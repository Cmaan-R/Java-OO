
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		

		Gerente g1 = new Gerente();
		g1.setNome("Paulo Vieira");
		g1.setCpf("235544143");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(5651);
		boolean autenticou = g1.autentica(5651);

		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());

	}

}
