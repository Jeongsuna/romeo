function C7001_CLEARINFO_BAD_01() {
    // 중요정보 평문저장 예제
    function updatePass(dbconn, password, user_id) {
        // 암호화되지 않은 비밀번호를 DB에 저장하는 경우 위험함
        const sql = 'UPDATE user SET password=? WHERE user_id=?';
        const params = [password, user_id];

        dbconn.query(sql, params, function(err, rows, fields){
            if (err) console.log(err);
        })
    }
}

function C7001_CLEARINFO_BAD_02() {
    // 중요정보 평문전송 예제
    const { io } = require("socket.io-client");
    const socket = io("http://localhost:3000");

    function sendPassword(password) {
        // 패스워드를 암호화 하지 않고 전송하여 안전하지 않음
        socket.emit("password", password);
    }

    socket.on("password", function(data) {
        if (data === 'success') {
            console.log("\nSuccess to send a message to a server \n")
        }
    });
}
