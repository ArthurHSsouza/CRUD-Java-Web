package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import dao.MovimentacaoDAO;
import models.Movimentacao;
import validation.MovimentacaoValidation;


@WebServlet("/movimentacaoUpdate")

public class MovimentacaoUpdate extends HttpServlet{
	
		private MovimentacaoDAO dao = new MovimentacaoDAO();
	
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			Movimentacao m = new Movimentacao();
			m.setTipo(req.getParameter("tipo"));
			m.setEntrada(req.getParameter("entrada")+" "+req.getParameter("entrada2"));
			m.setSaida(req.getParameter("saida")+" "+req.getParameter("saida2"));
			m.setId(Integer.parseInt(req.getParameter("id")));
			
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

