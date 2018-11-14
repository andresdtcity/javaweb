package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ejemplos JavaScript</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        1)   <a href=\"String.html\" target=\"_blank\">Hola mundo!</a><br/>\n");
      out.write("        2)   <a href=\"Array.html\" target=\"_blank\">Array</a><br/>\n");
      out.write("        3)   <a href=\"Math.html\" target=\"_blank\">Math</a><br/>\n");
      out.write("        4)   <a href=\"Date.html\" target=\"_blank\">Date</a><br/>\n");
      out.write("        5)   <a href=\"Window.html\" target=\"_blank\">Window</a><br/>\n");
      out.write("        6)   <a href=\"Frame.html\" target=\"_blank\">Frame</a><br/>\n");
      out.write("        7)   <a href=\"Location.html\" target=\"_blank\">Location</a><br/>\n");
      out.write("        8)   <a href=\"History.html\">History</a><br/>\n");
      out.write("        9)   <a href=\"Navigator.html\" target=\"_blank\">Navigator</a><br/>\n");
      out.write("        10)  <a href=\"Image.html\" target=\"_blank\">Image</a><br/>\n");
      out.write("        11)  <a href=\"Form.html\" target=\"_blank\">Form</a><br/>\n");
      out.write("        12)  <a href=\"Text-TextArea-Password.html\" target=\"_blank\">Texto</a><br/>\n");
      out.write("        13)  <a href=\"Checkbox.html\" target=\"_blank\">Checkbox</a><br/>\n");
      out.write("        11)  <a href=\"Radio.html\" target=\"_blank\">Radio</a><br/>\n");
      out.write("        12)  <a href=\"Select.html\" target=\"_blank\">Select</a><br/>\n");
      out.write("        13)  <a href=\"Ejemplo Reflection.html\" target=\"_blank\">Reflection</a><br/>\n");
      out.write("        14)  <a href=\"Ejemplo BoxOver.html\" target=\"_blank\">BoxOver</a><br/>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
