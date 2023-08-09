import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_virtual?"
				+ "useTimezone=true&serverTimezone=UTC","root", "root");
		System.out.println("Fechando Conexão com Banco de Dados");
		
		
		Statement stm = (Statement) con.createStatement();
		boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		con.close();
	}

}
