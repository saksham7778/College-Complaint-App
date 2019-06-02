<?php 
require "connection.php";
@$id = $_REQUEST["id"];
@$name = $_REQUEST["name"];
@$surname = $_REQUEST["surname"];
@$age = $_REQUEST["age"];
@$user_name =$_REQUEST["user_name"];
@$password=$_REQUEST["password"];

if($id!='' && $name!='' && $surname!='' && $age!='' && $user_name!='' && $password!='')
{

	$mysql_qry = "insert into employee_data1(id,name,surname,age,username,password) values('$id','$name','$surname','$age','$user_name','$password')";

	$result = mysqli_query($conn,$mysql_qry);

	if($result)
	{
		echo "REGISTER SUCCESS!";
	}
	else
		echo "REGISTER FAILED!";
}
else
{
	echo "Enter all fields";
}
?>