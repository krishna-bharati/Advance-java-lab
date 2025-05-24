
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Read Page</title>
    </head>
    <body>
        <h1>Session Read</h1>
        <%
            String svalue=(String)session.getAttribute("college");
            
            out.println("<h2> Session Value="+svalue+"</h2>");
            
            %>
    </body>
</html>
