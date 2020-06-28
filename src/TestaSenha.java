
public class TestaSenha {

	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente("Pedro","555.555.555-55", 2500.0);
		Diretor diretor = new Diretor("Arthur","333.333.333-55", 2500.0);
		Cliente cliente = new Cliente();
		
		SistemaInterno autenticador = new SistemaInterno();
		
		gerente.setSenha(131);
		diretor.setSenha(131);
		cliente.setSenha(131);
		
		autenticador.autentica(gerente);	
		autenticador.autentica(diretor);	
		autenticador.autentica(cliente);	
		
		

	}

}
