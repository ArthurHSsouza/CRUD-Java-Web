package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Container;
import validation.ContainerValidation;

import java.io.IOException;

import dao.ContainerDAO;

@WebServlet("/containerUpdate")

public class ContainerUpdate extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String cliente = req.getParameter("cliente");
		String numeroContainer = req.getParameter("numeroContainer");
		String tipo = req.getParameter("tipo");
		String status = req.getParameter("status");
		String categoria = req.getParameter("categoria");
		
		Container c = new Container();
		c.setCliente(cliente);
		c.setNumeroContainer(numeroContainer);
		c.setTipo(tipo);
		c.setStatus(status);
		c.setCategoria(categoria);
		
		
		try {
			ContainerValidation.validation(c);
			ContainerDAO containerDAO = new ContainerDAO();
			containerDAO.update(c, numeroContainer);
			res.sendRedirect("/projeto_porto/");
		}catch(Exception error) {
			res.sendRedirect("/projeto_porto/?error="+error.getMessage());
		}
		
	}
}
