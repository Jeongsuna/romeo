<?php


$dataPath = "/users/cwe/profiles";
$username = $_GET["user"];
$profilePath = $dataPath . "/" . $username.".txt";

//flaw
$myfile = fopen($profilePath, "r") or die("Unable to open file : " . $profilePath);
echo fread($myfile,filesize($profilePath));
fclose($myfile);

?>



