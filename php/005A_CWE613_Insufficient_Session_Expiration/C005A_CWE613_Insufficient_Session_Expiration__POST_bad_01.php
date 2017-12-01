<?php

$time = $_POST["time"];


session_cache_expire($time);

session_start();

echo session_cache_expire();

?>



