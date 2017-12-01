<?php

$name = $_POST["name"];

$conn = db2_connect("sample", $result1, $result2);
//flaw
$sql = "SELECT * FROM ".$name;
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 