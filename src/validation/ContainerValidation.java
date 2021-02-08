package validation;
import models.Container;

public class ContainerValidation {
		
		public static void validation(Container c)  throws Exception{
			
			String cliente = c.getCliente();
			String numeroContainer = c.getNumeroContainer();
			String tipo = c.getTipo();
			String status = c.getStatus();
			String categoria = c.getCategoria();
			
			
			if(cliente == "" || cliente == null) {
				throw new Exception("Cliente invalido");
			}
			if(numeroContainer == "" || numeroContainer == null) {
				throw new Exception("Codigo do Container invalido");
			}
			if(tipo == "" || tipo == null) {
				throw new Exception("Tipo invalido");
			}
			if(status == "" || status == null) {
				throw new Exception("Status invalido");
			}
			if(categoria == "" || categoria == null) {
				throw new Exception("Categoria invalida");
			}
		}
}
