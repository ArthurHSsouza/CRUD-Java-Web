package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/getMovimentacaoForm")

public class getMovimentacaoForm extends HttpServlet{
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
				int container_id = Integer.parseInt(req.getParameter("id"));
				req.setAttribute("container_id", container_id);
				RequestDispatcher ds = req.getRequestDispatcher("movimentacaoForm.jsp");
				ds.forward(req, res);				
		
		}
}
