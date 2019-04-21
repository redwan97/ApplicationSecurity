<?php
//Search database in salary range
$lowerRange = $_GET["lBound"];
$upperRange = $_GET["uBound"];
?>

<html>
<h1> Displaying Salary in Query Range <?php echo $lowerRange ?> and <?php echo $upperRange ?> </h1>
</html>

<?php
include "db_connect.php"; 	//Creates $mysqli variable

$sql = "SELECT employee_no, employee_name, employee_salary FROM employees WHERE employee_salary BETWEEN $lowerRange AND $upperRange";
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