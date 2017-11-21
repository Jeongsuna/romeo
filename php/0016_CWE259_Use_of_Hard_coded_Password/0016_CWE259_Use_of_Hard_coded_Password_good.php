<?php

$fp1 = fopen("document1.txt","r"); 
$result1 = fread($fp1, filesize("document1.txt"));
fclose($fp1); 

$fp2 = fopen("document2.txt","r"); 
$result2 = fread($fp2, filesize("document2.txt")); 
fclose($fp2); 


$conn = new mysqli($servername, $result1, $result2);


?>
