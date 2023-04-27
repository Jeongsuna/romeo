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