function C001B_PERSCOOKIE__bad{
  var exdate = new Date();
  var days = getParam("day");
  exdate.setDate(exdate.getDate() + days);

  var cookie_value = escape(3) + ((days == null) ? '' : ';    expires=' + exdate.toUTCString());
  //flaw:
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


