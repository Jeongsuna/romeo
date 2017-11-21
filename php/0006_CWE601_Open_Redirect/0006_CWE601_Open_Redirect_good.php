<?php
$redirect_num = $_GET['redirect_num'];

switch ($redirect_num){
	case 1:
		header("Location: " . "www.example.com/index1.html"); 
		break;
	case 2:
		header("Location: " . "www.example.com/index2.html"); 
		break;
	case 3:
		header("Location: " . "www.example.com/index3.html"); 
		break;
	default:
		header("Location: " . "www.example.com/index4.html"); 
		break;
}

?>
