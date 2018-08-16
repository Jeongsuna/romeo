<?php

$tainted = $_GET['UserData'];

//no_sanitizing
$perm = sprintf("07%s", $tainted);

//flaw
chmod("/dir", $perm); //execution

?>
