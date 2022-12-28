package ex1228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Star")
public class ex05Star extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 요청받은 색상 꺼내오기
		String color = request.getParameter("color");
		// 2. 요청받은 줄 수 꺼내오기(정수형으로)
		String tempRow = request.getParameter("row");
		int row = Integer.parseInt(tempRow);
		// 3. 줄 수에 맞게 table의 tr태그 생성하기
		PrintWriter out = response.getWriter();
		out.print("<table border = '1'>");

		for (int j = 1; j <= row; j++) {
			if (j % 2 == 1) {
				out.print("<tr bgcolor='" + color + "'>");
			} else {
				out.print("<tr>");
			}
			for (int i = 0; i < j; i++) {
				out.print("<td>*</td>");
			}
			out.print("</tr>");
		}

		out.print("</table>");

		// 4. 안쪽에 td 태그를 활용하여 * 찍기

		// 5. 단, 홀수행(tr)인 경우 배경색상 적용시키기

	}

}
