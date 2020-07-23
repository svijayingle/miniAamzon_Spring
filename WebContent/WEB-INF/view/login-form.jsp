<!DOCTYPE html>
<html>
<head>
<title>HOME | LOGIN</title>
<style>
input[type=text] {
  width: 100%;
  padding: 8px 15px;
  margin: 8px 0;
  box-sizing: border-box;
}
input[type=submit] {
  width: 30%;
  padding: 12px 20px;
  margin: auto;
  box-sizing: border-box;
}
</style>
</head>
<body>
	<div style="margin:auto ; width:30% ; align-items: center;">
		<form action="loginprocess" method="GET">
			<input type="text" name="Username" placeholder="Username">
			<br><br>
			<input type="text" name="Password" placeholder="Password">
			<br><br>
			<input type="submit" name="submit" value="Login">
		</form>
	</div>
</body>
</html>