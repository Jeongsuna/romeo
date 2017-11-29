<?php

/*  bad source */

//flaw
$user = $_GET["user"];
header("Location", "/author.jsp?lang=" + $user);




/*  good source */

$user = $_GET["user"];

 /* FIX: Use a hardcoded string */
header(Location", "/author.jsp?lang=" ."food"");

