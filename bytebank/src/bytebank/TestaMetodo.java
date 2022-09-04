package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaCliente1 = new Conta();
		contaCliente1.saldo = 100;
		contaCliente1.deposita(150);

		System.out.println(contaCliente1.saldo);

		boolean conseguiuRetirar = contaCliente1.saca(50);

		System.out.println(conseguiuRetirar + " " + contaCliente1.saldo);

		Conta contaCliente2 = new Conta();
		contaCliente2.deposita(1000);

		boolean sucessoTransferencia = contaCliente2.transfere(300, contaCliente1, contaCliente2);

		if (sucessoTransferencia) {
			System.out.println("Transferência Realizada Com Sucesso");
		} else {
			System.out.println("Transferência Não Concluída : Valor Indisponível Na Conta!");
		}
		 
		System.out.println(contaCliente2.saldo);
		System.out.println(contaCliente1.saldo);

		contaCliente1.titular = "Paulo Silveira";
		contaCliente2.titular = "Ana Beatriz";
		
		System.out.println(contaCliente1.titular);
		System.out.println(contaCliente2.titular);
		
	}

}
