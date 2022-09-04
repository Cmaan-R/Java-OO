
public class TestaBanco {

	public static void main(String[] args) {

		Cliente paulo = new Cliente();

		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.22-22";
		paulo.profissao = "Programador";

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		//Associa o Cliente Paulo a Conta contaDoPaulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		

	}
}
