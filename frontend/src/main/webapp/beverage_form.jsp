<%@ page import="de.uniba.dsg.dsam.model.Incentive" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Incentive</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>New Beverage</h1>
		
		<p>&nbsp;</p>
		
		<form role="form" action="/frontend/beverages" method="post">
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Beverage Name</span>
					<input name="beverage_name" type="text" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Beverage Manufacturer</span>
					<input name="beverage_manufacturer" type="text" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Quantity</span>
					<input name="beverage_quantity" type="number" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Price</span>
					<input name="beverage_price" type="text" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<select class="custom-select" name="incentive">
						<option selected value="-1">Open this select menu</option>
						<%
							List<Incentive> incentives = (List<Incentive>) request.getSession().getAttribute("incentives");
							for(Incentive incentive: incentives) {
						%>
						<option value="<%= incentive.getId()%>"><%= incentive.getName().toUpperCase()%></option>
						<% }%>
					</select>
				</div>
			</div>
			<a href="/frontend/beverages" class="btn btn-default">Cancel</a>
			<button type="submit" class="btn btn-success">Save</button>
		</form>					
		
	</div>
</body>
</html>