function C0001_SQLI_BAD_01(){
    //예제 1
    const mysql = require("mysql");
    // 커넥션 초기화 옵션은 생략함
    const connection = mysql.createConnection({
        host: "your_database_host",
        user: "your_database_user",
        password: "your_database_password",
        database: "your_database_name"
    });
    router.get("/vuln/email", (req, res) => {
        const con = connection;
        const userInput = req.query.id;
        // 사용자로부터 입력받은 값을 검증 없이 그대로 쿼리에 사용
        const query = `SELECT email FROM user WHERE user_id = ${userInput}`;
        con.query(query,
            (err, result) => {
                if (err) console.log(err);
                return res.send(result);
            }
        );
    });
}
function C0001_SQLI_BAD_02() {
    //예제 2
    const mysql = require("mysql");
    const Sequelize = require("sequelize");
    const {QueryTypes} = require("sequelize");
    // 커넥션 및 ORM 초기화 옵션은 생략함
    const connection = mysql.createConnection({
        host: "your_database_host",
        user: "your_database_user",
        password: "your_database_password",
        database: "your_database_name"
    });
    const sequelize = new Sequelize({
        dialect: "mysql",
        host: "your_database_host",
        username: "your_database_user",
        password: "your_database_password",
        database: "your_database_name"
    });
    router.get("/vuln/orm/email", (req, res) => {
        const userInput = req.query.id;
        // 사용자로부터 입력받은 값을 검증 없이 그대로 쿼리에 사용
        const query = `SELECT email
                       FROM user
                       WHERE user_id = ${userInput}`;
        sequelize.query(query, {type: QueryTypes.SELECT})
            .then((result) => {
                return res.send(result);
            }).catch((err) => {
            console.log(err);
        });
    });
}
