<?php

$str = "first=value&arr[]=foo+bar&arr[]=baz";

// Flaw:
parse_str($str);

echo $first;  // value
echo $arr[0]; // foo bar
echo $arr[1]; // baz

?>
