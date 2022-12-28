package ex1228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Operation")
public class ex04Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 문자열 자료형을 정수형으로 변환하는 방법
		// int temp = Integer.parseInt("456");

		// 1. 요청 받은 데이터 꺼내오기
		String temp1 = request.getParameter("num1");
		// 2. 숫자를 연산할 수 있는 자료형으로 변환
		int num1 = Integer.parseInt(temp1);
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
		// 3-0. 출력스트림 꺼내오기
		PrintWriter out = response.getWriter();
		// 3-1. 연산기호의 모양에 따라서 다른 결과를 웹페이지 출력
		int result = 0;
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else {
			result = num1 / num2;
		}

		out.print(num1 + op + num2 + "=" + result);

	}

}
