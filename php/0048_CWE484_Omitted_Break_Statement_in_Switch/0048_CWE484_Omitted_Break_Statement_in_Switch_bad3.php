<?php

function  ($month){

	switch ($month) {

		case 1: echo("January");break;
		case 2: echo("February");
		case 3: echo("March");
		case 4: echo("April"); break;
		case 5: echo("May");
		case 6: echo("June");break;
		case 7: echo("July");
		case 8: echo("August");
		case 9: echo("September");
		case 10: echo("October"); break;
		case 11: echo("November");
		case 12: echo("December");
		default: echo ("error");
		}
}

?>