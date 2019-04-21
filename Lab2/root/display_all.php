<html>
<h1> List of all Employees </h1> <br>
</html>

<?php
include "db_connect.php";
//Display all Employee informaiton
$sql = "SELECT employee_no, employee_name, employee_salary FROM employees";
$result = $mysqli->query($sql);

if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {	// output data of each row
        echo "No." . $row["employee_no"]. " \t- Name: " . $row["employee_name"]. " - Salary: " . $row["employee_salary"]. "<br>";
    }
} else { echo "0 results";}
?>

<html>
<br>
<a href = "index.php"> <h4> Return to Main Page </h4> </a>
</html>