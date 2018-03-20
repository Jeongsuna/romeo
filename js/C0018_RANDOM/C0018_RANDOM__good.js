function C0018_RANDOM__good(){
	
	var array = new Uint32Array(10);
	window.crypto.getRandomValues(array);

	for (var i = 0; i < array.length; i++) {
    console.log(array[i]);
	}
}
