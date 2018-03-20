function C0018_RANDOM__bad(){
		
	//flaw:
	var result = Math.floor(Math.random() * 10) + 1;
	document.write(result);
}