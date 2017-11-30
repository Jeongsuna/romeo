<?php


class Input{
  private $input;

  public function getInput(){
    return $this->input[1];
  }

  public  function __construct(){
    $this->input = array();
    $this->input[0]= 'safe' ;
    $this->input[1]= $_GET['time'] ;
    $this->input[2]= 'safe' ;
  }
}



$temp = new Input();
$time =  $temp->getInput();

$legal_table = array(43200, 86400);

if (in_array($time, $legal_table, true)) {
  $time = $time;
} else {
  $time = $legal_table[0];
}



$value = 'something from somewhere';

// fix : write whilte list
setcookie("TestCookie", $value, $time);

?> 
