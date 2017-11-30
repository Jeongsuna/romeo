<?php



$userList = $_GET["userList"];


foreach ($userList as &$user) {
    //flaw
    print("<br>".$user);
}

?>



