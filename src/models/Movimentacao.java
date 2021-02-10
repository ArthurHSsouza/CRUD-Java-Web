package models;

import java.util.Date;

public class Movimentacao {

		private int id;
		private String tipo;
		private Date entrada;
		private Date saida;
		private int container_id;
		
		public Date getEntrada() {
			return entrada;
		}
		public void setEntrada(Date entrada) {
			this.entrada = entrada;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public Date getSaida() {
			return saida;
		}
		
		public void setSaida(Date saida) {
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
