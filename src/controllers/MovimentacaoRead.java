package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.MovimentacaoDAO;
import models.Movimentacao;
import java.util.ArrayList;

@WebServlet("/readMovimentacao")

public class MovimentacaoRead extends HttpServlet{

	private MovimentacaoDAO dao = new MovimentacaoDAO();
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		 
		int container_id = Integer.parseInt(req.getParameter("id"));
		if(req.getParameter("error") != null) {
			req.setAttribute("error", req.getParameter("error"));
		}
		
		ArrayList<Movimentacao> list = dao.read(container_id);
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("exibirMovimentacao.jsp");
		rd.forward(req, res);
	}
	
}

