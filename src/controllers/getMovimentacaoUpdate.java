package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/getMovimentacaoFormUpdate")

public class getMovimentacaoUpdate extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			int id = Integer.parseInt(req.getParameter("id"));
			int container_id =  Integer.parseInt(req.getParameter("container_id"));
			
			req.setAttribute("id", id);
			req.setAttribute("container_id", container_id);
			
			RequestDispatcher rd = req.getRequestDispatcher("movimentacaoFormUpdate.jsp");
			rd.forward(req, res);
			
	}
}
