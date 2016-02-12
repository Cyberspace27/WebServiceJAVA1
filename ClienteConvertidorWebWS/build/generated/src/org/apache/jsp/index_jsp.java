package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cliente Web service Convertidor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formularo de Conversion</h1>   \n");
      out.write("        \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	d.webservices.ConversionTem_Service service = new d.webservices.ConversionTem_Service();
	d.webservices.ConversionTem port = service.getConversionTemPort();
	 // TODO initialize WS operation arguments here
	String strCelsius="";
        String strFahrenheit="";
        if(request.getParameter("option").equals("cs")){
            strCelsius=request.getParameter("temp");
            double celsius = Double.valueOf(strCelsius);
            double result = port.celsisuAFahrenheit(celsius);
            out.println("<font color='red'>Conversion a Fahrenheit es :" +result + "</font>");
        }
        else if(request.getParameter("option").equals("fh")){
            strFahrenheit=request.getParameter("temp");
            double fahrenheit = Double.valueOf(strFahrenheit);
            double result = port.fahrenheitAcelsius(fahrenheit);
            out.println("<font color='red'>Conversion a Celsius es :" +result + "</font>");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("        <form action=\"index.jsp\" method=\"post\">\n");
      out.write("            <table>       \n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"radio\" name=\"opcion\" value=\"cs\">Celsius a Fahrenheit</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"radio\" name=\"opcion\" value=\"fh\">Fahrenheit a Celsius</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Valor</td>\n");
      out.write("                        <td><input type=\"text\" name=\"temp\" size=\"10\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" value=\"Enviar\"></td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
