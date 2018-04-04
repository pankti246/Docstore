<%-- 
    Document   : user_update
    Created on : May 13, 2017, 8:50:16 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*,java.text.SimpleDateFormat"%>

<%
 
String ide=request.getParameter("id");
int num=Integer.parseInt(ide);
String name=request.getParameter("name");
String phone=request.getParameter("phone");
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");
boolean b=false;
if(request.getParameter("ustate") != null)
b=true;
out.print("fsd fb"+b);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss"); 
String a = sdf.format(new java.util.Date());
try{
Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/docu_db","root", "");
Statement st=null;
st=conn.createStatement();
st.executeUpdate("update login_detail set uname='"+name+"',phone="+phone+",email='"+email+"',pwd='"+pwd+"',udate='"+a+"',ustate="+b+" where id='"+num+"'");
response.sendRedirect("user.jsp?id_update=Record Updated Successfully..");
}
catch(Exception e){
System.out.println(e);
    }
%>