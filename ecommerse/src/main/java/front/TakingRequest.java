package front;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/request")
public class TakingRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
      RequestProcessor rp;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rp.process(request,response);
	}
	 public void init(ServletConfig config) throws ServletException {
	    	rp=new RequestProcessor();
	    }

}
