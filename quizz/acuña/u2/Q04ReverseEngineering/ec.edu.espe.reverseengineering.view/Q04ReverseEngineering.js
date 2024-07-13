import A from "./ec.edu.espe.reverseengineering.model/A.js";
import B from "./ec.edu.espe.reverseengineering.model/B.js";
import C from "./ec.edu.espe.reverseengineering.model/C.js";
import E from "./ec.edu.espe.reverseengineering.model/E.js";

function Q04ReverseEngineering() {
    let e = new E();
    let c = new C();
    e.m2(c);

    let a = new A();
    let b1 = new B();
    let b2 = new B();
    a.m1(b1, b2);

}

Q04ReverseEngineering();