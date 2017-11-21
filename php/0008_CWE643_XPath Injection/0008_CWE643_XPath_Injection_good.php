<?php

$doc = new DOMDocument;
$doc->preserveWhiteSpace = false;
$doc->Load('book.xml');

$xpath = new DOMXPath($doc);
$query = "//Employee[UserName/text()='" + str_replace("'","&apos;",$_GET['Username'])
                + "' And Password / text() = '" + str_replace("'","&apos;",$_GET['Password']) + "']";
$entries = $xpath->query($query);



?>

