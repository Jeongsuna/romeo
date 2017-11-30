<?php

 $target = "pictures /". basename ($_FILES [ 'uploadedfile'] [ 'name']));


 $ext = array_pop(explode(".", strtolower($target)));

 if(@preg_match($ext, "jpg|png|gif|jpeg")){ 

 	if (move_uploaded_file ($_FILES [ 'uploadedfile'] [ 'tmp_name'], $target)) 
	{
	echo "The picture has been successfully uploaded.";

	} 
	else 
	{	
	echo "There was an error uploading the picture, please try again.";

	}    
} else{
	echo "Invalid extension on file.";
}


?>
