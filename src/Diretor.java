
public class Diretor extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	

}
