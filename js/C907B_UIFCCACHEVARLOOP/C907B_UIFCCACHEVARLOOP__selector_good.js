// 셀렉터 결과를 캐시하여 사용 하도록 변경

var $_td =$("td");
for (var i = 0; i < 10; i++) {
    $_td.css()
}

var $_table = $("table tr td div span");
for (var i = 0; i < 10; i++) {
    $_table.css()
}