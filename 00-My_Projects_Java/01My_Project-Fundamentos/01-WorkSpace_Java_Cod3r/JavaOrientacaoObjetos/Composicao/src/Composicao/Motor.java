package Composicao;

public class Motor {
double fatorInjecao1 = 1;
	
	boolean ligado = false;
	double fatorInjecao = 1;
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao1 * 3000);
		}
		
	}
}
