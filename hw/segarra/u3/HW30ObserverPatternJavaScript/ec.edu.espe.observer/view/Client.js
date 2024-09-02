const ibm = new IBM(120);

const investor1 = new ConcreteInvestor("John Doe");
const investor2 = new ConcreteInvestor("Jane Smith");

ibm.addObserver(investor1);
ibm.addObserver(investor2);

ibm.setPrice(125);
ibm.setPrice(130);

ibm.deleteObserver(investor1);

ibm.setPrice(135);
