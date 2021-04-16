package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/customerheader.jsp");
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
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"customerhome.jsp\"><span>Home</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"calculate_load.jsp\"><span>Calculate Load</span></a></li>\n");
      out.write("                        <li><a href=\"rate.jsp\"><span>Rate Companies</span></a></li>\n");
      out.write("                        <li><a href=\"feedback.jsp\"><span>Feedback</span></a></li>\n");
      out.write("                        <li><span>My Account</span>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"delete_customer.jsp\">Delete Account</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"last\"> <a href=\"customerlogout.jsp\">Logout</a> </li>\n");
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
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<div class=\"contentbg\">\n");
      out.write("\t\t\t\t<div class=\"post\">\n");
      out.write("                                    ");

                                    String email = (String)session.getAttribute("name");
                                    
      out.write("\n");
      out.write("\t\t\t\t\t<h2 class=\"\">Welcome ");
      out.print( email );
      out.write("</h2>\n");
      out.write("\t\t\t\t\t<div class=\"entry\">\n");
      out.write("\t\t\t\t\t\t<p>This is <strong>Commercial</strong>, a free, fully standards-compliant CSS template designed by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>.  The picture in this template is from <a href=\"http://fotogrph.com/\">Fotogrph</a>.The gallery slider and popup gallery used in this template is powered by <a href=\"http://n33.co/\">Poptrox</a> and <a href=\"http://n33.co/\">Slidertron</a>. Dropdown menu is powered by <a href=\"http://n33.co/\">Dropotron</a>. This free template is released under the <a href=\"http://templated.co/license\">Creative Commons Attribution</a> license, so you?re pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :)</p>\n");
      out.write("\t\t\t\t\t\t<p>Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum ipsum. Proin imperdiet est. Phasellus dapibus semper urna. Pellentesque ornare, orci in felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end #content -->\n");
      out.write("\t\t<div id=\"sidebar-bg\">\n");
      out.write("\t\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<h2>Top Sellers</h2>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.waaree.com\">Waaree Solar</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.luminousindia.com/solar-package\">Luminous</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.adanisolar.com/\">Adani Solar</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.tatapowersolar.com/\">TaTa Power Solar</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.vikramsolar.com/\">Vikram Solar</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end #sidebar -->\n");
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
