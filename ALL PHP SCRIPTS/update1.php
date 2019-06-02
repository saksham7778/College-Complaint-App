<?php 
require "connection.php";
@$id = $_REQUEST["id"];
@$name = $_REQUEST["name"];
@$surname = $_REQUEST["surname"];
@$age = $_REQUEST["age"];
@$user_name =$_REQUEST["user_name"];
@$password=$_REQUEST["password"];



@$querry="SELECT id FROM employee_data1 ;";

$data=mysqli_query($conn,$querry);

$total = mysqli_num_rows($data);

while(@$result = mysqli_fetch_assoc($data))
	{
		@$id1 = $result['id'];
		//echo $id1."<br/>";
		if($id==$id1)        	
		{
				$data1= "record found";
		}
	}
	
if(@$data1=="record found")
{
	if($id!='' && $name!='' && $surname!='' && $age!='' && $user_name!='' && $password!='')
	{
	
		$mysql_qry = "UPDATE `employee_data1` SET `id`='$id',`name`='$name',`surname`='$surname',`age`='$age',`username`='$user_name',`password`='$password' WHERE id='$id'";

		$result1 = mysqli_query($conn,$mysql_qry);
	
			if($result1)
			{
				echo "UPDATE succcess";
			}
			else
			{
				echo "UPDATE failed";
			}
	}
	else
	{
		echo "Enter all fields";
	}
	
}
else
{
	echo "record not found";
}
?>