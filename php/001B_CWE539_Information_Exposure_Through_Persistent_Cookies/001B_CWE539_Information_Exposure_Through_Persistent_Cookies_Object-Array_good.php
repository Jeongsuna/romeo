<?php


class Input{
  private $input;

  public function getInput(){
    return $this->input[1];
  }

  public  function __construct(){
    $this->input = array();
    $this->input[0]= 'safe' ;
    $this->input[1]= $_GET['UserData'] ;
    $this->input[2]= 'safe' ;
  }
}



$temp = new Input();
$name =  $temp->getInput();

$legal_table = array("safe1", "safe2");

if (in_array($name, $legal_table, true)) {
  $name = $name;
} else {
  $name = $legal_table[0];
}




setcookie("TestCookie", $name);


?> 
