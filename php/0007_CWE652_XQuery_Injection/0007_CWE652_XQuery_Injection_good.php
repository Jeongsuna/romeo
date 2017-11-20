<?php

$name = $_GET["name"];
$checkedName = preg_replace("/[ #\&\+\-%@=\/\\\:;,\.'\"\^`~\_|\!\?\*$#<>()\[\]\{\}]/i", "", $name);

$conn = db2_connect("sample", $result1, $result2);

$sql = "SELECT * FROM ".$checkedName;
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 