<?php
try {
openDbConnection();

}catch (Exception $e) {
//flaw
echo 'Caught exception: ', $e->getMessage(), '\n';

}
?>



