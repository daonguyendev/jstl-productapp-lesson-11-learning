/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-09-04 00:41:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add new product</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-6 m-auto\">\r\n");
      out.write("\t\t\t\t<h5 class=\"text-center\">Add new product</h5>\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/product/add\" method=\"POST\">\r\n");
      out.write("\t\t\t\t  \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label>Code:</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" name=\"code\" class=\"form-control\">\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label>Name:</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" name=\"name\" class=\"form-control\">\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label>Amount:</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" name=\"amount\" class=\"form-control\">\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label>Price:</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" name=\"price\" class=\"form-control\">\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t\t  \t<button type=\"submit\" class=\"btn btn-primary\">Add</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
