<?php

$tainted = $_GET['UserData'];

//no_sanitizing

//flaw
eval($tainted); //execution

?>
