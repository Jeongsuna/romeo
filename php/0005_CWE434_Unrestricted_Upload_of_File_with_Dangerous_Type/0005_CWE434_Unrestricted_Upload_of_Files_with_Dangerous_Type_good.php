<?php


foreach ($_FILES["pictures"]["error"] as $key => $error) {
   if ($error == UPLOAD_ERR_OK) {
       echo"$error_codes[$error]";

    $ext =  $_FILES["pictures"]["name"][$key] 
    if(@preg_match($ext, "jpg|png|gif|jpeg")){ 

    	move_uploaded_file(
         $_FILES["pictures"]["tmp_name"][$key], 
         $_FILES["pictures"]["name"][$key] 
       ) or die("Problems with upload");
    }
   
   }
}



?>
