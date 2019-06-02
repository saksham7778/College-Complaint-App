<?php

$server_name="localhost";
$mysql_username="root";
$mysql_password="";
$db_name="employee101";

$conn = mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name);
/*if($conn){
	echo"connection sucess";
}
else
{
	echo "connection failed because".mysqli_connect_error();
}*/
?>