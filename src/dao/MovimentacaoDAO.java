package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Movimentacao;
import java.util.Locale;

public class MovimentacaoDAO {

	private PreparedStatement stmt;
	private Statement st;
	private Connection conn;
	private ResultSet rs;
	private ArrayList<Movimentacao> list = new ArrayList<>();
	
	public MovimentacaoDAO() {
		conn = new ConnectionFactory().getConexao();
	}
	
	public void insert(Movimentacao m) {
		
		String query = "INSERT INTO movimentacoes(tipo,entrada,saida,container_id) VALUES (?,?,?,?)";
		
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, m.getTipo());
			stmt.setString(2, m.getEntrada().toString());
			stmt.setString(3, m.getEntrada().toString());
			stmt.setInt(4, m.getContainer_id());
			stmt.execute();
			stmt.close();
		 
		}catch(Exception error) {
			throw new RuntimeException("Erro 1 "+error);
		}
	}
	
	public void update(Movimentacao m) {
		
		String query = "UPDATE movimentacoes SET tipo = ?, entrada = ?, saida = ? WHERE id = ?";
		
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, m.getTipo());
			stmt.setString(2, m.getEntrada().toString());
			stmt.setString(3, m.getEntrada().toString());
			stmt.setInt(4, m.getId());
			stmt.execute();
			stmt.close();
		 
		}catch(Exception error) {
			throw new RuntimeException("Erro 2 "+error);
		}
	}
	
	public void delete(int id) {
		
		String query = "DELETE FROM movimentacoes WHERE id= ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 3 "+error);
		}
	}
	
	
	public ArrayList<Movimentacao> read(int container_id) {
		
		list = new ArrayList<>();
		String query = "SELECT * FROM movimentacoes WHERE container_id ="+container_id;
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
			
			while(rs.next()) {
				Movimentacao m = new Movimentacao();
				m.setId(rs.getInt("id"));
				m.setTipo(rs.getString("tipo"));
				m.setEntrada(df.parse(rs.getString("entrada")));
				m.setSaida(df.parse(rs.getString("saida")));
				m.setContainer_id(rs.getInt("container_id"));
				list.add(m);
			}
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 4 "+error);
		}
		
		return list;
	}
}
		

	
