function C0012_WRONGPERM_BAD_01() {
    const fs = require("fs");

    function writeFile() {
        // 소유자 이외에는 권한을 가지지 않음
        fs.chmodSync("/root/system_config", 0o700);
        fs.open("/root/system_config", "w", function(err,fd) {
            if (err) throw err;
        });
        fs.writeFile("/root/system_config", "your config is broken", function(err) {
            if (err) throw err;
            console.log('write end');
        })
    }
}
