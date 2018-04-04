<%-- 
    Document   : user_delete
    Created on : May 12, 2017, 11:27:36 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%

    
String id=request.getParameter("id");
int no=Integer.parseInt(id);

try {
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docu_db","root","");

Statement st = con.createStatement();
st.executeUpdate("DELETE FROM login_detail WHERE id = '"+no+"'");
response.sendRedirect("user.jsp?id_delete=Deleted successfully.");
}
catch(Exception e){}
%>

