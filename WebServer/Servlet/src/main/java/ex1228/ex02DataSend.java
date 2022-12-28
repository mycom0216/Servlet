package ex1228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DataSend")
public class ex02DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 1. 요청받은 데이터를 꺼내오는 방법
		String data = request.getParameter("data");
		
		// 2. 요청받은 데이터를 웹페이지에 출력
		PrintWriter out = response.getWriter();
		out.print(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
