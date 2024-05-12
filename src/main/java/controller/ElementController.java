package controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ElementDao;
import model.Element;

/**
 * Servlet implementation class ElementController
 */
@WebServlet(name="ElementController", urlPatterns= {"/index.jsp"})
public class ElementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ElementDao elementDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElementController() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		elementDao = (ElementDao) config.getServletContext().getAttribute("elementDao");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Collection<Element> elements = elementDao.findAll();
		request.setAttribute("elements", elements);
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
