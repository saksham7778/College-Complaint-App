<style>
td
{
	padding:10px;
}
</style>
<?php
require "connection.php";
$querry="SELECT * FROM employee_DATA1 ;";

$data=mysqli_query($conn,$querry);

$total = mysqli_num_rows($data);

if($total!=0)
{
	?>
  <table>
  <tr>
	<th>name</th>
	<th>surname</th>
	<th>age</th>
	<th>username</th>
	<th>password</th>
  </tr>

<?php
	while($result = mysqli_fetch_assoc($data))
	{
		echo "<tr>
	<td>".$result['name']."</td>
	<td>".$result['surname']."</td>
	<td>".$result['age']."</td>
	<td>".$result['username']."</td>
	<td>".$result['password']."</td>
  </tr> ";
		
	}
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
</table>