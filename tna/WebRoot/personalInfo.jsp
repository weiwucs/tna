<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bootstrap Admin</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

<script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>



<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" type="text/css" href="stylesheets/premium.css">

</head>
<body class=" theme-blue">

	<!-- Demo page code -->

	<script type="text/javascript">
		$(function() {
			var match = document.cookie.match(new RegExp('color=([^;]+)'));
			if (match) var color = match[1];
			if (color) {
				$('body').removeClass(function(index, css) {
					return (css.match(/\btheme-\S+/g) || []).join(' ')
				})
				$('body').addClass('theme-' + color);
			}
	
			$('[data-popover="true"]').popover({
				html : true
			});
	
		});
	</script>
	<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
	color: #fff;
}
</style>

	<script type="text/javascript">
		$(function() {
			var uls = $('.sidebar-nav > ul > *').clone();
			uls.addClass('visible-xs');
			$('#main-menu').append(uls.clone());
		});
	</script>

	<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

	<!-- Le fav and touch icons -->
	<link rel="shortcut icon" href="../assets/ico/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="144x144"
		href="../assets/ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114"
		href="../assets/ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72"
		href="../assets/ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed"
		href="../assets/ico/apple-touch-icon-57-precomposed.png">


	<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
	<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
	<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
	<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
	<!--[if (gt IE 9)|!(IE)]><!-->

	<!--<![endif]-->

	<div class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="" href="index.html"><span class="navbar-brand"><span
					class="fa fa-paper-plane"></span> Weiwu</span></a>
		</div>

		<div class="navbar-collapse collapse" style="height: 1px;">
			<ul id="main-menu" class="nav navbar-nav navbar-right">
				<li class="dropdown hidden-xs"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"> <span
						class="glyphicon glyphicon-user padding-right-small"
						style="position:relative;top: 3px;"></span> ${user.username} <i
						class="fa fa-caret-down"></i>
				</a>

					<ul class="dropdown-menu">
						<li><a href="./">My Account</a></li>
						<li class="divider"></li>
						<li><a href="./">Users</a></li>
						<li><a href="./">Security</a></li>
						<li><a tabindex="-1" href="./">Payments</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" href="sign-in.html">Logout</a></li>
					</ul></li>
			</ul>

		</div>
	</div>
	</div>


	<div class="sidebar-nav">
		<ul>
			<li><a href="#" data-target=".dashboard-menu" class="nav-header"
				data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i>
					Dashboard<i class="fa fa-collapse"></i></a></li>
			<li><ul class="dashboard-menu nav nav-list collapse in">
					<li><a href="index.jsp"><span class="fa fa-caret-right"></span>
							Home</a></li>
					<li class="active"><a href="personalInfo.jsp"><span
							class="fa fa-caret-right"></span> Your Profile</a></li>
					<li><a href="exam.do"><span class="fa fa-caret-right"></span>
							Exam</a></li>
					<li><a href="showScore.do?uid=${user.uid}"><span
							class="fa fa-caret-right"></span> Your Score</a></li>
				</ul></li>

			<li><a href="#" data-target=".accounts-menu"
				class="nav-header collapsed" data-toggle="collapse"><i
					class="fa fa-fw fa-briefcase"></i> Account <span
					class="label label-info">+3</span></a></li>
			<li><ul class="accounts-menu nav nav-list collapse">
					<li><a href="login.jsp"><span class="fa fa-caret-right"></span>
							Sign In</a></li>
					<li><a href="register.jsp"><span class="fa fa-caret-right"></span>
							Sign Up</a></li>
					<li><a href="reset-password.jsp"><span
							class="fa fa-caret-right"></span> Reset Password</a></li>
				</ul></li>

			<li><a href="#" data-target=".legal-menu"
				class="nav-header collapsed" data-toggle="collapse"><i
					class="fa fa-fw fa-legal"></i> Legal<i class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu nav nav-list collapse">
					<li><a href="privacy-policy.html"><span
							class="fa fa-caret-right"></span> Privacy Policy</a></li>
					<li><a href="terms-and-conditions.html"><span
							class="fa fa-caret-right"></span> Terms and Conditions</a></li>
				</ul></li>

			<li><a href="help.html" class="nav-header"><i
					class="fa fa-fw fa-question-circle"></i> Help</a></li>
	</div>

	<div class="content">
		<div class="header">

			<h1 class="page-title">Edit User</h1>
			<ul class="breadcrumb">
				<li><a href="index.jsp">Home</a></li>
				<li class="active">Profile</li>
			</ul>

		</div>
		<div class="main-content">

			<ul class="nav nav-tabs">
				<li class="active"><a href="#home" data-toggle="tab">Profile</a></li>
			</ul>

			<div class="row">
				<div class="col-md-4">
					<br>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane active in" id="home">
							<form id="tab" action="personalinfo.do" method="post">
								<div class="form-group">
									<input type="hidden" value="${user.uid}" name="uid" class="form-control">
								</div>
								<div class="form-group">
									<label>Username</label> <input type="text"
										value="${user.username}" name="username" class="form-control">
								</div>
								<div class="form-group">
									<label>Name</label> <input type="text" value="${user.name }" name="name"
										class="form-control">
								</div>

								<div class="form-group">
									<label>Password</label> <input type="text"
										value="${user.password }"  name="password" class="form-control">
								</div>

								<div class="form-group">
									<label>Okpassword</label> <input type="text"
										value="${user.password }" name="okpassword" class="form-control">
								</div>

								<div class="form-group">
									<label>Idnumber</label> <input type="text"
										value="${user.idnumber }" name="idnumber" class="form-control">
								</div>
								<div class="form-group">
									<label>Telephone</label> <input type="text"
										value="${user.telno }" name="telno" class="form-control">
								</div>
								<div class="form-group">
									<input type="hidden" value="${user.admintype }"  name="admintype" class="form-control">
								</div>

								<div class="btn-toolbar list-toolbar">
									<input type="submit" class="btn btn-primary" value="Save">
									<a href="#myModal" data-toggle="modal" class="btn btn-danger">Delete</a>
								</div>
							</form>
						</div>
					</div>
				</div>

				<div class="modal small fade" id="myModal" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h3 id="myModalLabel">Delete Confirmation</h3>
							</div>
							<div class="modal-body">
								<p class="error-text">
									<i class="fa fa-warning modal-icon"></i>Are you sure you want
									to delete the user?
								</p>
							</div>
							<div class="modal-footer">
								<button class="btn btn-default" data-dismiss="modal"
									aria-hidden="true">Cancel</button>
								<button class="btn btn-danger" data-dismiss="modal">Delete</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<script src="lib/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript">
			$("[rel=tooltip]").tooltip();
			$(function() {
				$('.demo-cancel-click').click(function() {
					return false;
				});
			});
		</script>
</body>
</html>
