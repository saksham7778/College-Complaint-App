
<?php
require "connection.php";
@$querry="SELECT name,surname,age FROM employee_data1 ;";

$data=mysqli_query($conn,$querry);

$total = mysqli_num_rows($data);
$name = "";
$surname="";
$age="";
$data1;
if($total!=0)
{
	while(@$result = mysqli_fetch_assoc($data))
	{
		$name = $name."".$result['name'].",";
		$surname = $surname."".$result['surname'].",";
		$age = $age."".$result['age'].",";
	//	echo $result['name'].",".$result['surname'].",".$result['age']." <br/>";
	}
	$data1 = $name."&".$surname."&".$age;
	echo $data1;
}

else
{
	echo "no records found!<br/>";
}

//to learn how to use loops
/*$a=5;
while($a>0)
{
	echo $a." <br/>";
	$a--;
}
*/
?>