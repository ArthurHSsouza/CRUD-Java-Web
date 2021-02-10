package controllers;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

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
			m.setEntrada(req.getParameter("entrada"));
			m.setEntrada2(req.getParameter("entrada2"));
			m.setSaida(req.getParameter("saida"));
			m.setSaida2(req.getParameter("saida2"));
			m.setContainer_id(Integer.parseInt(req.getParameter("container_id")));
			try {
				MovimentacaoValidation.validation(m);
				dao.insert(m);
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id"));

			}catch(Exception error) {
				res.sendRedirect("readMovimentacao?id="+req.getParameter("container_id")+
				"&error="+error.getMessage());
	
			}
	}
}
