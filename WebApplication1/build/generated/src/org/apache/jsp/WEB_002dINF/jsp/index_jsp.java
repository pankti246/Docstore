package org.apache.jsp.WEB_002dINF.jsp;

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

      out.write("<!--\r\n");
      out.write("author: W3layouts\r\n");
      out.write("author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>DocStore</title>\r\n");
      out.write("<!-- for-mobile-apps -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"DocStore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- //for-mobile-apps -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cabin+Condensed:400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"w3layouts-header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"w3layouts-header-left\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_vimeo\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3layouts-header-right\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"upload.html\" class=\"log\">Upload</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"log\" data-toggle=\"modal\" data-target=\"#myModal\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><div class=\"cd-main-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"cd-search-trigger\" href=\"#cd-search\"> <span></span></a>\r\n");
      out.write("\t\t\t\t\t\t <!-- cd-header-buttons -->\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"cd-search\" class=\"cd-search\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"gallery.html\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Search\" type=\"search\" placeholder=\"Search...\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"agile-logo\">\r\n");
      out.write("\t\t\t\t<img src=\"images\\logo.png\" height=\"100\" width=\"100\"> </img>\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\"></a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3ls-nav\">\r\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"active\" href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"how.html\" >How to use</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"gallery.html\" >Trending</a></li>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t</nav>\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3-agile-info\">\r\n");
      out.write("\t\t\t\t<section class=\"slider\">\r\n");
      out.write("\t\t\t\t\t<div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Upload what you love.Share what you love.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>SignUp is free & always will be</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Document Security Platform</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- FlexSlider -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <script defer=\"\" src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tanimation: \"slide\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstart: function(slider){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  $('body').removeClass('loading');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </script>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- FlexSlider -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //banner -->\r\n");
      out.write("<!-- services -->\r\n");
      out.write("<div class=\"services\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"services-heading\">\r\n");
      out.write("\t\t\t\t<h3>Welcome</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3-agileits-services-grids\">\r\n");
      out.write("\t\t\t<div class=\"w3-agile-services-right\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("DocStore online document management solution streamlines your document management processes. Our secure document manager lets you store and organize documents online and access them in the cloud no matter where you are. You can share documents online and collaborate on them with colleagues, customers and partners. Online document management and document collaboration let you store, organize, view, and modify files with just an Internet connection. There's no software to install...ever!</h5>\r\n");
      out.write("\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //services-->\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"agile-services-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agile-services-left-grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 services-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-files-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Documents Upload</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Upload your documents in any format. We support PDF, DOCX, DOC, ODT, RTF, XLS, XLSX, ODS, PPT, PPTX, ODP, TXT and more!</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 services-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-download\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Fast and convenient browser  </h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5> Fast and convenient browser preview for your readers. </h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 services-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Privacy</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5> Privacy is important to us! Uploaded documents are not publicly listed. If you want to, you can set up password protection or set your document to private at anytime.</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 services-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"services-icon-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Complete control</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5> You retain complete control over your uploaded documents. You can modify, replace and delete your PDFs later.</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t<!-- about-->\r\n");
      out.write("\t<!-- //about-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- testimonial -->\r\n");
      out.write("\t<div class=\"testimonial\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"about-heading testimonial-heading\">\r\n");
      out.write("\t\t\t\t<h3>Testimonial</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"testimonial-grid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"slider\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"callbacks_container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"rslides\" id=\"slider3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-quote-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Since discovering DocStore, it's the only website I use to upload ans share my documents. It's fast, easy to use, and I can upload as much as I want.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h5>User</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-quote-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>I go back to DocStore every time because I know I can trust it to work quickly and it's great. DocStore helps me to access documents in a better way. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h5>User</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-quote-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>I use DocStore because it's best place to find trending documents and share it with a global audience.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h5>User</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t// You can also use \"$(window).load(function() {\"\r\n");
      out.write("\t\t\t\t\t\t\t\t$(function () {\r\n");
      out.write("\t\t\t\t\t\t\t\t  // Slideshow 4\r\n");
      out.write("\t\t\t\t\t\t\t\t  $(\"#slider3\").responsiveSlides({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tauto: true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpager:false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnav:true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tspeed: 500,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnamespace: \"callbacks\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbefore: function () {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  $('.events').append(\"<li>before event fired.</li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\tafter: function () {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  $('.events').append(\"<li>after event fired.</li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t </script>\r\n");
      out.write("\t\t\t\t\t\t\t<!--banner Slider starts Here-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //testimonial -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("<div class=\"newsletter\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-4 agileinfo_newsletter_left\">\r\n");
      out.write("\t\t\t\t<h3>Subscribe to our free weekly watch newsletter !</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-8 agileinfo_newsletter_right\">\r\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"Email\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<div class=\"agile-footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"aglie-info-logo\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h4><a href=\"index.html\">DocStore</a></h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"aglieits-nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">Home</a><i>|</i></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"about.html\">About Us</a><i>|</i></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"how.html\">How to use</a><i>|</i></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"gallery.html\">Trending</a><i>|</i></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"w3layouts_mail_grid\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_mail_grid_left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3layouts_mail_grid_left2\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t<h3>Mail Us</h3>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mailto:info@example.com\">harshshah3695@gmail.com</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_mail_grid_left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3layouts_mail_grid_left2\">\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t<h3>Phone</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>+91 9558239600</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //footer -->\r\n");
      out.write("\t<!-- bootstrap-pop-up -->\r\n");
      out.write("\t<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\tSign In & Sign Up\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3_login_module\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"module form-module\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"toggle\"><p style=\"font-size:40px; margin:13px -1px;\"><i class=\"fa fa-times fa-pencil\"></i></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tooltip\">Click Me</div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Login to your account</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"checkbox\" name=\"Robot\" required=\"\">&nbsp;&nbsp;I am not a Robot<br/><br/> \r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Create an account</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <div id=\"errorBox\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Username\" placeholder=\"Username\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Email\" placeholder=\"Email Address\" pattern=\"/^[A-Za-z0-9._]*\\@[A-Za-z0-9]*\\.[com|in|org]{2,5}$/\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"Phone\" placeholder=\"Phone Number\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"checkbox\" name=\"Robot\" required=\"\">&nbsp;&nbsp;I am not a Robot<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Register\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"cta\"><a href=\"#\">Forgot your password?</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$('.toggle').click(function(){\r\n");
      out.write("\t\t  // Switches the Icon\r\n");
      out.write("\t\t  $(this).children('i').toggleClass('fa-pencil');\r\n");
      out.write("\t\t  // Switches the forms  \r\n");
      out.write("\t\t  $('.form').animate({\r\n");
      out.write("\t\t\theight: \"toggle\",\r\n");
      out.write("\t\t\t'padding-top': 'toggle',\r\n");
      out.write("\t\t\t'padding-bottom': 'toggle',\r\n");
      out.write("\t\t\topacity: \"toggle\"\r\n");
      out.write("\t\t  }, \"slow\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- //bootstrap-pop-up -->\r\n");
      out.write("<!-- for bootstrap working -->\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t<script src=\"js/responsiveslides.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- //for bootstrap working -->\r\n");
      out.write("</body>\r\n");
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
