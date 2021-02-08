package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import dao.ContainerDAO;

@WebServlet("/deleteContainer")

public class ContainerDelete extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		int id = Integer.parseInt(req.getParameter("id"));
		ContainerDAO dao = new ContainerDAO();
		dao.delete(id);
		res.sendRedirect("/projeto_porto/");
	}
}
