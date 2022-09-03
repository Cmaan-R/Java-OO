package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaCliente1 = new Conta();
		contaCliente1.saldo = 100;
		contaCliente1.deposita(150);
		
		
		System.out.println(contaCliente1.saldo);
		
		
		
	}

}
