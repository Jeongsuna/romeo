<?php



$userList = $_GET["userList"];


foreach ($userList as &$user) {
   
    //check External String Using str_replace
    $checkedUser= str_replace ("<","",$user);
    $checkedUser= str_replace (">","",$checkedUser);
    print("<br>".$checkedUser);
}

?>

