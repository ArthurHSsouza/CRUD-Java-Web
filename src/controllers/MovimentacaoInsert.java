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
@WebServlet("/addMovimentacao")
         
public class MovimentacaoInsert extends HttpServlet{
	
	private MovimentacaoDAO dao = new MovimentacaoDAO();
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			Movimentacao m = new Movimentacao();
			
			m.setTipo(req.getParameter("tipo"));	
			m.setContainer_id(Integer.parseInt(req.getParameter("container_id")));
			String entradaString = req.getParameter("entrada");
			String saidaString = req.getParameter("saida");
			
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
				dao.insert(m);
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id"));

			}catch(Exception error) {
				System.out.println(error.getMessage());
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id")+
				"&error="+error.getMessage());
	
			}
	}
}
