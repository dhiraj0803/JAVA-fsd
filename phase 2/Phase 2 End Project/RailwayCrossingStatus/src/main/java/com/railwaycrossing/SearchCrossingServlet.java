package com.railwaycrossing;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SearchCrossingServlet", urlPatterns = { "/searchCrossing" })
public class SearchCrossingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int searchId = Integer.parseInt(request.getParameter("searchId"));

		
		RailwayCrossingDatabaseOp crossingDAO = new RailwayCrossingDatabaseOp();
		RailwayCrossing crossing = crossingDAO.getCrossingById(searchId);

		request.setAttribute("crossing", crossing);

		request.getRequestDispatcher("adminHome.jsp").forward(request, response);
	}
}
