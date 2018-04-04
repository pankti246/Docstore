<%-- 
    Document   : login
    Created on : 9 May, 2017, 1:00:41 PM
    Author     : Luv Thakkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String mail;
            String uname;
            String upass;
            String email = request.getParameter("Email");
            String pwd = request.getParameter("Password");
            String sql = "select * from table_logindetails where email_id=? and password=? ";
        %>
        <%
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            if((!email.equals(null) || email.equals("")) && !(pwd.equals(null) || pwd.equals("")))
            {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docs","root","");
                ps = con.prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, pwd);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    uname = rs.getString("user_name");
                    mail = rs.getString("email_id");
                    upass = rs.getString("password");
                    if(email.equals(email) && pwd.equals(upass))
                    {
                        session.setAttribute("email",mail);
                        session.setAttribute("name",uname);
                        response.sendRedirect("profile.jsp");
                    }   
                }
                else
                {
                    rs.close();
                    ps.close();
                    %>
                    <script type="text/javascript">
        alert("Sorry, your record is not available");
        </script>
                    <%
                        getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
                }
            }
            catch(SQLException sqe)
            {
                out.println(sqe);
            }
            }
            else
            {%>
                   <center>Invalid! Username and Password Required</center>  
            <%
}
        %>
    </body>
</html>
