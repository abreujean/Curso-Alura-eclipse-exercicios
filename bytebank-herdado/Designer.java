//Gerente � um funcoinario, gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o m�todo de bonificacao do Editor do Designer");
		return 200;
	}
		
}
