package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Container;
import java.util.ArrayList;
import dao.ContainerDAO;

@SuppressWarnings("serial")
@WebServlet("/")
public class Main extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		ContainerDAO dao = new ContainerDAO();
		ArrayList<Container> list = dao.read();
		if(req.getParameter("error") != "")
			req.setAttribute("error", req.getParameter("error"));
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("mainFile.jsp");
		rd.forward(req, res);
		
	}
		
}
