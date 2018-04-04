<%-- 
    Document   : user
    Created on : May 12, 2017, 8:13:25 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*,java.text.SimpleDateFormat" %>
<%@ page import ="javax.sql.*" %>
<%

    
try{
     String user=request.getParameter("user");
session.putValue("userid",user);
String pwd=request.getParameter("pwd");
String email=request.getParameter("email");
String phone=request.getParameter("phone");

SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss"); 
String a = sdf.format(new java.util.Date());




Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/docu_db","root","");
Statement st= con.createStatement();

 ResultSet rs;


if(request.getParameter("insert")!= null)
{

int i=st.executeUpdate("INSERT INTO login_detail (id,uname,pwd,email,phone,type,ustate,cdate,udate,Ocatid,sign)VALUES (NULL, '"+user+"', '"+pwd+"', '"+email+"', '"+phone+"', 'user', '1', '"+a+"', '"+a+"', '0', NULL)");
 
if(i==1)
out.println("<center>Data Inserted Successfully....!!</center>");
}
if(request.getParameter("search")!= null)
{
    String sr= request.getParameter("table_search");
    
String query = "select * from login_detail where (uname like '"+ "%" +sr +"%" +"' or email like '"+ "%" +sr +"%" +"' or phone like '"+ "%" +sr +"%" +"'  ) and type='user' ";
Statement st2 = con.createStatement();
rs = st2.executeQuery(query);
}
else
{
String query = "select * from login_detail where type='user'";
Statement st1 = con.createStatement();
  rs = st1.executeQuery(query);
 
}
%>




<!DOCTYPE html>
<html>
    <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>DocStore | Manage User</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  
   <script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='user_edit.jsp?id='+id;
    f.submit();
}
function insertRecord(){
    var f=document.form;
    f.method="post";
    f.action='user.jsp?insert=insert';
    f.submit();
}
function searchrecord(){
    var name=document.form.table_search.value;  
  
  
if (name==null || name==""){  
  alert("Please Enter Field you want to search!!");  
  name.focus();
  return false;  
}
else
    {
    var f=document.form;
    f.method="post";
    f.action='user.jsp?search=search';
    f.submit();
    return true;
    }
}
function deleteRecord(id){
    if(confirm("Do You Want to Delete this Record?"))
{
     var f=document.form;
    f.method="post";
    f.action='user_delete.jsp?id='+id;
    f.submit();
}
else
{
    return false;
}
   
}

</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
    <form method="post" name="form"   >
<div class="wrapper">

  <header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>D</b>ST</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Doc</b>STORE</span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
       
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
             
              <span class="hidden-xs">USER NAME - session</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
               

                <p>
                  Luv Thakker
                  <small>Member since Nov. 2012</small>
                </p>
              </li>
              <!-- Menu Body -->
            
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
        
        </ul>
      </div>

    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
      <section class="sidebar">
      <!-- Sidebar user panel -->
      
      <!-- search form -->
     
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="treeview">
          <a href="dashboard.html">
            <i class="fa fa-dashboard"></i> <span>Dashboard</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          
        </li>
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>MANAGE MEMBERS</span>
            
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="user.html"><i class="fa fa-circle-o"></i> USERS</a></li>
            <li><a href="admin.html"><i class="fa fa-circle-o"></i> ADMIN</a></li>
            <li><a href="organization.html"><i class="fa fa-circle-o"></i> ORGANIZATION</a></li>
          
          </ul>
		  
        </li>
		
		
		<li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>MANAGE DOCUMENTS</span>
            
          </a>
          <ul class="treeview-menu">
            <li><a href="public.html"><i class="fa fa-circle-o"></i> PUBLIC</a></li>
            <li><a href="private.html"><i class="fa fa-circle-o"></i> PRIVATE</a></li>
            <li><a href="confidential.html"><i class="fa fa-circle-o"></i> COFNIDENTIAL</a></li>
          
          </ul>
        </li>
		 <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>MANAGE STATUS</span>
            
          </a>
          <ul class="treeview-menu">
            <li><a href="manage_user.html"><i class="fa fa-circle-o"></i> USERS</a></li>
            <li><a href="manage_admin.html"><i class="fa fa-circle-o"></i> ADMIN</a></li>
            <li><a href="manage_org.html"><i class="fa fa-circle-o"></i> ORGANIZATION</a></li>
			<li><a href="manage_docs.html"><i class="fa fa-circle-o"></i> DOCUMENTS</a></li>
          
          </ul>
		  
        </li>
	<li class="treeview">
          <a href="category.html">
            <i class="fa fa-files-o"></i>
            <span>MANAGE CATEGORIES</span>
            
          </a>
          
		  
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        MANAGE USER
      
      </h1>
    
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Info boxes -->
      <div class="row">
       <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Edit / Delet user</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">                       
                    <button type="submit" name="Submit"  onclick="searchrecord();" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                <label style="color:green;"><span ><% if(request.getParameter("id_delete") != null) 
