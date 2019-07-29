package lanqiaoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.QuarryUserService;
import model.User;
@WebServlet("/admin/update")
public class QuaryUserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("userid");
		QuarryUserService q=new QuarryUserService();
		User user=q.quarryUser(id);
		if(user!=null) {
			req.setAttribute("user", user);
			//这里是转发，从Servlet跳转到showinfo.jsp页面，并且带上request和response对象中原有的参数
			req.getRequestDispatcher("/updeate1.jsp").forward(req, resp);
		}
		
		
	}
}
