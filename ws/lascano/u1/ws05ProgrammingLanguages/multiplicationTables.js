let i = 9;

for (let a = 0; a <= i; a++) {

    let line = "";
    line += a + "  "
    for (let b = 1; b <= i; b++) {
        let multiply = a*b
        if (multiply == 0) {
            line += " "+b + " "
        } else if (multiply < 10) {
            line += "0"+multiply + " "
        } else {
            line += a*b + " "
        }
    }
    console.log(line)
}

