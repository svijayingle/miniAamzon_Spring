<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<style> 
input[type=text] {
  width: 100%;
  padding: 6px 15px;
  margin: 6px 0;
  box-sizing: border-box;
}
input[type=submit] {
  width: 30%;
  padding: 12px 20px;
  margin: auto;
  box-sizing: border-box;
}
.error
{
	color:red;
}
</style>
</head>
<body>
	<h2>HOME | Shopify</h2>
	<hr>
	<div style="margin:auto ; width:30% ; align-items: center;">
		<form:form action="processform" modelAttribute="user">
			
			First Name : <form:input path="firstname" /><form:errors path="firstname" cssClass="error"></form:errors><br><br>
			
			Last Name : <form:input path="lastname" /><form:errors path="lastname" cssClass="error"></form:errors><br><br>
			
			Address : <form:input path="address" /><br><br>
			
			Phone : <form:input path="phone" /><br><br>
			
			Email : <form:input path="email" /><form:errors path="email" cssClass="error"></form:errors><br><br>
			
			Username : <form:input path="Username" /><form:errors path="Username" cssClass="error"></form:errors><br><br>
			
			Password : <form:input path="Password" /><form:errors path="Password" cssClass="error"></form:errors><br><br>
			
			<input style="margin-left:35% ; width:30% ; align-items: center;" type="submit" value="submit"/>
			<br><br>
		</form:form>
			<span style="margin-left:30% ; width:40% ; align-items: center;">
				Already have account <a href="login">Login</a>
			</span>
	</div>
	
</body>
</html>