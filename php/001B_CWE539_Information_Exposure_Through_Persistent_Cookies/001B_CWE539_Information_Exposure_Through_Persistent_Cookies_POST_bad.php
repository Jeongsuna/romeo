<?php

$time = $_POST["time"];

$value = 'something from somewhere';

// flaw
setcookie("TestCookie", $value, $time);

?> 
