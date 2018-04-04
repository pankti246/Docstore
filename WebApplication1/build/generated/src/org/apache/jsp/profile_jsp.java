package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\n");
      out.write("author: W3layouts\n");
      out.write("author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>DocStore</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"DocStore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/cm-overlay.css\" />\n");
      out.write("\n");
      out.write("<!-- js -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cabin+Condensed:400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("    ");

        if(session.getAttribute("name")==null)
        {
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            alert(\"You need to LogIn to access profile\");\n");
      out.write("        </script> \n");
      out.write("        ");
getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
        }
        
      out.write("\n");
      out.write("        ");

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docs","root","");
                String query = "select * from table_logindetails where email_id=session.getAttribute('email') ";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                
                
                 while(rs.next())
                {
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
      out.write("\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"w3-agileits-banner2\">\n");
      out.write("\t\t<div class=\"w3layouts-header\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"w3layouts-header-left\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_vimeo\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3layouts-header-right\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"profile.jsp\" class=\"log\">");
      out.print(session.getAttribute("name"));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.jsp\" class=\"log\" >Logout</a></li>\n");
      out.write("\t\t\t\t\t\t<li><div class=\"cd-main-header\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"cd-search-trigger\" href=\"#cd-search\"> <span></span></a>\n");
      out.write("\t\t\t\t\t\t <!-- cd-header-buttons -->\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div id=\"cd-search\" class=\"cd-search\">\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Search\" type=\"search\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"agile-logo\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp\"><img src=\"images\\logo.png\" height=\"100\" width=\"100\"> </img></a>\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\"></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls-nav\">\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"upload.jsp\">Upload</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"how.jsp\" >How To Use</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"gallery.jsp\" >Trending</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</nav>\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"col-md-2 profilepic\">\n");
      out.write("\t\t<div class=\"picedit\"><label for=\"pic-upload\"><p class=\"piclabel\"><i class=\"fa fa-times fa-pencil\"></i></p></label>\n");
      out.write("\t\t\t<input id=\"pic-upload\" type=\"file\" accept=\"image/*\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 stats\">\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-5 doctitle\">\n");
      out.write("\t\t<h3>Documents</h3>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"col-md-2 profileinfo\">\n");
      out.write("            \n");
      out.write("        </dv>\n");
      out.write("\t<div class=\"col-md-9 privatetitle\">\n");
      out.write("\t\t<h3>Private Documents<a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View All</a></h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 privatedoc\">\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 publictitle\">\n");
      out.write("\t\t<h3>Public Documents<a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View All</a></h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 publicdoc\">\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-2 profileblank\">\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 receivedtitle\">\n");
      out.write("\t\t<h3>Received Documents<a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View All</a></h3>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 receiveddoc\">\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 senttitle\">\n");
      out.write("\t\t<h3>Sent Documents<a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View All</a></h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-9 sentdoc\">\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 docdiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- newsletter -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"newsletter\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4 agileinfo_newsletter_left\">\n");
      out.write("\t\t\t\t<h3>Subscribe to our free weekly watch newsletter !</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-8 agileinfo_newsletter_right\">\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"Email\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //newsletter -->\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<div class=\"agile-footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"aglie-info-logo\">\n");
      out.write("\n");
      out.write("\t\t\t\t<h4><a href=\"index.jsp\">DocStore</a></h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"aglieits-nav\">\n");
      out.write("\t\t\t\t<li><a href=\"upload.jsp\">Upload</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"about.jsp\">About Us</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"how.jsp\">How to Use</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"gallery.jsp\">Trending</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"w3layouts_mail_grid\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("\t\t\t\t\t<div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t\t<h3>Mail Us</h3>\n");
      out.write("\t\t\t\t\t\t<a href=\"mailto:info@example.com\">info@example.com</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("\t\t\t\t\t<div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t\t<h3>Phone</h3>\n");
      out.write("\t\t\t\t\t\t<p>+(0121) 121 121</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"copy-right\">\n");
      out.write("\t\t\t\t<p>© 2017 DocStore. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //footer -->\n");
      out.write("\t<!-- bootstrap-pop-up -->\n");
      out.write("\t<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\tSign In & Sign Up\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3_login_module\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"module form-module\">\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"toggle\"><p style=\"font-size:40px; margin:13px -1px;\"><i class=\"fa fa-times fa-pencil\"></i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tooltip\">Click Me</div>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Login to your account</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"login.jsp\" method=\"post\">\n");
      out.write("                                                                  <div id=\"errorBox1\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"checkbox\" name=\"Robot\" required=\"\">&nbsp;&nbsp;I am not a Robot<br/><br/> \n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Create an account</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"email\" name=\"Email\" placeholder=\"Email Address\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Phone\" placeholder=\"Phone Number\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Register\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"cta\"><a href=\"#\">Forgot your password?</a></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.toggle').click(function(){\n");
      out.write("\t\t  // Switches the Icon\n");
      out.write("\t\t  $(this).children('i').toggleClass('fa-pencil');\n");
      out.write("\t\t  // Switches the forms  \n");
      out.write("\t\t  $('.form').animate({\n");
      out.write("\t\t\theight: \"toggle\",\n");
      out.write("\t\t\t'padding-top': 'toggle',\n");
      out.write("\t\t\t'padding-bottom': 'toggle',\n");
      out.write("\t\t\topacity: \"toggle\"\n");
      out.write("\t\t  }, \"slow\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //bootstrap-pop-up -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<script src=\"js/jquery.tools.min.js\"></script>\n");
      out.write("\t\t\t\t<script src=\"js/jquery.mobile.custom.min.js\"></script>\n");
      out.write("\t\t\t\t<script src=\"js/jquery.cm-overlay.js\"></script>\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t\t\t$('.cm-overlay').cmOverlay();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
