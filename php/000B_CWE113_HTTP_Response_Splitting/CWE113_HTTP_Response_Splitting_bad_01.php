<?php
$user = $_GET["user"];
//flaw
setcookie("user", $user, time() + 3600);



?>



