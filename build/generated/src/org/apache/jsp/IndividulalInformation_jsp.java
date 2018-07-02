package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IndividulalInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <center>\n");
      out.write("       ");
 if(session.getAttribute("indid")!=null)
          {
            
      out.write("         \n");
      out.write("        <h1>Company's Information</h1>\n");
      out.write("        <p>\n");
      out.write("            <em>Name  ::</em>");
 out.println(" "+session.getAttribute("compname"));
      out.write("<br><br>\n");
      out.write("            <em>User ID ::</em>");
 out.println(" "+session.getAttribute("compide"));
      out.write("<br><br>\n");
      out.write("            <em> Type ::</em>");
 out.println(" "+session.getAttribute("comptype"));
      out.write("<br><br>\n");
      out.write("            <em> Email ::</em>");
 out.println(" "+session.getAttribute("compemail"));
      out.write("<br><br>\n");
      out.write("            <em> Contact No ::</em>");
 out.println(" "+session.getAttribute("compcont"));
      out.write("<br><br>\n");
      out.write("            <em> Minimum Package ::</em>");
 out.println(" "+session.getAttribute("indpack"));
      out.write("<br><br>\n");
      out.write("            <em> Resume ::</em>");
 out.println(" "+session.getAttribute("indres"));
      out.write("<br><br>\n");
      out.write("        </p>\n");
      out.write("    </center>\n");
      out.write("        ");
 }
          else
       {
           out.println("<h2><font color=red> You must login first </font></h2>");
       
      out.write("\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/IndividualLogin.jsp", out, false);
      out.write("\n");
      out.write("       ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
