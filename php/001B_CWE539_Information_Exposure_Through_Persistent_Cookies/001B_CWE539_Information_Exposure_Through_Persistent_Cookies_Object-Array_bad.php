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

$value = 'something from somewhere';

// flaw
setcookie("TestCookie", $value, $time);

?> 
