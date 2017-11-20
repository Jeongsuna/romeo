<?php

$ dir = $ _GET [ 'module_name']; 

switch($dir){
	case "update":
		include ( "/update/function.php");
		break;
	case "delete":
		include ( "/delete/function.php");
		break;
	case "select":
		include ( "/select/function.php");
		break;
	default:
		include ( "/errorMessage.php");
}

?>
