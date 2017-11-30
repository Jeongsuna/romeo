<?php
try {
openDbConnection();

}catch (Exception $e) {

echo 'Check credentials in config file at: ', $Mysql_config_location, '\n';

}
?>
