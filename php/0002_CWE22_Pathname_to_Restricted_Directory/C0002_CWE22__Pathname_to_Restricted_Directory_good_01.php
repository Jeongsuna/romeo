<?php

$dataPath = "/users/cwe/profiles";
$username = $_GET["user"];
$profilePath = $dataPath . "/" . $username.".txt";


// check directory path using str_replace
$checkedPath = str_replace("/","",profilePath);
$checkedPath = str_replace("/","",checkedPath);

$myfile = fopen($checkedPath, "r") or die("Unable to open file : " . $checkedPath);
echo fread($myfile,filesize($checkedPath));
fclose($myfile);


?>

