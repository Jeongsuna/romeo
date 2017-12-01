<?php
$value = 'something from somewhere';

// fix:
setcookie("TestCookie", $value, time()+86400);  /* expire in 24 hour */
?>
