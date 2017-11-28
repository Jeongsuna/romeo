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

$checkedName = clean($name);
$conn = db2_connect("sample", $result1, $result2);

$sql = "SELECT * FROM ".$checkedName;
$stmt = db2_exec($conn, $sql); 
db2_close($conn);

?> 