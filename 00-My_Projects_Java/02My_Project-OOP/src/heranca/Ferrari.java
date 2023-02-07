package heranca;

public class Ferrari extends Carro implements Esportivo{
	
	Ferrari(){
		this(315);
	}
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	@Override
	public void ligarTurbo() {
		delta = 100;
		
	}
	@Override
	public void desligarTurbo() {
		delta = 15;
		
	}
	
	//@Override
	//void acelerar() {
		//velocidadeAtual +=15;
	//}
}