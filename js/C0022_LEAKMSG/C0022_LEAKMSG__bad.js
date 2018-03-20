function C0022_LEAKMSG__bad(){
	try {
		//...
		
		alert("test");
		
		//...
	}	
	catch(e) {
		//flaw:
    console.log("Error Message: " + e.message);
	}

}