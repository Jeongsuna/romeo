function C0003_XSS__good(){
	var arg = getParam("arg");
	var name;

  switch (arg) {
  case 'a'  : name  = "name1"; break;
  case 'b'  : name  = "name2"; break;
  case 'c'  : name  = "name3"; break;
  default   : name  = "name4"; break;
}
    document.getElementById('name').innerHTML=name;
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
  

