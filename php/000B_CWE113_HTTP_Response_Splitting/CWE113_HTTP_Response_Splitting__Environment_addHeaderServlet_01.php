<?php

/*  bad source */

$user = $_GET["user"];
//flaw
header("Location", "/author.jsp?lang=" + $user);




/*  good source */

$user = $_GET["user"];

 /* FIX: Use a hardcoded string */
header(Location", "/author.jsp?lang=" ."food"");

