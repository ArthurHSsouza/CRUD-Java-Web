package validation;
import models.Container;

public class ContainerValidation {
	
		
		public static void validation(Container c)  throws Exception{
			
			String cliente = c.getCliente();
			String numeroContainer = c.getNumeroContainer();
			String tipo = c.getTipo();
			String status = c.getStatus();
			String categoria = c.getCategoria();
			
			
			//Cliente
			if(cliente == "" || cliente == null) {
				throw new Exception("Cliente invalido");
			}
			
			
			//Codigo de container
			if(numeroContainer == "" || numeroContainer == null || numeroContainer.length() != 11) {
				throw new Exception("Codigo do Container invalido");
			}
			
			if(!numeroContainer.substring(0, 4).matches("[A-Z][A-Z][A-Z][A-Z]")) {
				throw new Exception("Codigo do Container invalido");
			}
			try {
				Integer.parseInt(numeroContainer.substring(4,numeroContainer.length()));
				
			}catch(Exception e) {
				throw new Exception("Codigo do Container invalido");
			}
			
			//tipo
			if(tipo == "" || tipo == null) {
				throw new Exception("Tipo invalido");
			}
			
			//status
			if(status == "" || status == null) {
				throw new Exception("Status invalido");
			}
			
			//categoria
			if(categoria == "" || categoria == null) {
				throw new Exception("Categoria invalida");
			}
		}
}
