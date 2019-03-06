//Gerente é um funcoinario, gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificacao do Editor de Video");
		return 150;
	}
	
			
}
