<?php

$message = "Line 1\nLine 2\nLine 3";


$message = wordwrap($message, 70);

// Flaw:
mail('caffeinated@example.com', 'My Subject', $message);
?>
