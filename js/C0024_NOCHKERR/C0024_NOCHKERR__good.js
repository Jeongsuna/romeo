function C0024_NOCHKERR__good(){

	
		
	var parts = [
					new Blob(['you construct a file...'], {type: 'text/plain'}),
					' Same way as you do with blob',
					new Uint16Array([33])
				];

		// Construct a file
		var file = new File(parts, 'sample.txt', {
			lastModified: new Date(0), // optional - default = now
			type: "overide/mimetype" // optional - default = ''
		});

		var fr = new FileReader();

		fr.onload = function(evt){
			document.body.innerHTML = evt.target.result + "<br><a href="+URL.createObjectURL(file)+" download=" + file.name + ">Download " + file.name + "</a><br>type: "+file.type+"<br>last modified: "+ file.lastModifiedDate
		}

	try{	
		fr.readAsText(file);
	}catch(e){
		
	 console.log("filePathError");
	
	}
	
}