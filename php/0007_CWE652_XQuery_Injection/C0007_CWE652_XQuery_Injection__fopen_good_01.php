<?php

function clean($string) {
   $string = str_replace(' ', '-', $string); 

   return preg_replace('/[^A-Za-z0-9\-]/', '', $string);
}

$handle = @fopen("/tmp/tainted.txt", "r");

if ($handle) {
  if(($name = fgets($handle, 4096)) == false) {
    $name = "";
  }
  fclose($handle);
} else {
  $name = "";
}

$checkedName = clean($name);
$conn = db2_connect("sample", $result1, $result2);

$sql = "SELECT * FROM ".$checkedName;
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 