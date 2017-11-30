<?php

$time = $_GET["time"];
$value = 'something from somewhere';

// flaw
setcookie("TestCookie", $value, $time);

?> 
