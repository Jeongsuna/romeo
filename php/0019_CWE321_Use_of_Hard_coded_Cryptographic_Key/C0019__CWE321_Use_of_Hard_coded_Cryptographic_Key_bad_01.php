<?php

function VerifyAdminBad($password) {
	//flaw
	if (strcmp($password, "68af404b513073584c4b6f22b6c63e6b")==0) {
		 return true;
	}else{
		return false;
	} 
}

?>



