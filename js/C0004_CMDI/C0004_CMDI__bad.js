function C0004_CMDI__bad(){
	
	var name = getParam("name");
	//flaw:
    var objWSH = new ActiveXObject("WScript.Shell");
	objWSH.Run(name,1,false);
	objWSH =null;
}

var getParam = function(key){
    var _parammap = {};
    document.location.search.replace(/\??(?:([^=]+)=([^&]*)&?)/g, function () {
        function decode(s) {
            return decodeURIComponent(s.split("+").join(" "));
        }
 
        _parammap[decode(arguments[1])] = decode(arguments[2]);
    });
 
    return _parammap[key];
};
  
