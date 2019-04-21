<html>

<head>
<h1> Welcome to pNations Co. Salary Management Page </h1>
</head>

<body>

<?php
include "db_connect.php"; 	//Creates $mysqli variable
?>
<h3> <a href = "display_all.php">  Click To view All Employees </a> </h3>

<br>
<h1> Specify employee salary range for query: <br>  </h1> 
<form action="/salary_range.php">
  Salary Lower Bound:<br>
  <input type="text" name="lBound" value="55000"><br>
  Salary Upper Bound:<br>
  <input type="text" name="uBound" value="85000"><br><br>
  <input type="submit" value="Submit">
</form>


<?php $mysqli->close(); ?>

</body>


</html>