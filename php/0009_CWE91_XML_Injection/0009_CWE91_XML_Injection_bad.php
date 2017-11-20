<?php

$xml_string = file_get_contents('data.xml');
$xml = simplexml_load_string($xml_string);

//flaw
echo $xml->total; 

?>



