package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Layout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_insert_attribute_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_insert_attribute_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_insert_attribute_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <table width=\"100%\"\">\n");
      out.write("            <tr> \n");
      out.write("                <td height=\"50\" colspan=\"3\" valign=\"top\">");
      if (_jspx_meth_t_insert_0(_jspx_page_context))
        return;
      out.write("</td> \n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td height=\"30\" colspan=\"3\" valign=\"top\">");
      if (_jspx_meth_t_insert_1(_jspx_page_context))
        return;
      out.write("</td> \n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td width=\"150\" height=\"400\" valign=\"top\">");
      if (_jspx_meth_t_insert_2(_jspx_page_context))
        return;
      out.write("</td> \n");
      out.write("                <td width=\"843\" valign=\"top\">");
      if (_jspx_meth_t_insert_3(_jspx_page_context))
        return;
      out.write("</td> \n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td height=\"30\" width=\"100%\" colspan=\"3\" valign=\"top\">");
      if (_jspx_meth_t_insert_4(_jspx_page_context))
        return;
      out.write("</td> \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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

  private boolean _jspx_meth_t_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_t_insert_0 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_t_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_t_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_t_insert_0.setParent(null);
    _jspx_th_t_insert_0.setAttribute("header");
    int _jspx_eval_t_insert_0 = _jspx_th_t_insert_0.doStartTag();
    if (_jspx_th_t_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_0);
      return true;
    }
    _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_0);
    return false;
  }

  private boolean _jspx_meth_t_insert_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_t_insert_1 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_t_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_t_insert_1.setPageContext(_jspx_page_context);
    _jspx_th_t_insert_1.setParent(null);
    _jspx_th_t_insert_1.setAttribute("topmenu");
    int _jspx_eval_t_insert_1 = _jspx_th_t_insert_1.doStartTag();
    if (_jspx_th_t_insert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_1);
      return true;
    }
    _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_1);
    return false;
  }

  private boolean _jspx_meth_t_insert_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_t_insert_2 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_t_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_t_insert_2.setPageContext(_jspx_page_context);
    _jspx_th_t_insert_2.setParent(null);
    _jspx_th_t_insert_2.setAttribute("menu");
    int _jspx_eval_t_insert_2 = _jspx_th_t_insert_2.doStartTag();
    if (_jspx_th_t_insert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_2);
      return true;
    }
    _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_2);
    return false;
  }

  private boolean _jspx_meth_t_insert_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_t_insert_3 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_t_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_t_insert_3.setPageContext(_jspx_page_context);
    _jspx_th_t_insert_3.setParent(null);
    _jspx_th_t_insert_3.setAttribute("body");
    int _jspx_eval_t_insert_3 = _jspx_th_t_insert_3.doStartTag();
    if (_jspx_th_t_insert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_3);
      return true;
    }
    _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_3);
    return false;
  }

  private boolean _jspx_meth_t_insert_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_t_insert_4 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_t_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_t_insert_4.setPageContext(_jspx_page_context);
    _jspx_th_t_insert_4.setParent(null);
    _jspx_th_t_insert_4.setAttribute("footer");
    int _jspx_eval_t_insert_4 = _jspx_th_t_insert_4.doStartTag();
    if (_jspx_th_t_insert_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_4);
      return true;
    }
    _jspx_tagPool_t_insert_attribute_nobody.reuse(_jspx_th_t_insert_4);
    return false;
  }
}
