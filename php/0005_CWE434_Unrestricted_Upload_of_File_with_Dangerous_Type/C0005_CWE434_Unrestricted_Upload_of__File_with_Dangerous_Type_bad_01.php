<?php

$target = "pictures /". basename ($_FILES [ 'uploadedfile'] [ 'name']));

//flaw
if (move_uploaded_file ($_FILES [ 'uploadedfile'] [ 'tmp_name'], $target)) 
{
echo "The picture has been successfully uploaded.";

} 
else 
{
echo "There was an error uploading the picture, please try again.";

}
?>