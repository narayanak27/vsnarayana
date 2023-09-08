package perform;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String username=request.getParameter("username");
		if(username.equals("narayana")) {
			return "Login.Success";
		}
		
		return "Login.Register";
	}

}
