<?php

$xml_string = file_get_contents('data.xml');
$xml = simplexml_load_string($xml_string);

$checkedXML = str_replace("<","",xml);
$checkedXML = str_replace(">","",checkedXML);

echo $xml->total;

?>