

import java.io.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.DbConnection;

/**
 * Servlet implementation class Ecommerce
 */
@WebServlet("/Ecommerce")
public class Ecommerce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ecommerce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pno = request.getParameter("productId");
		try
		{
			Connection conObj = DbConnection.getConnection();
			PreparedStatement psObj = conObj.prepareStatement("Select * from products where product_id=?");
			psObj.setInt(1, Integer.parseInt(pno));
			ResultSet  rs = psObj.executeQuery();
			if(rs.next())
			{
				out.print("<table width='100%' border='2'>");
				out.print("<tr><th>PROD_ID</th><th>PROD_Nme</th><th>PROD_DESCRIPTION</th><th>PROD_PRICE</th><th>PROD_STOCK</th><th>PROD_CATEGORY</th></tr>");
				out.print("<tr>");
				out.print("<td>" + rs.getInt("product_id") + "</td>");
				out.print("<td>" + rs.getString("product_name") + "</td>");
				out.print("<td>" + rs.getString("product_description") + "</td>");
				out.print("<td>" + rs.getInt("product_price") + "</td>");
				out.print("<td>" + rs.getInt("product_stock") + "</td>");
				out.print("<td>" + rs.getString("product_category") + "</td>");
				out.print("</tr>");
				out.print("</table>");
			}
			else
			{
				out.print("<table>");
				out.print("<tr><td><h2>product Not Found</h2></td</tr>");
				out.print("</table>");
			}
			out.print("<p style='text-align:center;width:100%'>");
			out.print("<h3><a href='main.html'>Back</a></h3></p>");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
        
				
	}

}
