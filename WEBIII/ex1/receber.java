package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Receber")
public class Receber extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Receber() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var nome = request.getParameter("nome");
		var cpf = request.getParameter("cpf");
		var matricula = request.getParameter("matricula");
		
		System.out.println(String.format("nome: %s cpf: %s matricula: %s", nome, cpf, matricula));
	}

}
