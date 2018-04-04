<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>DocStore</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="DocStore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script src="js/main.js"></script>
<!-- //js -->
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<link href="//fonts.googleapis.com/css?family=Cabin+Condensed:400,500,600,700" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>

</head>
	
<body>
<!-- banner -->
	<div class="banner">
		<div class="w3layouts-header">
			<div class="container">
				<div class="w3layouts-header-left">
					<ul>
						<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_dribble"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div class="w3layouts-header-right">
					<ul>
                                            <%
                                                if(session.getAttribute("name")==null)
                                                {
                                                %>
						<li><a href="profile.jsp" class="log"></a></li>
                                                <li><a href="#" class="log" data-toggle="modal" data-target="#myModal">Login</a></li>
                                                <%
                                                }
                                                else
                                                {
                                                    %>
                                                <li><a href="profile.jsp" class="log"><%=session.getAttribute("name")%></a></li>
                                                <li><a href="logout.jsp" class="log" >Logout</a></li>
                                                <%
                                                    }
                                                    %>
						
						<li><div class="cd-main-header">
							<a class="cd-search-trigger" href="#cd-search"> <span></span></a>
						 <!-- cd-header-buttons -->
					</div></li>
					</ul>
					
					<div id="cd-search" class="cd-search">
						<form action="gallery.html" method="post">
							<input name="Search" type="search" placeholder="Search...">
						</form>
					</div>
				</div>
				<div class="clearfix"></div>
			
			</div>
		</div>
		<div class="container">
			<div class="agile-logo">
                            <a href="index.jsp"><img src="images\logo.png" height="100" width="100"> </img></a>
				<h1><a href="index.html"></a></h1>
			</div>
			<div class="w3ls-nav">
					<nav class="navbar navbar-default">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="upload.jsp">Upload</a></li>                                                                                                                               
								<li><a href="about.jsp">About Us</a></li>
								<li><a href="how.jsp" >How to use</a></li>
								<li><a href="gallery.jsp" >Trending</a></li>	
								<li><a href="contact.jsp">Contact Us</a></li>
							</ul>
							<div class="clearfix"> </div>							
						</div>	
					</nav>		
			</div>
                    
			<div class="w3-agile-info">
				<section class="slider">
					<div class="flexslider">
						<ul class="slides">
							<li>
								<div class="banner-info1">
									<h3>Upload what you love.Share what you love.</h3>
									</div>
							<li>
								<div class="banner-info1">
									<h3>SignUp is free & always will be</h3>
								</div>
							</li>
							<li>
								<div class="banner-info1">
									<h3>Document Security Platform</h3></div>
							</li>
						</ul>
					</div>
				</section>

			
							<!-- FlexSlider -->
									  <script defer="" src="js/jquery.flexslider.js"></script>
									  <script type="text/javascript">
										$(function(){
										 
										});
										$(window).load(function(){
										  $('.flexslider').flexslider({
											animation: "slide",
											start: function(slider){
											  $('body').removeClass('loading');
											}
										  });
										});
									  </script>
								<!-- FlexSlider -->

			</div>
		</div>
	</div>
<!-- //banner -->
<!-- services -->
<div class="services">
		<div class="container">
			<div class="services-heading">
				<h3>Welcome</h3>
				
			</div>
			<div class="w3-agileits-services-grids">
			<div class="w3-agile-services-right">
					<h5>
DocStore online document management solution streamlines your document management processes. Our secure document manager lets you store and organize documents online and access them in the cloud no matter where you are. You can share documents online and collaborate on them with colleagues, customers and partners. Online document management and document collaboration let you store, organize, view, and modify files with just an Internet connection. There's no software to install...ever!</h5>
					<p></p>
				</div>
				
			</div>
		</div>
	</div>
<!-- //services-->

<div>
		<div class="container">
		<div class="agile-services-left">
					<div class="agile-services-left-grid">
						<div class="col-md-3 services-icon">
							<div class="services-icon-info">
								<i class="fa fa-files-o" aria-hidden="true"></i>
							</div>
							<div class="services-icon-text">
								<h4>Documents Upload</h4>
								<h5>Upload your documents in any format. We support PDF, DOCX, DOC, ODT, RTF, XLS, XLSX, ODS, PPT, PPTX, ODP, TXT and more!</h5>
							</div>
						</div>
						<div class="col-md-3 services-icon">
							<div class="services-icon-info">
								<i class="fa fa-download" aria-hidden="true"></i>
							</div>
							<div class="services-icon-text">
								<h4>Fast and convenient browser  </h4>
								<h5> Fast and convenient browser preview for your readers. </h5>
							</div>
						</div>
						<div class="col-md-3 services-icon">
							<div class="services-icon-info">
								<i class="fa fa-lock" aria-hidden="true"></i>
							</div>
							<div class="services-icon-text">
								<h4>Privacy</h4>
								<h5> Privacy is important to us! Uploaded documents are not publicly listed. If you want to, you can set up password protection or set your document to private at anytime.</h5>
							</div>
						</div>
						<div class="col-md-3 services-icon">
							<div class="services-icon-info">
								<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</div>
							<div class="services-icon-text">
								<h4>Complete control</h4>
								<h5> You retain complete control over your uploaded documents. You can modify, replace and delete your PDFs later.</h5>
							</div>
						</div>
						
				</div>
				
				<div class="clearfix"> </div>
		</div>
