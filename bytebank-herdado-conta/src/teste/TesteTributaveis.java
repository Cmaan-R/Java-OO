package teste;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
		
		cc.deposita(100);
		
		modelo.SeguroDeVida sd = new modelo.SeguroDeVida();
		
		modelo.CalculadorImposto cal = new modelo.CalculadorImposto();
		cal.registra(cc);
		cal.registra(sd);
		
		System.out.println(cal.getTotalImposto());
		
		
		
		
		
	}

}
