package ex1228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/makeTable")
public class ex01makeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 1. 출력 스트림 꺼내오기
		PrintWriter out = response.getWriter();
		// 2. 출력 스트림 활용해서 table 태그 만들어내기
		// ---> 1행 6열
		out.print("<table border='1'>");
		
		out.print("<tr>");
		
		for(int i = 1; i < 7; i++) {
			
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			
		}
		
		out.print("</tr>");
				
		out.print("</table>");
		// 3. 전부 하나씩하나씩 코드를 작성
		// ---> 반복문을 활용해서 해당하는 코드를 줄이기
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