out.print(request.getParameter("id_delete")); %></span><span><% 
                if(request.getParameter("id_update") != null)
                
out.print(request.getParameter("id_update")); %></span></label>
              <table class="table table-hover">
                <tr>
                  <th>Uid</th>
                  <th>Uname</th>
				   <th>Unumber</th>
                  <th>Status</th>
                  <th>Action</th>
                 
                </tr>
<%
while(rs.next()){
%>
                <tr>
                  <td><%=rs.getString("id")%></td>
                  <td><%=rs.getString("uname")%></td>
                  <td><%=rs.getString("phone")%></td>
                  
                  <td><span class="<%= rs.getBoolean("ustate") ? "label label-success" : "label label-danger" %>" ><%= rs.getBoolean("ustate") ? "ACTIVE" : "IN ACTIVE" %></span></td>
                  <td>
                      <input type="button" name="edit" value="Edit" class="btn btn-block btn-primary btn-xs" onclick="editRecord(<%=rs.getString("id")%>);" >
                      <input type="button" name="delete" value="Delete" class="btn btn-block btn-primary btn-xs" onclick="deleteRecord(<%=rs.getString("id")%>);" >
                  </td>
                </tr>
               <%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Add user</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            
              <div class="box-body">
			  <div class="form-group">
                  <label for="exampleInputEmail1">User Name</label>
                  <input type="text" name="user" class="form-control" id="exampleInputEmail1" placeholder="Enter Username">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Phone Number</label>
                  <input type="text" name="phone" class="form-control" id="exampleInputEmail1" placeholder="Enter Phone number">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Email address</label>
                  <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" name="pwd" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
				 <div class="form-group">
                  <label for="exampleInputPassword1">Re type Password</label>
                  <input type="password" name="rpwd" class="form-control" id="exampleInputPassword1" placeholder="Re Type Password">
                </div>
              
                
              <!-- /.box-body -->

              <div class="box-footer">
                 
                <button type="submit" class="btn btn-primary" onclick="insertRecord();">Submit</button>
              </div>
        
          </div>
		  </div>
      </div>
      <!-- /.row -->

 
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>DOCS BOX</b> BETA
    </div>
    
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-user bg-yellow"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                <p>New phone +1(800)555-1234</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                <p>nora@example.com</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-file-code-o bg-green"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                <p>Execution time 5 seconds</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="label label-danger pull-right">70%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Update Resume
                <span class="label label-success pull-right">95%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Laravel Integration
                <span class="label label-warning pull-right">50%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Back End Framework
                <span class="label label-primary pull-right">68%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->

      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Allow mail redirect
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Other sets of options are available
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Expose author name in posts
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Allow the user to show his name in blog posts
            </p>
          </div>
          <!-- /.form-group -->

          <h3 class="control-sidebar-heading">Chat Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Show me as online
              <input type="checkbox" class="pull-right" checked>
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Turn off notifications
              <input type="checkbox" class="pull-right">
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Delete chat history
              <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
            </label>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>

</div>
   
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/app.min.js"></script>
<!-- Sparkline -->
<script src="plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- ChartJS 1.0.1 -->
<script src="plugins/chartjs/Chart.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="dist/js/pages/dashboard2.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>
      </form>
</body>
</html>

