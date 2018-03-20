function C0022_LEAKMSG__good(){
	try {
		//...
		
		alert("test");
		
		//...
	}	
	catch(e) {
		//fix:
    onsole.log("Error Message: " + "name is null");
	}

}