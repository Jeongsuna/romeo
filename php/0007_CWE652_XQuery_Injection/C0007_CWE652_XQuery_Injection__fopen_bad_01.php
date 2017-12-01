<?php

$handle = @fopen("/tmp/tainted.txt", "r");

if ($handle) {
  if(($name = fgets($handle, 4096)) == false) {
    $name = "";
  }
  fclose($handle);
} else {
  $name = "";
}

$conn = db2_connect("sample", $result1, $result2);

$sql = "SELECT * FROM ".$name;
//flaw
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 
