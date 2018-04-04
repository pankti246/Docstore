<%-- 
    Document   : signup
    Created on : 11 May, 2017, 2:29:44 PM
    Author     : Luv Thakkar
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*"%>
<%@page import = "javax.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String uname = request.getParameter("Username");
            String pwd = request.getParameter("Password");
            String email = request.getParameter("Email");
            String phone = request.getParameter("Phone");
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docs","root","");
                PreparedStatement pst1 = con.prepareStatement("select max(user_id)+1 from table_logindetails");
                ResultSet rs = pst1.executeQuery();
                String uid = "" ;
                while(rs.next())
                {
                    uid = rs.getString(1);
                }
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String todaysDate = dateFormat.format(System.currentTimeMillis());
                String sql = "Insert into table_logindetails (user_id,user_name,password,phone_no,email_id,user_type,user_status,create_date,update_date) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, uid.toString());
                pst.setString(2, uname);
                pst.setString(3, pwd);
                pst.setString(4, phone);
                pst.setString(5, email);
                pst.setString(6, "user");
                pst.setString(7, "1");
                pst.setString(8, todaysDate);
                pst.setString(9, todaysDate);
                int i = pst.executeUpdate();
                if(i==1)
                {%>
                <script type="text/javascript">
                    alert("Account created. Login to access Profile");
                </script>  
                <%getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
                }
            }
            catch(Exception e)
            {
                out.println(e.getMessage());
            }
            %>
    </body>
</html>
