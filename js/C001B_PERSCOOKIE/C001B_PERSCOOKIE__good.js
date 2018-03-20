function C001B_PERSCOOKIE__good{
  var exdate = new Date();
  
  var  arg = getParam("arg");
  var  days ;
  
  switch (arg) {
  case 'a'  : days = 1; break;
  case 'b'  : days = 2; break;
  case 'c'  : days = 3; break;
  default   : days = 4; break;
  }
  
  exdate.setDate(exdate.getDate() + days);
  
  var cookie_value = escape("test1") + ((days == null) ? '' : ';    expires=' + exdate.toUTCString());
  
  document.cookie = "testName" + '=' + cookie_value;
  
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

 