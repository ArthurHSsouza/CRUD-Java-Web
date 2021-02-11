package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.MovimentacaoDAO;
import models.Movimentacao;
import validation.MovimentacaoValidation;


@SuppressWarnings("serial")
@WebServlet("/movimentacaoUpdate")

public class MovimentacaoUpdate extends HttpServlet{
	
		private MovimentacaoDAO dao = new MovimentacaoDAO();
	
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			Movimentacao m = new Movimentacao();
			m.setTipo(req.getParameter("tipo"));
			String entradaString = req.getParameter("entrada");
			String saidaString = req.getParameter("saida");
			m.setId(Integer.parseInt(req.getParameter("id")));
			
			entradaString = entradaString.replace("T", " ");
			saidaString = saidaString.replace("T", " ");
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
			Date entrada = null;
			Date saida = null;
			
			try {
				
				 entrada = df.parse(entradaString);
				 saida = df.parse(saidaString);
				 m.setEntrada(entrada);
				 m.setSaida(saida);
				 
			} catch (ParseException e) {
				e.printStackTrace();
			}
		
			try {
				MovimentacaoValidation.validation(m);
				dao.update(m);
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id"));

			}catch(Exception error) {
				
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id")+
				"&error="+error.getMessage());
			}
		}
}

