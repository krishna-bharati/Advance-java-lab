

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Interest</title>
    </head>
    <body>
          
  <form action="" method="POST">
            <fieldset>
                 <legend>Calculate Simple Interest</legend>
            <legend> Enter the Principal Amount</legend>
            <input type="text" name="p">
            <br><br>
            <legend> Enter the Time</legend>
            <input type="text" name="t">
            <br> <br>
            <legend> Enter the Rate</legend>
            <input type="text" name="r">
            <br> <br>
              <input type="submit" name="calculate" value="Calculate">
              </fieldset>
        </form> 
        <%
if(request.getParameter("calculate")!=null){
Double principal= Double.parseDouble(request.getParameter("p"));
Double time= Double.parseDouble(request.getParameter("t"));
Double rate= Double.parseDouble(request.getParameter("r"));
Double si=(principal*time*rate)/100;
 out.println("<h2> The Simple Interest is ="+si+"</h2>");
            }
                %>
    </body>
</html>
