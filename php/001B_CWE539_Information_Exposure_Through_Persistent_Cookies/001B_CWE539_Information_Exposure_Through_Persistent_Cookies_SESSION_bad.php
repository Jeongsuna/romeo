<?php

$name = $_SESSION["name"];


//flaw
setcookie("TestCookie", $name);

?> 
