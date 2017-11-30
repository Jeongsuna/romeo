<?php

function generateSessionID($userID){
	
srand($userID);
//flaw
return rand();

}
?>



