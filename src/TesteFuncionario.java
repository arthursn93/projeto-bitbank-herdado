
public class TesteFuncionario {

	public static void main(String[] args) {
		Desenvolvedor funcionario = new Desenvolvedor("Arthur","333.333.333-33",2500);
		
		Funcionario x = new Designer("adasd","123123",2133);
		System.out.println(x.getNome());
		
		System.out.println(funcionario.getSalario());	
		System.out.println(funcionario.getBonificacao());	
		System.out.println(funcionario.getNome());
		
		Designer designer = new Designer("Pedro","222.222.222-22", 2300);
		System.out.println(designer.getSalario());
		
//		Gerente gerente = new Gerente("Mario", "777.777.777-22", 5600);
//		SistemaInterno autentica = new SistemaInterno(1234);
//		
//		autentica.autentica(1234, gerente);
//		
//		System.out.println(gerente.getSenha());
//		
//		System.out.println(gerente.getBonificacao());
		
		Diretor diretor = new Diretor("Marjori", "444.444.444-44", 8500);
		System.out.println(diretor.getBonificacao());
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Ricardo", "777.777.777-88", 3500);
		System.out.println(desenvolvedor.getBonificacao());
	}
}
