<?php

$doc = new DOMDocument;
$doc->preserveWhiteSpace = false;
$doc->Load('book.xml');

$xpath = new DOMXPath($doc);
$query = '//book/chapter/para/informaltable/tgroup/tbody/row/entry[. = "en"]';
$entries = $xpath->query($query);

foreach ($entries as $entry) {
	//flaw
    echo {$entry->previousSibling->previousSibling->nodeValue}

}

?>