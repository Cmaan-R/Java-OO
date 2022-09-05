
public class TesteSacaNegativo {

	public static void main(String[] args) {

		Conta c = new Conta();
		c.deposita(100);

		System.out.println(c.saca(200));
		
		c.saca(101);

		System.out.println(c.getSaldo());
		
		
		
	}

}
