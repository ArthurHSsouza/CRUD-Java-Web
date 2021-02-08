package validation;

import models.Movimentacao;

public class MovimentacaoValidation {
		
	public static void validation(Movimentacao m)  throws Exception{
		
		String tipo = m.getTipo();
		String entrada = m.getEntrada();
		String saida = m.getSaida();
		
		if(tipo.trim() == "" || tipo == null) {
			throw new Exception("Cliente invalido");
		}
		if(entrada.trim() == "" || entrada == null) {
			throw new Exception("Codigo do Container invalido");
		}
		if(saida.trim() == "" || saida == null) {
			throw new Exception("Tipo invalido");
		}
		
	}
	
}
