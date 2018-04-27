/**
 * Created by ashley.morris on 15/05/2017.
 */

const bySix = require("./isDivisibleBy6");
const toCamel = require("./levelSix");

console.log(bySix.isDivisibleBy6("1234567890123456789012345678*0"));
console.log(toCamel.toCamelCase("the-stealth-warrior"));
console.log(toCamel.toCamelCase("The-Stealth-Warrior"));