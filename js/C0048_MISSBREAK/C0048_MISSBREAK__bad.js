function C0048_MISSBREAK__bad(){

var arg = getParam("arg");
var f ;

switch (arg) {
	//flaw:
  case 'a'  : f = new File([""], "fileName1"); 
  case 'b'  : f = new File([""], "fileName2"); 
  case 'c'  : f = new File([""], "fileName3"); 
  default   : f = new File([""], "fileName4"); 
}

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



