function C7001_CLEARINFO_GOOD_01() {
    // 중요정보 평문저장 예제
    const crypto = require("crypto");

    function updatePass(dbconn, password, user_id, salt) {
        // 단방향 암호화를 이용하여 비밀번호를 암호화
        const sql = 'UPDATE user SET password=? WHERE user_id=?';
        const hashPw = crypto.createHash('sha256').update(password + salt, 'utf-8').digest('hex');
        const params = [hashPw, user_id];
        dbconn.query(sql, params, function(err, rows, fields){
            if (err) console.log(err);
        })
    }
}

function C7001_CLEARINFO_GOOD_02() {
    // 중요정보 평문전송 예제
    const { io } = require("socket.io-client");
    const crypto = require("crypto");
    const socket = io("http://localhost:3000");
    const PASSWORD = getPassword();

    function aesEncrypt(plainText) {
        const key = getCryptKey();
        const iv = getCryptIV();
        const cipherAes = crypto.createCipheriv('aes-256-cbc', key, iv);

        const encryptedData = cipherAes.update(plainText, 'utf8', 'base64');
        const finalEncryptedData = cipherAes.final('base64');

        return encryptedData + finalEncryptedData;
    }

    function sendPassword(password) {
        // 패스워드 등 중요정보는 암호화하여 전송하는 것이 안전함
        const encPassword = aesEncrypt(password);
        socket.emit("password", encPassword);
    }

    socket.on("password", function(data) {
        if (data === 'success') {
            console.log("\nSuccess to send a message to a server \n")
        }
    });
}