package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import dao.MovimentacaoDAO;


@WebServlet("/deleteMovimentacao")

public class MovimentacaoDelete extends HttpServlet{
	
		private MovimentacaoDAO dao = new MovimentacaoDAO();
		
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			int id = Integer.parseInt(req.getParameter("id"));
			int container_id = Integer.parseInt(req.getParameter("container_id"));
			dao.delete(id);
			
			res.sendRedirect("readMovimentacao?id="+container_id);
		}
}
