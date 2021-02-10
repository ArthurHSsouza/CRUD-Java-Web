package models;


public class Movimentacao {

		private int id;
		private String tipo;
		private String entrada;
		private String saida;
		private String entrada2;
		private String saida2;
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
		public String getEntrada2() {
			return entrada2;
		}
		public void setEntrada2(String entrada2) {
			this.entrada2 = entrada2;
		}
		public String getSaida2() {
			return saida2;
		}
		public void setSaida2(String saida2) {
			this.saida2 = saida2;
		}	
		
}
