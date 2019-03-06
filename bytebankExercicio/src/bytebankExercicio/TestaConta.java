package bytebankExercicio;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta contaDoJean = new Conta();
		contaDoJean.titular = new Cliente();
		
		contaDoJean.titular.nome = "Jean da Costa Abreu";
		System.out.println(contaDoJean.titular.nome);
		

	}

}
