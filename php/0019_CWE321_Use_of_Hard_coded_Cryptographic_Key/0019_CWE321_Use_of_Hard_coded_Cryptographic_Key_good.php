<?php

$fp1 = fopen("document1.txt","r"); 
$result1 = fread($fp1, filesize("document1.txt"));
fclose($fp1); 


function VerifyAdmin ($password) {
	
	global $result1;
	
	if (strcmp($password, $result1)==0) {
		 return true;
	}else{
		return false;
	} 
}

?>
