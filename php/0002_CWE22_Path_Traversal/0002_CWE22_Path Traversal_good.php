<?php

$dataPath = "/users/cwe/profiles";
$username = $_GET["user"];
$profilePath = $dataPath . "/" . $username.".txt";


// check directory path using str_replace
$profilePath = $string = preg_replace("/[ #\&\+\-%@=\/\\\:;,\.'\"\^`~\_|\!\?\*$#<>()\[\]\{\}]/i", "", $profilePath);


$myfile = fopen($profilePath, "r") or die("Unable to open file : " . $profilePath);
echo fread($myfile,filesize($profilePath));
fclose($myfile);


?>

