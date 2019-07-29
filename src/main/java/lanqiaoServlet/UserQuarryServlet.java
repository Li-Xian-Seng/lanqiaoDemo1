package lanqiaoServlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserQuarryService;
import model.User;
@WebServlet("/admin/quarry")
public class UserQuarryServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		UserQuarryService s=new UserQuarryService();
		List<User> list= s.userquarryService();
	
			req.setAttribute("list", list);
			//这里是转发，从Servlet跳转到showinfo.jsp页面，并且带上request和response对象中原有的参数
			req.getRequestDispatcher("/index2.jsp").forward(req, resp);

		
	}
}
