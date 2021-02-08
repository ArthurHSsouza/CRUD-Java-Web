package models;
import java.sql.Date;

public class Movimentacao {

		private int id;
		private String tipo;
		private String entrada;
		private String saida;
		private int container_id;
		
		public String getEntrada() {
			return entrada;
		}
		public void setEntrada(String entrada) {
			this.entrada = entrada;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getSaida() {
			return saida;
		}
		
		public void setSaida(String saida) {
			this.saida = saida;
		}
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public int getContainer_id() {
			return container_id;
		}
		public void setContainer_id(int container_id) {
			this.container_id = container_id;
		}	
		
}
