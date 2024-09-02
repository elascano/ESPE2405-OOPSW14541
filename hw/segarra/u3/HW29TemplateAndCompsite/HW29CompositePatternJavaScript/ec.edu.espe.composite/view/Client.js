const clerk1 = new Clerk();
const clerk2 = new Clerk();
const teller1 = new Teller();
const manager = new Manager();
const president = new President();

// Creating a composite supervisor
const supervisor = new Supervisor();
supervisor.add(clerk1);
supervisor.add(teller1);
supervisor.add(manager);

const topSupervisor = new Supervisor();
topSupervisor.add(supervisor);
topSupervisor.add(clerk2);
topSupervisor.add(president);

console.log(topSupervisor.stateName());
console.log(supervisor.stateNamesOfSubordinates());
console.log(topSupervisor.stateNamesOfSubordinates());
