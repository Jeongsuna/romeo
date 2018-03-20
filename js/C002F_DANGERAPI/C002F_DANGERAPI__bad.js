function C002F_DANGERAPI__bad(){

	//flaw:
	var a = eval(new String('2+2'));
	var b = eval('2+2');

	}