package lanqiaoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.DeleteService;
@WebServlet("/admin/delete")
public class DeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("userid");
		DeleteService d=new DeleteService();
		int i=d.deleteService(id);
		if(i!=0) {
			req.getRequestDispatcher("/admin/quarry").forward(req, resp);
			req.setAttribute("loginError", "É¾³ý³É¹¦");
		}
		
		
		
		
		
	}
}
