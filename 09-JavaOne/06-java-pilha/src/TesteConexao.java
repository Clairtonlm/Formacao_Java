
public class TesteConexao {

	public static void main(String[] args) {
		
		//5ª opção- Quando coloca execeção no construtor
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
				
				
				
				
				
		//4ª opção- Try sozinho nao pode tem que ser usado com catch ou varios catch ou com finally
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		}finally {
//			con.close();
//			System.out.println("------------------------------");
//		
//		}
	
		
		//3ª opção - usando finally- ele é executado mesmo tento erro
		
//		Conexao con1 = null;
//		try {
//			//con1 = new Conexao();
//			
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		}finally {
//			con1.fecha();
//		}
//		
		
//		//2ª opção- inicializa a variavel fora, mas repete codigo con.fechar();
//		Conexao con = null;
//		try {
//			 con = new Conexao();
//			con.leDados();
//			con.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//			con.fecha();
//		}
		
		
		// 1ª opção - ele nao fecha a conexção
//		try {
//			Conexao con = new Conexao();
//			con.leDados();
//			con.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		}
	
	}
}

