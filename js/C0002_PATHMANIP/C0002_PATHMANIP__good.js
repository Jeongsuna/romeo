function C0002_PATHMANIP__good(){
var arg = getParam("arg");
var f ;

switch (arg) {
  case 'a'  : f = new File([""], "fileName1"); break;
  case 'b'  : f = new File([""], "fileName2"); break;
  case 'c'  : f = new File([""], "fileName3"); break;
  default   : f = new File([""], "fileName4"); break;
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





