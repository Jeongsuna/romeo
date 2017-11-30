<?php

$doc = new DOMDocument;
$doc->preserveWhiteSpace = false;
$doc->Load('book.xml');

$xpath = new DOMXPath($doc);
$query = "//Employee[UserName/text()='" + $_GET['Username']
                + "' And Password / text() = '" + $_GET['Password'] + "']";
$entries = $xpath->query($query);



?>

