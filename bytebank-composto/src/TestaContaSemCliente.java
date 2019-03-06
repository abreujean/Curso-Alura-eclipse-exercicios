
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.tirular = new Cliente();
		System.out.println(contaDaMarcela.tirular);
		
		contaDaMarcela.tirular.nome = "Marcela";
		System.out.println(contaDaMarcela.tirular.nome);
		
	}

}
