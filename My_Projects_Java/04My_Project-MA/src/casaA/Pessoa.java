package casaA;

public class Pessoa {
	private int idade;
	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	//public int lerIdade() {
		//return idade;
	//}
	// Metodo que ler é Getter
	public int getIdade() {
		return idade;
	}
	//public void alterarIdade(int novaIdade) {
		//novaIdade = Math.abs(novaIdade);
		//if(novaIdade >= 0 && novaIdade <= 120) {
			//this.idade = novaIdade;
		//}
	// altera é SEtter
	
		public void setIdade(int novaIdade) {
			novaIdade = Math.abs(novaIdade);
			if(novaIdade >= 0 && novaIdade <= 120) {
				this.idade = novaIdade;
			}
	}
		@Override
		public String toString() {
			
			return "Olá eu tenho " + getIdade() + " anos";
		}
		
}
