<?php

function generateSessionIDBad($userID){
	
srand($userID);
//flaw
return rand();

}
?>



