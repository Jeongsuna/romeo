<?php
$user = $_GET["user"];
//use urlencode
setcookie("user", urlencode($user), time() + 3600);



?>

