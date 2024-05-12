package controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import dao.ElementDao;
import dao.InMemoryElementDao;
import database.TestDatabaseCreator;

/**
 * Application Lifecycle Listener implementation class ElementServletListener
 *
 */
@WebListener
public class ElementServletListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ElementServletListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {}

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ElementDao elementDao = new InMemoryElementDao();
    	TestDatabaseCreator.create(elementDao);
    	sce.getServletContext().setAttribute("elementDao", elementDao);
    }
	
}
