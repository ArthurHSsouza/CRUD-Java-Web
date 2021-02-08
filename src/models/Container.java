package models;

public class Container {
	
	private String cliente;
	private String numeroContainer;
	private String tipo;
	private String status;
	private String categoria;
	private int id;
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumeroContainer() {
		return numeroContainer;
	}
	public void setNumeroContainer(String numeroContainer) {
		this.numeroContainer = numeroContainer;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
