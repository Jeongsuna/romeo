<?php

$time = $_POST["time"];

$legal_table = array(43200, 86400);

if (in_array($time, $legal_table, true)) {
  $time = $time;
} else {
  $time = $legal_table[0];
}




$value = 'something from somewhere';

// fix : write whilte list
setcookie("TestCookie", $value, $time);

?> 
