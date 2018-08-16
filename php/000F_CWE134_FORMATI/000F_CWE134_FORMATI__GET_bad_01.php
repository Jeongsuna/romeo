<?php

function p($arg) {	
	$tainted = $_GET['UserData'];
	//flaw
	printf($tainted, $arg);
}
?>
