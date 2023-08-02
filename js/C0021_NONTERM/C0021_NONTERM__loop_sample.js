var data = "";

while(true) { // @violation
    data += "….";
}

// for 무한루프
for (;;) { // @violation
    data += "….";
}

function f() {
    for (;;) { // @violation
        data += "….";
        switch (condtion) {
            case 1:
            case 2:
                break;
            case 3:
                break
            default:
                break

        }
    }
}

function f2() {
    var numbers = (1, 2, 3)
    for (var n of numbers) {
        console.log(n);
    }
}

function f3() {
    var obj = {
        "age": 17,
        "name": "John",
        "city": "Washington"
    }

    for (var key in obj) {
        const value = obj[key];
        console.log(value);
    }
}

function fact(num) {
    return num * fact(num-1)
}

function fact(num) {
    a =  num * fact(num-1)
    return a;

}

function zact(num) {
    return zact(num-1) * num
}


function bact(num) {
    return num * (num == 1) ? 1 : bact(num-1)
}


function countDown(fromNumber) {
    console.log(fromNumber);
    countDown(fromNumber-1);
}

function countDown2(fromNumber) {
    console.log(fromNumber);

    let nextNumber = fromNumber - 1;

    if (nextNumber > 0) {
        countDown2(nextNumber);
    }
}

function countDown3(fromNumber) {
    console.log(fromNumber);

    if (fromNumber > 0) {
        countDown3(fromNumber-1);
    }
}