<?php

// http://php.net/manual/kr/function.openssl-get-cipher-methods.php
function encryptPassword($key, $iv, $pasword){
    //fix
	$encryptedPassword = openssl_encrypt($pasword, 'aes-128-cbc', $key, 0, base64_decode($iv));
	return $encryptedPassword;
}
?>
