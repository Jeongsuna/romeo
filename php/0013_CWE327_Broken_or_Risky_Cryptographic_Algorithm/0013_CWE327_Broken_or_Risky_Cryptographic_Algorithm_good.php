<?php

function encryptPassword($password){
	// using AES algorithm
$iv_size = mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_CBC);
$iv = mcrypt_create_iv($iv_size, MCRYPT_RAND);
$key = "This is a password encryption key";
	// using AES algorithm
$encryptedPassword = mcrypt_encrypt(MCRYPT_RIJNDAEL_128, $key, $password, MCRYPT_MODE_CBC, $iv);
return $encryptedPassword;

}

?>
