
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class export
 */
@WebServlet("/export")
public class export extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public export() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String fileName1 = "test.doc";		
		String fileName2 = "test.xls";	
		String fileName3 = "test.pdf";	
		
		
		String prm1 = request.getParameter("p1");
		String prm2 = request.getParameter("p2");
		String prm3 = request.getParameter("p3");
		
		String secim = request.getParameter("secim");
		
		if(secim.equals("Word")) {
			response.setContentType("application/msword");
			
			response.setHeader("Content-disposition", "attachment; fileName=\"" + fileName1 + "\"" );
			
			response.getWriter().printf(" Ogrenci : %s  %s  %s ",prm1,prm2,prm3);
			
			
		}
		else if(secim.equals("Excel")) {
			response.setContentType("application/vnd.ms-excel");
			
			response.setHeader("Content-disposition", "attachment; fileName=\"" + fileName2 + "\"" );
			
			response.getWriter().printf(" Ogrenci\t%s  \t%s  \t%s ",prm1,prm2,prm3);
			
		}
		
		else if(secim.equals("Pdf")) {
			response.setContentType("application/pdf");

			response.setHeader("Content-disposition", "attachment; fileName=\"" + fileName3 + "\"" );
			
			response.getWriter().printf(" Ogrenci : %s  %s  %s ",prm1,prm2,prm3);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
