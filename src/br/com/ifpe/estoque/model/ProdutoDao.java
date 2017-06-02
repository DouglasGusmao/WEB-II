package br.com.ifpe.estoque.model;

import java.sql.Date;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.com.ifpe.estoque.util.ConnectionFactory;


public class ProdutoDao {

	private Connection connection;

	public ProdutoDao() {
		try {
			this.connection = (Connection) new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void salvar(Produto produto) {
		try {
			String sql = "INSERT INTO produto (codigo, descricao, preco_custo, preco_venda, garantia, quantidade) VALUES (?,?,?,?,?,?)";
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, produto.getCodigo());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPrecoCusto());
			stmt.setDouble(4, produto.getPrecoVenda());
			stmt.setDate(5, new java.sql.Date(produto.getGarantia().getTime()));
			stmt.setInt(6, produto.getQuantidade());
			

			stmt.execute();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
