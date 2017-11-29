<?php

$time = $_SESSION["time"];


$value = 'something from somewhere';

// flaw
setcookie("TestCookie", $value, $time);

?> 
