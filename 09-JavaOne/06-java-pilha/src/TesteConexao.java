
public class TesteConexao {

	public static void main(String[] args) {
		//3ª opção - usando finally- ele é executado mesmo tento erro
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
			
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}finally {
			con.fecha();
		}
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
