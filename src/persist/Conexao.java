package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Conexao() {
		try {
			// Necessário para utilizar o driver JDBC do MySQL
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			// Erro de driver JDBC
			e.printStackTrace();
		}
		
	}
	
	


protected Connection getConnection() throws SQLException {
	//URL de conexão com o banco de dados
	String url = "jdbc:mysql://localhost/banco";
	//Conectar utilizando a URL, usuário e senha.
	Connection conn = DriverManager.getConnection(url, "root", "");
	return conn;
	}

}
