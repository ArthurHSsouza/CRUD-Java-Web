package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getContainerUpdate")

public class GetContainerUpdate extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
			
			String id = req.getParameter("id");
			req.setAttribute("id", id);
			RequestDispatcher dis = req.getRequestDispatcher("containerFormUpdate.jsp");
			dis.forward(req, res);
			
		}
}
