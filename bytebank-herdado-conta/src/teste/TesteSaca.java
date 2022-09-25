package teste;

public class TesteSaca {

	public static void main(String[] args) {

		modelo.Conta conta = new modelo.ContaCorrente(123, 231);

		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch (Exception e) {
			System.out.println("Erro: " +  e.getMessage());
		}

		System.out.println(conta.getSaldo());

	}

}
