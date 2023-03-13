function getItem() {
    localStorage.getItem("itemId");
}

function getItem() {
    sessionStorage.getItem("itemId");
}

function prepareDatabase(ready, error) {

    var db = openDatabase('documents', '1.0', 'sql', 5*1024*1024, db => {
        db.changeVersion('', '1.0', function(t) {
            t.executeSql('CREATE TABLE docids (id, name)');
        }, error);
    });

    db.changeVersion('', '1.0', function(t) {
        t.executeSql('CREATE TABLE docids (id, name)');
    }, error)

    db.changeVersion('', '1.0', t => t.executeSql('CREATE TABLE docids (id, name)'), error => error.message)

    db.transaction((transaction) => transaction.executeSql('CREATE TABLE docids (id, name)'), error => {error.message}, function()  {})

    db.readTransaction((transaction) => {transaction.executeSql('CREATE TABLE docids (id, name)')}, error => {error.message}, function()  {})

    return openDatabase('documents', '1.0', 'sql', 5*1024*1024, function(db) {
        db.changeVersion('', '1.0', function(t) {
            t.executeSql('CREATE TABLE docids (id, name)');
        }, error);
    });
}

