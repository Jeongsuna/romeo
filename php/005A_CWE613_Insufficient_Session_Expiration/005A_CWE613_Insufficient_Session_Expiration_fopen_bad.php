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


session_cache_expire($time);

session_start();

echo session_cache_expire();

?>



