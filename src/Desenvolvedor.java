
public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}
	
	public double getBonificacao() {
		return 300;
	}
	
}
