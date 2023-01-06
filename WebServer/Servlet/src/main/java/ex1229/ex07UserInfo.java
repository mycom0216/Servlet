package ex1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class ex07UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 1. 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		// 2. 요청받은 데이터 꺼내오기
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		// name 값은 하나인데, 여러개의 데이터를 받아와야하는 경우
		// >> request.getParameterValues() 사용
		// >>>> 리턴타입 : String[] 형식!
		// 3. 출력 스트림 꺼내오기
		PrintWriter out = response.getWriter();
		// 4. 웹페이지 출력
		out.print("<h1>"+job+"</h1>");
		out.print("<h1>"+gender+"</h1>");
		for(int i = 0; i < hobby.length; i++) {
			out.print("<h1>"+hobby[i]+"</h1>");
			
		}
		
		
	}

}
