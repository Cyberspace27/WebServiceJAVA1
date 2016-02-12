<%-- 
    Document   : index
    Created on : 12/02/2016, 01:52:16 AM
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente Web service Convertidor</title>
    </head>
    <body>
        <h1>Formularo de Conversion</h1>   
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
	d.webservices.ConversionTem_Service service = new d.webservices.ConversionTem_Service();
	d.webservices.ConversionTem port = service.getConversionTemPort();
	 // TODO initialize WS operation arguments here
	String strCelsius="";
        String strFahrenheit="";
        if(request.getParameter("opcion").equals("cs")){
            strCelsius=request.getParameter("temp");
            double celsius = Double.valueOf(strCelsius);
            double result = port.celsisuAFahrenheit(celsius);
            out.println("<font color='red'>Conversion a Fahrenheit es :" +result + "</font>");
        }
        else if(request.getParameter("opcion").equals("fh")){
            strFahrenheit=request.getParameter("temp");
            double fahrenheit = Double.valueOf(strFahrenheit);
            double result = port.fahrenheitAcelsius(fahrenheit);
            out.println("<font color='red'>Conversion a Celsius es :" +result + "</font>");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
        <form action="index.jsp" method="post">
            <table>       
                    <tr>
                        <td colspan="2"><input type="radio" name="opcion" value="cs">Celsius a Fahrenheit</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="radio" name="opcion" value="fh">Fahrenheit a Celsius</td>
                    </tr>
                    <tr>
                        <td>Valor</td>
                        <td><input type="text" name="temp" size="10" required></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Enviar"></td>
                    </tr>
            </table>

        </form>
    </body>
</html>















