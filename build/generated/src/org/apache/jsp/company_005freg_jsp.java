package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class company_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/indexheader.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Solar-Mate</title>\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"header-wrapper\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"#\">Solar-Mate</a></h1>\n");
      out.write("\t\t\t\t<p>Let SUN do the work</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #header -->\n");
      out.write("\t<div id=\"menu-wrapper\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"index.jsp\"><span>Home</span></a></li>\n");
      out.write("\t\t\t<li><span>Registration</span>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"candidate.jsp\">Candidate Registration</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"last\"> <a href=\"recruiter.jsp\">Recruiter Registration</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>About Us</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>Contact Us</span></a></li>\n");
      out.write("\t\t\t<li><span>Login</span>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"candidatelogin.jsp\">Candidate Login</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"last\"> <a href=\"recruiterlogin.jsp\">Recruiter Login</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$('#menu').dropotron();\n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #menu -->");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"\">\n");
      out.write("\t\t\t<div class=\"contentbg\">\n");
      out.write("\t\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\t<h2 class=\"\">Company Registration</h2>\n");
      out.write("\t\t\t\t\t<div class=\"entry\">\n");
      out.write("\n");
      out.write("<form action=\"company_reg_db.jsp\">\n");
      out.write("<p style=\"font-size : 16px;\">Enter Name</p>\n");
      out.write("            <input style=\"height:30px; width:300px;\" required type=\"text\" name=\"name\" placeholder=\"Enter Name\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<p style=\"font-size : 16px;\">Enter Email</p>\n");
      out.write("            <input style=\"height:30px; width:300px;\" required type=\"email\" name=\"email\" placeholder=\"Enter Email\">\n");
      out.write("           \n");
      out.write("<p style=\"font-size : 16px;\">Enter Password</p>\n");
      out.write("            <input style=\"height:30px; width:300px;\" required type=\"password\" name=\"password\" placeholder=\"Enter Password\">\n");
      out.write("          \n");
      out.write("\n");
      out.write("<p style=\"font-size : 16px;\">Enter Address</p>\n");
      out.write("            <input style=\"height:30px; width:300px;\" required type=\"text\" name=\"address\" placeholder=\"Enter Address\">\n");
      out.write("           \n");
      out.write("<p style=\"font-size : 16px;\">Enter Mobile Number</p>\n");
      out.write("            <input style=\"height:30px; width:300px;\" required type=\"text\" name=\"mobile\" placeholder=\"Enter Contact\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <input style=\"height:30px; width:300px;\" type=\"submit\" value=\"Register\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("           </form>\n");
      out.write("                                            \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #page -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <p>2021 | All Rights Reserved |  &copy;Design by Aditi Aishwary Ambika &trade;</p>\n");
      out.write("</div>\n");
      out.write("<!-- end #footer -->\n");
      out.write("</body>\n");
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
