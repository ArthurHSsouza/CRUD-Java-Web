package dao;

import models.Container;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
	
public class ContainerDAO {
	
	private Connection conn;
	private PreparedStatement stmt;
	private Statement st;
	private ResultSet rs;
	private ArrayList<Container> list = new ArrayList();

	public ContainerDAO(){
		conn = new ConnectionFactory().getConexao();
	}
	
	public void insert(Container container) {
		String query = "INSERT INTO containers(cliente, numeroContainer, tipo, status, categoria) "
				+ "VALUES(?,?,?,?,?)";
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, container.getCliente());
			stmt.setString(2, container.getNumeroContainer());
			stmt.setString(3, container.getTipo());
			stmt.setString(4, container.getStatus());
			stmt.setString(5, container.getCategoria());
			stmt.execute();
			stmt.close();
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 2 "+ error);
		}
	}
	
	public void update(Container container, String containerId){
		
		String query = "UPDATE containers SET cliente = ?, numeroContainer = ?, "
				+ "tipo = ?, status = ?, categoria = ?  WHERE id = ?";
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, container.getCliente());
			stmt.setString(2, container.getNumeroContainer());
			stmt.setString(3, container.getTipo());
			stmt.setString(4, container.getStatus());
			stmt.setString(5, container.getCategoria());
			stmt.setString(6, containerId);
			stmt.execute();
			stmt.close();
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 3 "+ error);
		}
	}
	
	public void delete(int containerId) {
		String query = "DELETE FROM containers WHERE id = ?";
		
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, containerId);
			stmt.execute();
			stmt.close();
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 4 "+ error);
		}
	}
	
	public ArrayList<Container> read(){
		
		String query = "SELECT * FROM containers";
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				
				Container c = new Container();
				c.setId(rs.getInt("id"));
				c.setCliente(rs.getString("cliente"));
				c.setNumeroContainer(rs.getString("numeroContainer"));
				c.setTipo(rs.getString("tipo"));
				c.setStatus(rs.getString("status"));
				c.setCategoria(rs.getString("categoria"));
				list.add(c);
			}

		}catch(Exception error) {
			throw new RuntimeException("Erro 5"+ error);
		}
		
		return list;
	}
	
}
