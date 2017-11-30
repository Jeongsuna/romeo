<?php


session_start();

if (! session_is_registered("username")) {

echo "invalid session detected!";

[...]

exit;

}

update_profile();

function update_profile {

$checkedUserName = checking_username($_SESSION['username']);
$checkedEmail = checking_Email($_POST['email']);

if(is_null($checkedUserName) || is_null($checkedEmail) ){
	return;
}

SendUpdateToDatabase($checkedUserName, $checkedEmail);
[...]
echo "Your profile has been successfully updated.";

}
?>

