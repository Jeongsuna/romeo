function C000B_HTTPSPLIT__bad(){
	var cDay = location.href;
	var cName = location.href;
	var cValue = location.href;
    var expire = new Date();
	
	expire.setDate(expire.getDate() + cDay);
    cookies = cName + '=' + escape(cValue) + '; path=/ '; 
    if(typeof cDay != 'undefined') cookies += ';expires=' + expire.toGMTString() + ';';
    document.cookie = cookies;
}