// 반복문내에서 엘리먼트 이름을 사용하는 셀렉터를 반복호출하는 경우
for (var i = 0; i < 10; i++) {
    $("td").css()
}

// 반복문내에서 복합 셀렉터를 반복호출하는 경우
for (var i = 0; i < 10; i++) {
    $("table tr td div span").css()
}

var x = 0
while (x < 10) {
    $("td").css()
    var tmp = $("td").css()
    x++
}
