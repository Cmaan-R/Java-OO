
public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		
		cc.deposita(100);
		
		SeguroDeVida sd = new SeguroDeVida();
		
		CalculadorImposto cal = new CalculadorImposto();
		cal.registra(cc);
		cal.registra(sd);
		
		System.out.println(cal.getTotalImposto());
		
		
		
		
		
	}

}
