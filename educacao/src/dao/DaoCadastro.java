package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.BeanCadastro;
import connection.SingleConnection;

public class DaoCadastro {
	
	private Connection connection;
	
	public DaoCadastro() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvarCadastro(BeanCadastro cadastro) {
		
		try {
		String sql = "INSERT INTO ps_inscrito (nome_completo, genero ,cpf, telefone, data_nascimento, email, id_cidade, id_escola VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setString(1, cadastro.getNome_completo());
		insert.setInt(2, cadastro.getGenero());
		insert.setString(3, cadastro.getCpf());
		insert.setString(4, cadastro.getTelefone());
		insert.setString(5, cadastro.getData_nascimento());
		insert.setString(6, cadastro.getEmail());
		insert.setInt(7, cadastro.getId_cidade());
		insert.setInt(8, cadastro.getId_escola());
		
		insert.execute();
		
			connection.commit();
		}catch(Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
