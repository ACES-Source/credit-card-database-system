package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Page Title</title>\n");
      out.write("<style>\n");
      out.write("#header\n");
      out.write("{\n");
      out.write("width:1350px;\n");
      out.write("height:100px;\n");
      out.write("background-color:#000080;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("#inheader\n");
      out.write("{\n");
      out.write("    width:700px;\n");
      out.write("    height:50px;\n");
      out.write("    background-color:whitesmoke;\n");
      out.write("    margin-left:300px;\n");
      out.write("    margin-bottom:10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("   #wrapper{\n");
      out.write("       \n");
      out.write("                text-align:left;\n");
      out.write("                width:1000px;\n");
      out.write("                position:relative;\n");
      out.write("            }\n");
      out.write("#header1\n");
      out.write("{\n");
      out.write("    padding-top:0.3px;\n");
      out.write("    margin-left:0.3px;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#footer{\n");
      out.write(" width:1350px;\n");
      out.write("height:50px;\n");
      out.write("background-color:#000080;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#choose\n");
      out.write("{\n");
      out.write("    margin-top:-10px;\n");
      out.write("    width:1350px;\n");
      out.write("    height:60px;\n");
      out.write("    background-color:#5fee05;\n");
      out.write("    text-align:center;\n");
      out.write("    padding-top:15px;\n");
      out.write("    color:whitesmoke;\n");
      out.write("    font-syle: arial;\n");
      out.write("}\n");
      out.write("#content{\n");
      out.write("    width:1350px;\n");
      out.write("    height:1400px;\n");
      out.write("    background-color:whitesmoke;\n");
      out.write("    margin-top:10px;\n");
      out.write("}\n");
      out.write("#actualcontent{\n");
      out.write("    margin-left:20px;\n");
      out.write("    width:1300px;\n");
      out.write("    height:920px;\n");
      out.write("    border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("    background-color:white; \n");
      out.write("    margin-bottom:20px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#content1\n");
      out.write("{\n");
      out.write("    margin-left:10px;\n");
      out.write("   width:1280px;\n");
      out.write("   height:450px;\n");
      out.write("   background-color:lightsalmon;\n");
      out.write("   float:left;\n");
      out.write("}\n");
      out.write("#content2\n");
      out.write("{\n");
      out.write("    margin-left:10px;\n");
      out.write("   width:1280px;\n");
      out.write("   height:450px;\n");
      out.write("   background-color:blueviolet;\n");
      out.write("   margin-top:450px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#card1\n");
      out.write("{\n");
      out.write("      margin-left:20px;\n");
      out.write("      margin-top:20px; \n");
      out.write("    width:350px;\n");
      out.write("    height:400px;\n");
      out.write("font-size:20px;\n");
      out.write("background-color:lightblue;\n");
      out.write("float:left;\n");
      out.write("padding-top:20px;\n");
      out.write("padding-left:50px;\n");
      out.write(" border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("}\n");
      out.write("#card2\n");
      out.write("{\n");
      out.write("      margin-left:10px;\n");
      out.write("      margin-top:20px; \n");
      out.write("    width:350px;\n");
      out.write("    height:400px;\n");
      out.write("font-size:20px;\n");
      out.write("background-color:lightgray; \n");
      out.write("float:left;\n");
      out.write("padding-top:20px;\n");
      out.write("padding-left:50px;\n");
      out.write("border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("}\n");
      out.write("#card3\n");
      out.write("{\n");
      out.write("       margin-left:20px;\n");
      out.write("      margin-top:20px; \n");
      out.write("     width:350px;\n");
      out.write("    height:400px;\n");
      out.write("font-size:20px;\n");
      out.write("background-color:lightpink; \n");
      out.write("float:left;\n");
      out.write("padding-top:20px;\n");
      out.write("padding-left:50px;\n");
      out.write("border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("}\n");
      out.write("#card4\n");
      out.write("{\n");
      out.write("      margin-left:20px;\n");
      out.write("      margin-top:20px; \n");
      out.write("     width:350px;\n");
      out.write("    height:400px;\n");
      out.write("font-size:20px;\n");
      out.write("background-color:lightseagreen; \n");
      out.write("padding-top:20px;\n");
      out.write("padding-left:50px;\n");
      out.write("border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write("#card5\n");
      out.write("{\n");
      out.write("    margin-left:20px;\n");
      out.write("      margin-top:20px;\n");
      out.write("     width:350px;\n");
      out.write("    height:400px;\n");
      out.write("font-size:20px;\n");
      out.write("background-color:lightgreen;\n");
      out.write("padding-top:20px;\n");
      out.write("padding-left:50px;\n");
      out.write("border-style: solid;\n");
      out.write("    border-radius:20px;\n");
      out.write("    border-color:lightseagreen;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write("      #nav a:hover {\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("#nav, #nav a {\n");
      out.write("    padding-left:20px;\n");
      out.write("    padding-top:10px;\n");
      out.write("\tcolor: black;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("            font-size:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap-theme.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css/\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("<div id=\"header\">\n");
      out.write("    <div id=\"header1\">\n");
      out.write("\n");
      out.write("<img src=\"pictures/icon_mr_180_black (1).png\" height=\"100\" width=\"270\"/>\n");
      out.write("      <div id=\"inheader\">\n");
      out.write("         <div id=\"nav\">\n");
      out.write("             <a href=\"main.jsp\">Home</a> | <a href=\"apply.jsp\">Apply</a> | <a href=\"help.jsp\">Help</a> | <a href=\"contactus.jsp\">Contact us</a> |\n");
      out.write("                <a href=\"login.jsp\">Login</a>\n");
      out.write("          </div> \n");
      out.write("              </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("    <div id=\"content\">\n");
      out.write("        <img class=\"img-responsive\" src=\"pictures/d\" alt=\"Office\">\n");
      out.write("     <img src=\"pictures/d-slide-4.jpg\" width=\"1350\"/>\n");
      out.write("        <h1 id=\"choose\">Choose a card that suits your Lifestyle</h1>\n");
      out.write("        <div id=\"actualcontent\">\n");
      out.write("        <div id=\"content1\">\n");
      out.write("            <div id=\"card1\">\n");
      out.write("                   <img src=\"pictures/card_visaclassic.jpg\"/>\n");
      out.write("        \n");
      out.write("        <h3>Visa Classic</h3><br>\n");
      out.write("        <p>\n");
      out.write("            Be it traveling, shopping or <br>\n");
      out.write("            dining, Visa Classic cards<br>\n");
      out.write("            are accepted at tens of <br>\n");
      out.write("            millions of locations around <br>\n");
      out.write("            the world.<br>\n");
      out.write("        </p>\n");
      out.write("           <a href=\"\">learn more</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"card2\">\n");
      out.write("                    <img src=\"pictures/card_visaclassic.jpg\"/>\n");
      out.write("        \n");
      out.write("        <h3>Visa Classic</h3><br>\n");
      out.write("        <p>\n");
      out.write("            Be it traveling, shopping or <br>\n");
      out.write("            dining, Visa Classic cards<br>\n");
      out.write("            are accepted at tens of <br>\n");
      out.write("            millions of locations around <br>\n");
      out.write("            the world.<br>\n");
      out.write("        </p>\n");
      out.write("           <a href=\"\">learn more</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"card3\">\n");
      out.write("                   <img src=\"pictures/card_visaclassic.jpg\"/>\n");
      out.write("        \n");
      out.write("        <h3>Visa Classic</h3><br>\n");
      out.write("        <p>\n");
      out.write("            Be it traveling, shopping or <br>\n");
      out.write("            dining, Visa Classic cards<br>\n");
      out.write("            are accepted at tens of <br>\n");
      out.write("            millions of locations around <br>\n");
      out.write("            the world.<br>\n");
      out.write("        </p>\n");
      out.write("           <a href=\"\">learn more</a>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"content2\">\n");
      out.write("            <div id=\"card4\">\n");
      out.write("                            <img src=\"pictures/card_visaclassic.jpg\"/>\n");
      out.write("        \n");
      out.write("        <h3>Visa Classic</h3><br>\n");
      out.write("        <p>\n");
      out.write("            Be it traveling, shopping or <br>\n");
      out.write("            dining, Visa Classic cards<br>\n");
      out.write("            are accepted at tens of <br>\n");
      out.write("            millions of locations around <br>\n");
      out.write("            the world.<br>\n");
      out.write("        </p>\n");
      out.write("           <a href=\"\">learn more</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"card5\">\n");
      out.write("                            <img src=\"pictures/card_visaclassic.jpg\"/>\n");
      out.write("        \n");
      out.write("        <h3>Visa Classic</h3><br>\n");
      out.write("        <p>\n");
      out.write("            Be it traveling, shopping or <br>\n");
      out.write("            dining, Visa Classic cards<br>\n");
      out.write("            are accepted at tens of <br>\n");
      out.write("            millions of locations around <br>\n");
      out.write("            the world.<br>\n");
      out.write("        </p>\n");
      out.write("           <a href=\"\">learn more</a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
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