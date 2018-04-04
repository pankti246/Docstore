<%-- 
    Document   : logout
    Created on : 12 May, 2017, 3:19:27 PM
    Author     : Luv Thakkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("name")==null)
            {
                response.sendRedirect("index.jsp");
            }
            session.invalidate();
            getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
            %>
    </body>
</html>
