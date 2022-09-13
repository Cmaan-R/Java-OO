
public class SistemaInterno {
	
	private int senha = 222;
	
	public void autentica(FuncionarioAutenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso Concedido");
		} else {
			System.out.println("Acesso Negado");
		}
	}

}
