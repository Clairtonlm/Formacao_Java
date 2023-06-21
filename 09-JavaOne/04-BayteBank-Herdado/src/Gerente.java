
public class Gerente extends FuncionarioAutenticavel {
	
	
	//reescrita de metodo
	public double getBonificacao() {
		System.out.println("Gerente");
		return  super.getSalario();
	}
	
	
	
	
	
}//fim da classe
