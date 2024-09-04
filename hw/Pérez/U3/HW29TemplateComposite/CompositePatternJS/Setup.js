import { Teller } from './Teller.js';
import { Clerk } from './Clerk.js';
import { Manager } from './Manager.js';
import { President } from './President.js';
import { Client } from './Client.js';

const main = () => {
    const lonny = new Teller("Lonny");
    const cal = new Clerk("Cal");
    const able = new Manager("Able");
    able.add(lonny);
    able.add(cal);

    const juanita = new Teller("Juanita");
    const tina = new Teller("Tina");
    const thelma = new Teller("Thelma");
    const becky = new Manager("Becky");
    becky.add(juanita);
    becky.add(tina);
    becky.add(thelma);

    const pete = President.getPresident("Pete");
    pete.add(able);
    pete.add(becky);

    Client.employee = pete;
    Client.doClientTask();
};

main();
