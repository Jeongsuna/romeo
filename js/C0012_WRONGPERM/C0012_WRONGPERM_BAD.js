function C0012_WRONGPERM_BAD_01() {
    const fs = require("fs");

    function writeFile() {
        // 모든 사용자가 읽기, 쓰기, 실행 권한을 가지게 됨
        fs.chmodSync("/root/system_config", 0o777);
        fs.open("/root/system_config", "w", function(err,fd) {
            if (err) throw err;
        });
        fs.writeFile("/root/system_config", "your config is broken", function(err) {
            if (err) throw err;
            console.log('write end');
        });
    }
}
