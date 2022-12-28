package ex1228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class ex03Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 1. 요청받은 데이터 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 2. 데이터의 id값이 smart 이면서 pw 123인지 조건 비교
		// 3-0. 한글 인코딩 잡아주기
		response.setContentType("text/html;charset=utf-8");
		// 3-1. 출력 스트림 꺼내오기
		PrintWriter out = response.getWriter();
		if(id.equals("smart") && pw.equals("123")) {
			// 3. 조건이 참이라면 smart님 환영합니다 출력
			out.print("<h1>");
			out.print(id+"님 환영합니다~");
			out.print("</h1>");
		}else {
			// 4. 로그인 정보를 확인하세요 출력
			out.print("<h1>로그인 정보를 확인하세요</h1>");
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
