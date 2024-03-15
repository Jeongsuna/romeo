function C0001_SQLI_BAD_01(){
    //예제 1
    const mysql = require("mysql");
    //...
    router.get("/patched/email", (req, res) => {
        const con = connection;
        const userInput = req.query.id;
        const query = 'SELECT email FROM user WHERE user_id = ?';
        // 쿼리 함수에 사용자 입력값을 매개변수 형태로 전달, 이렇게 작성하면 사용자 입력값에
        // escape 처리를 한 것과 동일한 결과가 실행
        con.query(query, userInput,
            (err, result) => {
            if (err) console.log(err);
            return res.send(result);
            }
        );
    });
}
function C0001_SQLI_BAD_02() {
    //예제 2
    router.get("/vuln/orm/email", (req, res) => {
        const userInput = req.query.id;
        // 쿼리 내에서 바인딩이 필요한 부분을 $number로 표기
        const query = `SELECT email FROM user WHERE user_id = $1`;
        // 인자화된 쿼리 기능을 통해 쿼리를 생성 및 실행
        sequelize.query(query,
            {
                bind: [userInput],
                type: QueryTypes.SELECT
            })
            .then((result) => {
            return res.send(result);
        }).catch((err) => {
            console.log(err);
        });
    })
}
