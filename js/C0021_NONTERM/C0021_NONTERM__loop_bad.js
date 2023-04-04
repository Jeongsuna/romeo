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