</div>
		<!-- about-->
	<!-- //about-->

	<!-- testimonial -->
	<div class="testimonial">
		<div class="container">
			<div class="about-heading testimonial-heading">
				<h3>Testimonial</h3>
			</div>
			<div class="testimonial-grid">
					<div class="slider">
							<div class="callbacks_container">
								<ul class="rslides" id="slider3">
									<li>
										<div class="agileits-w3layouts">
											<i class="fa fa-quote-right" aria-hidden="true"></i>
											<p>Since discovering DocStore, it's the only website I use to upload ans share my documents. It's fast, easy to use, and I can upload as much as I want.</p>
											<h5>User</h5>
										</div>
									</li>
									<li>
										<div class="agileits-w3layouts">
											<i class="fa fa-quote-right" aria-hidden="true"></i>
											<p>I go back to DocStore every time because I know I can trust it to work quickly and it's great. DocStore helps me to access documents in a better way. </p>
											<h5>User</h5>
										</div>
									</li>
									<li>
										<div class="agileits-w3layouts">
											<i class="fa fa-quote-right" aria-hidden="true"></i>
											<p>I use DocStore because it's best place to find trending documents and share it with a global audience.</p>
											<h5>User</h5>
										</div>
									</li>
								</ul>
							</div>
							<script>
								// You can also use "$(window).load(function() {"
								$(function () {
								  // Slideshow 4
								  $("#slider3").responsiveSlides({
									auto: true,
									pager:false,
									nav:true,
									speed: 500,
									namespace: "callbacks",
									before: function () {
									  $('.events').append("<li>before event fired.</li>");
									},
									after: function () {
									  $('.events').append("<li>after event fired.</li>");
									}
								  });
							
								});
							 </script>
							<!--banner Slider starts Here-->
					</div>
			</div>
		</div>
	</div>
	<!-- //testimonial -->
	
	
		<div class="container">
<div class="newsletter">
		
			<div class="col-md-4 agileinfo_newsletter_left">
				<h3>Subscribe to our free weekly watch newsletter !</h3>
			</div>
			<div class="col-md-8 agileinfo_newsletter_right">
				<form action="#" method="post">
					<input type="email" name="Email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="submit" value="Subscribe">
				</form>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>

	
</div>


<!-- footer -->
<div class="agile-footer">
		<div class="container">
			<div class="aglie-info-logo">
				
				<h4><a href="index.jsp">DocStore</a></h4>
			</div>
			<ul class="aglieits-nav">
				<li><a href="upload.jsp">Upload</a><i>|</i></li>
				<li><a href="about.jsp">About Us</a><i>|</i></li>
				<li><a href="how.jsp">How to use</a><i>|</i></li>
				<li><a href="gallery.jsp">Trending</a><i>|</i></li>
				<li><a href="contact.jsp">Contact</a></li>
			</ul>
			<div class="w3layouts_mail_grid">
				<div class="col-md-3 w3layouts_mail_grid_left">
					<div class="w3layouts_mail_grid_left2">
						<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
						<h3>Mail Us</h3>
						<a href="mailto:info@example.com">harshshah3695@gmail.com</a>
					</div>
				</div>
				<div class="col-md-3 w3layouts_mail_grid_left">
					<div class="w3layouts_mail_grid_left2">
					<span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
						<h3>Phone</h3>
						<p>+91 9558239600</p>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			
		</div>
	</div>
	<!-- //footer -->
	<!-- bootstrap-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Sign In & Sign Up
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
				<section>
					<div class="modal-body">
						<div class="w3_login_module">
							<div class="module form-module">
							  <div class="toggle"><p style="font-size:40px; margin:13px -1px;"><i class="fa fa-times fa-pencil"></i></p>
								<div class="tooltip">Click Me</div>
							  </div>
							  <div class="form">
								<h3>Login to your account</h3>
								<form action="login.jsp" method="post">
                                                                  <div id="errorBox1"></div>
                                                                  <input type="text" name="Email" placeholder="Email" required="" autofocus="">
								  <input type="password" name="Password" placeholder="Password" required="">
								  <input type="checkbox" name="Robot" required="">&nbsp;&nbsp;I am not a Robot<br/><br/> 
								  <input type="submit" value="Login">
								</form>
							  </div>
							  <div class="form">
								<h3>Create an account</h3>
                                                                <form action="signup.jsp" method="post">
								  <div id="errorBox2"></div>
								  <input type="text" name="Username" placeholder="Username" required="">
								  <input type="password" name="Password" placeholder="Password" required="">
								  <input type="text" name="Email" placeholder="Email Address" pattern="/^[A-Za-z0-9._]*\@[A-Za-z0-9]*\.[com|in|org]{2,5}$/" required>
								  <input type="text" name="Phone" placeholder="Phone Number" required="">
								  <input type="checkbox" name="Robot" required="">&nbsp;&nbsp;I am not a Robot<br/><br/>
								  <input type="submit" value="Register">
								</form>
							  </div>
							  <div class="cta"><a href="#">Forgot your password?</a></div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>
	<script>
		$('.toggle').click(function(){
		  // Switches the Icon
		  $(this).children('i').toggleClass('fa-pencil');
		  // Switches the forms  
		  $('.form').animate({
			height: "toggle",
			'padding-top': 'toggle',
			'padding-bottom': 'toggle',
			opacity: "toggle"
		  }, "slow");
		});
	</script>
<!-- //bootstrap-pop-up -->
<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<script src="js/responsiveslides.min.js"></script>

<!-- //for bootstrap working -->
</body>
</html>