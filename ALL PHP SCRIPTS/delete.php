<?php
require "connection.php";
@$id = $_REQUEST["id"];
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
		$mysql_qry = "DELETE FROM `employee_data1` WHERE id='$id'";

		$result1 = mysqli_query($conn,$mysql_qry);
	
			if($result1)
			{
				echo $id." RECORD DELETED!";
			}
			else
			{
				echo "RECORD DELETION FAILED!";
			}
	
}
else
{
	echo "Record with id :- ".$id." not found !!";
}
?>