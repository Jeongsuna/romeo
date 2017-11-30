<?php

$dataPath = "/users/cwe/profiles";
$username = $_GET["user"];
// check directory path using str_replace
$username = preg_replace("/[ #\&\+\-%@=\/\\\:;,\.'\"\^`~\_|\!\?\*$#<>()\[\]\{\}]/i", "", $username);

$profilePath = $dataPath . "/" . $username.".txt";



$myfile = fopen($profilePath, "r") or die("Unable to open file : " . $profilePath);
echo fread($myfile,filesize($profilePath));
fclose($myfile);


?>

