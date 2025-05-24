
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session</title>
    </head>
    <body>

        <%
        session.setAttribute("college","Ratna RajyaLaxmi Campus");
        out.println("<h2> Session is Created.</h2>");
                    out.println("<a href='ReadSession.jsp'>Click here to read Session.</a>");
        %>
    </body>
</html>
