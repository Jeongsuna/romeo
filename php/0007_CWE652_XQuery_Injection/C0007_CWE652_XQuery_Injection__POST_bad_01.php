<?php

$name = $_POST["name"];

$conn = db2_connect("sample", $result1, $result2);

$sql = "SELECT * FROM ".$name;
//flaw
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 
