<?php

 $string = 'cup'; 
 $name = 'coffee'; 
 $str = 'This is a $string with my $name in it.'; 
 echo $str. "\n"; 
 //flaw
 eval("\$str = \"$str\";"); 
 echo $str. "\n"; 




?>
