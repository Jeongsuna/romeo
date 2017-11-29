<?php

function clean($string) {
   $string = str_replace(' ', '-', $string); 

   return preg_replace('/[^A-Za-z0-9\-]/', '', $string);
}

$name = $_GET["name"];

$checkedName = clean($name);

//flaw
setcookie("TestCookie", $checkedName);


?> 
