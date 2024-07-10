import A from "../ec.edu.espe.ws01.model/A.js";
import B from "../ec.edu.espe.ws01.model/B.js";
import C from "../ec.edu.espe.ws01.model/C.js";
import E from "../ec.edu.espe.ws01.model/E.js";

function main() {
    let e = new E();
    let c = new C();
    e.m2(c);

    let a = new A();
    let b1 = new B();
    let b2 = new B();
    a.m1(b1, b2);

}

main();