//Gerente é um funcoinario, gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificacao do Editor do Designer");
		return 200;
	}
		
}
