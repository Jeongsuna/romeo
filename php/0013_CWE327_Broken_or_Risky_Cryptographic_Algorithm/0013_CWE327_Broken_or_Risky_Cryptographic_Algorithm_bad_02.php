<?php

// http://php.net/manual/kr/function.openssl-get-cipher-methods.php
function encryptPassword($key, $iv, $pasword){
    //flaw
	$encryptedPassword = openssl_encrypt($pasword, 'DES-CBC', $key, 0, base64_decode($iv));
	return $encryptedPassword;
}
?>



