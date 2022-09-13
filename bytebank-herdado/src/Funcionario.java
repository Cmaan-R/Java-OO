//Não pode isntanciar apartir dessa classe, porque agora é Abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario() {

	}

	// Metódo sem corpo, por ser Abstrato, Não há implementação aqui
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
