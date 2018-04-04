package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String uname;
            String upass;
            String name = request.getParameter("Username");
            String pwd = request.getParameter("Password");
            String sql = "select * from table_logindetails where user_name=? and password=? ";
        
      out.write("\n");
      out.write("        ");

            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            if((!name.equals(null) || name.equals("")) && !(pwd.equals(null) || pwd.equals("")))
            {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docs","root","");
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, pwd);
                rs = ps.executeQuery();
                if(rs.next())
                    {
                    uname = rs.getString("user_name");
                    upass = rs.getString("password");
                    if(name.equals(uname) && pwd.equals(upass))
                    {
                        session.setAttribute("name",uname);
                        response.sendRedirect("profle.jsp");
                    }   
                }
                else
                {
                    rs.close();
                    ps.close();
                    
      out.write("\n");
      out.write("        <center>Sorry, your record is not available</center>\n");
      out.write("                    ");

                        getServletContext().getRequestDispatcher("index.jsp").include(request, response);
                }
            }
            catch(SQLException sqe)
            {
                out.println(sqe);
            }
            }
            else
            {
      out.write("\n");
      out.write("                   <center>Invalid! Username and Password Required</center>  \n");
      out.write("            ");

}
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
