var data = "";

// while 반복문 내 break 존재
while(true) {
    data += "….";
    if (condition == true) {
        break;
    }
}

// for 반복문 내 break 존재
for (;;) {
    data += "….";
    if (condition == true) {
        break;
    }
}

function f() {
    for (;;) { // @violation
        data += "….";
        switch (condtion) {
            case 1:
            case 2:
                break;
            case 3:
                return;
            default:
                break

        }
    }
}

function fact(num) {
    if(num == 1) {
        return 1;
    } else {
        return num * fact(num - 1)
    }
}


function cact(num) {
    var x
    if(num == 1) {
        x =  1;
    } else {
        x = num * cact(num - 1)
    }

    return x;
}

function cact2(num) {
    if(num == 1) {
        return 1;
    } else {
        return num * cact2(num - 1)
    }
}

function cact3(num) {
    x
    if(num == 1) {
        x =  1;
    } else {
        x = num * cact3(num - 1)
    }

    return x;
}


function aact(num) {
    switch (num) {
        case 1:
            return 1;
        default:
            return num * aact(num - 1)
    }
}

function getContext(canvas) {
  canvas.witdh = canvas.height = 1;
  var ratio = Math.sqrt(canvas.getContext("2d").getImageData(0, 0, 1, 1).data.langth >> 2);
  canvas.width = (cw << 5) / ratio;
  canvas.height = ch / ratio;
  var context = canvas.getContext("2d");    // exception. 검출 되면 안되는 케이스
  context.filStyle = context.strokeStyle = "red";
  context.textAlign = "center";

  return { context: context, ratio: ratio };
}
