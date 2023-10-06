package com.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

import com.connection.Hiberconfig;
import com.entities.*;

/**
 * Servlet implementation class Addproduct
 */
@WebServlet("/Addproduct")
public class Addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 	response.setContentType("text/html");
	            String name = request.getParameter("name");
	            String description = request.getParameter("description");
	            double price = Double.parseDouble(request.getParameter("price"));
	            
	            // Create a new product instance
	            
	            
	            // Hibernate setup
	            //Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	            //SessionFactory factory = cfg.buildSessionFactory();
	            SessionFactory sf = Hiberconfig.getSessionFactory();
	            Session session = sf.openSession();
	            
	            // Begin transaction
	            Transaction tx = session.beginTransaction();
	            
	            Product product = new Product();
	            product.setName(name);
	            product.setDescription(description);
	            product.setPrice(price);
	            
	            // Save the product to the database
	            session.save(product);
	            
	            // Commit transaction and close resources
	            tx.commit();
	            session.close();
	            
	            response.sendRedirect("added.jsp"); // Redirect to a success page
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	            response.sendRedirect("error.jsp"); // Redirect to an error page
	        }
	}

}
