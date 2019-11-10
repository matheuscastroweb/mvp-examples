package persistency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Produto;

public class ProdutoDAO {
	private Connection conexao;
	private String comandoSQL;
	private PreparedStatement stmt;

	public ProdutoDAO() {
		try {
			this.conexao = new Conexao().getConexao();
		} catch (SQLException e) {
			System.out.println("Problema ao instaciar conexao!" + e.getMessage());
		}
	}

	public Produto selectPorNome(Produto p) {
		try {
			if (conexao.isClosed()) {
				conexao = new Conexao().getConexao();
			}
		} catch (SQLException e) {
			System.out.println("Erro na conexão");
		}

		this.comandoSQL = "select * from produto where nome=? ";
		Produto produto = new Produto();
		try {
			this.stmt = conexao.prepareStatement(comandoSQL);
			stmt.setString(1, p.getNome());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setPreco(rs.getDouble("preco"));

			}
			return produto;
		} catch (SQLException e) {
			System.out.println("não foi possivel listar!");
			return null;
		} finally {
			try {
				stmt.close();
				conexao.close();
				// System.out.println(conexao);
			} catch (SQLException e) {
				System.out.println("Erro ao fechar banco de dados!");
			}
		}

	}

	public Boolean inserir(Produto produto) {
		try {
			if (conexao.isClosed()) {
				conexao = new Conexao().getConexao();
			}
		} catch (SQLException e) {
			System.out.println("Erro na conexão");
		}

		this.comandoSQL = "insert into produto(nome,preco)values(?,?) ";
		
		try {
			this.stmt = conexao.prepareStatement(comandoSQL);
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.execute();

			return true;
		} catch (SQLException e) {
			System.out.println("não foi possivel cadastrar!"+e.getMessage());
			return false;
		} finally {
			try {
				stmt.close();
				conexao.close();
				// System.out.println(conexao);
			} catch (SQLException e) {
				System.out.println("Erro ao fechar banco de dados!");
			}
		}
	}

}
