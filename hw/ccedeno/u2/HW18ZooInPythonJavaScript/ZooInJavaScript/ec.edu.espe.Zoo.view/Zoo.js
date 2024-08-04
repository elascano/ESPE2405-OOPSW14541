const Cage = require('../ec.edu.espe.Zoo.model/Cage');
const Food = require('../ec.edu.espe.Zoo.model/Food');
const Lion = require('../ec.edu.espe.Zoo.model/Lion');
const Monkey = require('../ec.edu.espe.Zoo.model/Monkey');
const Shark = require('../ec.edu.espe.Zoo.model/Shark');
class Zoo {
  static main() {
    console.log("Andre's Zoo");
    const cageFelines = new Cage(1, 'FelinesCage');
    const cageMonkeys = new Cage(2, 'MonkeysCage');
    const cageBirds = new Cage(3, 'BirdsCage');
    const pool = new Cage(4, 'Pool for Shark');
    const food = new Food(1, 'Fish');
    const animals = [];

    const lion = new Lion(true, 1, 'Lion Alex', '2024-10-10', 'F', 0, cageFelines);
    lion.register(cageFelines);
    animals.push(lion);
    lion.feed(2);
    lion.feedWithFood(3, food);
    console.log(`Lion --> ${lion}`);

    let animal;

    animal = new Monkey(2, 'Monkey', '2024-05-03', 'F', 0, cageMonkeys);
    animal.feed(5);
    animals.push(animal);
    console.log(`Animal (monkey) --> ${animal}`);

    animal = new Lion(false, 2, 'Lion Alexa', '2024-05-03', 'F', 0, cageFelines);
    animal.feed(4);
    animals.push(animal);
    console.log(`Animal (lion) --> ${animal}`);

    const shark = new Shark(1, 'Dad Shark', '2024-06-07', 'F', 0, pool);
    shark.feed(6);
    animals.push(shark);
    console.log(`Animal (shark) --> ${shark}`);

    console.log("Animals in Andre's Zoo --> \n " + animals);

    for (const an1 of animals) {
      console.log(an1);
    }
  }
}

Zoo.main();
