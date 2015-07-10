<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<link type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<link type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
	rel="stylesheet">
<link type="text/css" href="../assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<link type="text/css" href="../assets/css/timesheet.css" rel="stylesheet">
<link rel="icon" href="../assets/images/calendar.png">
<title>Time Sheet</title>
</head>


<body background="..report.jsp/images/Art-White-Hours-Wallpaper-HD-197.jpg">
	<div>
		<%@include file="../WEB-INF/jspf/navbarfragment.jspf"%>
		<%@include file="../WEB-INF/jspf/loginmodal.jspf"%>
		<%@include file="../WEB-INF/jspf/edittimemodal.jspf"%>
		<%@include file="../WEB-INF/jspf/timereport.jspf"%>


	</div>
	<div class="timereport">
		<h1 class="timereporttext">This is a report</h1>
		<table class="timereporttext tableborder">
			<thead>
				<tr>
					<th>cat 1</th>
					<th>cat 2</th>
					<th>cat 3</th>
				</tr>
			</thead>
			<tr>
				<td>item</td>
				<td>item</td>
				<td>item</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>

		</table>
	</div>




	<%@include file="../WEB-INF/jspf/footerfragment.jspf"%>
	<script src="../assets/js/jquery-1.11.3.min.js"></script>
	<script src="../assets/js/bootstrap.min.js"></script>
	<script src="../assets/js/moment.js"></script>
	<script src="../assets/js/bootstrap-datetimepicker.min.js"></script>
	<script src="../assets/js/timesheet.js"></script>
</body>

</html>