<?php
$value = 'something from somewhere';

// flaw:
setcookie("TestCookie", $value, time()+86400*24);  /* expire in 24 days */
?>
