<?php

$handle = @fopen("/tmp/tainted.txt", "r");

if ($handle) {
  if(($time = fgets($handle, 4096)) == false) {
    $time = "";
  }
  fclose($handle);
} else {
  $time = "";
}


$value = 'something from somewhere';

// flaw
setcookie("TestCookie", $value, $time);

?> 
