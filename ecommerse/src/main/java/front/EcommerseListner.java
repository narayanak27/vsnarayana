package front;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EcommerseListner
 *
 */
@WebListener
public class EcommerseListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EcommerseListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
         ServletContext ctx=sce.getServletContext();
         String path=ctx.getRealPath("/WEB-INF/lib/execution.properties");
         Properties prop=new Properties();
         prop.load(new FileInputStream(path));
         ctx.setAttribute("prop", prop);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	
}
