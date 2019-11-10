package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class Conexao {

	public Connection getConexao() throws SQLException {
		try {
			System.out.println("conectando...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/loja?useTimezone=true&serverTimezone=UTC",
					"root", "");
		} catch (SQLSyntaxErrorException e) {
			System.out.println("Falha");
			throw new SQLException(e);
			// System.out.println("Falha");
			// return null;
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);

		}
	}
}
