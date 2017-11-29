<?php



$name = $_SESSION["name"];

$legal_table = array("safe1", "safe2");

if (in_array($name, $legal_table, true)) {
  $name = $name;
} else {
  $name = $legal_table[0];
}




setcookie("TestCookie", $name);
?> 
