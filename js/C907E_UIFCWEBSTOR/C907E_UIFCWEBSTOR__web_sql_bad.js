function prepareDatabase(ready, error) {
    return openDatabase('documents', '1.0', 'sql', 5*1024*1024, function(db) {
        db.changeVersion('', '1.0', function(t) {
            t.executeSql('CREATE TABLE docids (id, name)');
        }, error);
    });
}
