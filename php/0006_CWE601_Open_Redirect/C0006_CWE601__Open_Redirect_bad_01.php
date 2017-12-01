<?php
$redirect_url = $_GET['url'];
//flaw
header("Location: " . $redirect_url);
?>