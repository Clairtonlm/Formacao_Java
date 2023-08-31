package loops;

public class LoopFor {

	public static void main(String[] args) {
		//for(inicialização; condição; atualzação)
		System.out.println("Loop com for");
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(" è par " + i);
			}else {
				System.out.println("O valor de iimpa: " + i);
			}
			
		}
		
		for(int i = 0, j=10; i<j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		int i = 0;
		for(; i <= 5;) {
			System.out.println("Valor de i = " + i);
			i++;
		}

	}//main

}
