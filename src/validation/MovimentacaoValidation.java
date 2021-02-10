package validation;

import models.Movimentacao;

public class MovimentacaoValidation {
		
	public static void validation(Movimentacao m)  throws Exception{
		
		String tipo = m.getTipo();
		String entrada = m.getEntrada();
		String saida = m.getSaida();
		String entrada2 = m.getEntrada2();
		String saida2 = m.getSaida2();
		
		
		if(tipo == "" || tipo == null) {
			throw new Exception("Tipo invalido");
		}
		if(entrada == "" || entrada == null) {
			throw new Exception("Entrada invalida");
		}
		if(saida == "" || saida == null) {
			throw new Exception("Saída Invalida");
		}
		if(entrada2 == "" || entrada2 == null) {
			throw new Exception("Entrada invalida");
		}
		if(saida2 == "" || saida2 == null) {
			throw new Exception("Saída Invalida");
		}
		
	}
	
}
