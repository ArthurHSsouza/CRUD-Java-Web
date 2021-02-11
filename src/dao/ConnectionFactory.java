package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConexao() {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/sistema_porto?serverTimezone=UTC","root","");
			
		}catch(Exception error) {
			throw new RuntimeException("Erro 1: "+error);
		}
	}
}
