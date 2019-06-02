<?php 
require "connection.php";
@$user_name = $_REQUEST["user_name"];
@$user_pass = $_REQUEST["password"];
$mysql_qry = "select * from employee_data1 where username like '$user_name' and password like '$user_pass';";
$result = mysqli_query($conn ,$mysql_qry);
if(mysqli_num_rows($result) > 0) {
echo "login success";
}
else {
echo "login not success";
}

?>