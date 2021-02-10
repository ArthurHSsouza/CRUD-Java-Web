package validation;

import java.util.Date;

import models.Movimentacao;

public class MovimentacaoValidation {
		
	public static void validation(Movimentacao m)  throws Exception{
		
		String tipo = m.getTipo();
		Date entrada = m.getEntrada();
		Date saida = m.getSaida();
		
		if(tipo == "" || tipo == null) {
			throw new Exception("Tipo invalido");
		}
		if(entrada == null) {
			throw new Exception("Entrada invalida");
		}
		if(saida == null) {
			throw new Exception("Saida Invalida");
		}
		if(entrada.after(saida)) {
			throw new Exception("A entrada nao pode ocorrer antes da saida");
		}
		
		
	}
	
}
