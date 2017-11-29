<?php

function clean($string) {
   $string = str_replace(' ', '-', $string); 

   return preg_replace('/[^A-Za-z0-9\-]/', '', $string);
}

$name = $_SESSION["name"];

$checkedName = clean($name);
setcookie("TestCookie", $checkedName);

?> 
