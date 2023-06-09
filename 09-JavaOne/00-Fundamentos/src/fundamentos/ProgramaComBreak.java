package fundamentos;

public class ProgramaComBreak {

	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print(coluna+1);
			}
			System.out.println();
		}
		
	}

}
