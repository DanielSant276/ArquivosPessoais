

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/daniel.do")
public class questao1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public questao1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.print(hora.format(formato));
		response.getWriter().write(hora.format(formato));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		Random gerador = new Random();

		// gera um número de idade até 100
        int numeroRandom = gerador.nextInt(100 - idade) + idade + 1;
               
        String number = Integer.toString(numeroRandom);
        	
        System.out.print(number);
        if (numeroRandom % 2 == 0) {
        	try {
	        	Thread.sleep(2000);
	        	response.getWriter().write(number);
        	}
        	catch (Exception e){
                System.err.println(e);
        	}
        }
		else {
			response.getWriter().write(number);
		}
	}
}
