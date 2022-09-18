//Contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//método setSenha
			//método Autentica
public abstract interface Autenticavel {
	
	

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
	
	

}