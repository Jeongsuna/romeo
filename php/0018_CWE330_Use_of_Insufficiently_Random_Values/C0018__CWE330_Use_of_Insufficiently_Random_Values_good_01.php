<?php

function generateSessionID($userID){

 // As of PHP 4.2.0 , There is no need to seed the random number generator 
 // with srand() or mt_srand() as this is done automatically.
return rand();

}
?>
