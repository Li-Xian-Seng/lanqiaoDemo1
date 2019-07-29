package lanqiaoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.LoginService;
import Service.UserQuarryService;
import model.User;
@WebServlet("/admin/login")
public class LoginServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	LoginService l=new LoginService();	
	

	if(l.loginService(name, password)!=null) {
//		req.getSession().setAttribute("longinKey", name);
		resp.sendRedirect(req.getContextPath()+"/admin/quarry");  //�ض���
		
		//������ת������Servlet��ת��showinfo.jspҳ�棬���Ҵ���request��response������ԭ�еĲ���
//		req.getRequestDispatcher("/main.jsp").forward(req, resp);
	}else {
		req.setAttribute("loginError", "�û����������");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	}
}
