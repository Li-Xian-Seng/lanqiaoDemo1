package lanqiaoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserAddService;
@WebServlet("/admin/user")
public class UserAddServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String username=req.getParameter("name");
	String password=req.getParameter("password");
	String name=req.getParameter("listname");
	String age=req.getParameter("age");
	String email=req.getParameter("email");
	String tel=req.getParameter("tel");
	System.out.println(username);
	String q = null;
	UserAddService u=new UserAddService();
	if(u.userAddService(username, password, name, age, email, tel)!=0) {
		req.getRequestDispatcher("/admin/quarry").forward(req, resp);
	
	}else {
		req.setAttribute("AddError", "ÃÌº”“Ï≥£");
		req.getRequestDispatcher("/registered.jsp").forward(req, resp);
	}
	
	
	
}
}
