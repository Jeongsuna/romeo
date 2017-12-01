<?php

/*  bad source */

$user = $_GET["user"];
// flaw
header("Location", "/author.jsp?lang=" + $user);
?>
