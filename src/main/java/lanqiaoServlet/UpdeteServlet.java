package lanqiaoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UpdeteService;
import Service.UserAddService;
@WebServlet("/admin/updete1")
public class UpdeteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		String tel=req.getParameter("tel");
		String id=req.getParameter("userId");
		
		UpdeteService u=new UpdeteService();
		if(u.updeteService(username, password, name, age, email, tel, id)!=0) {
			
			req.getRequestDispatcher("/admin/quarry").forward(req, resp);
		
		}else {
			req.setAttribute("AddError", "ÃÌº”“Ï≥£");
			req.getRequestDispatcher("/registered.jsp").forward(req, resp);
		}
		
		
		
	}
}
