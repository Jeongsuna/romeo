<?php


session_start();

if (! session_is_registered("username")) {

echo "invalid session detected!";

[...]

exit;

}

update_profile();

function update_profile {

//flaw
SendUpdateToDatabase($_SESSION['username'], $_POST['email']);
[...]
echo "Your profile has been successfully updated.";

}
?>

