/**
 * Created by ashley.morris on 27/04/2018.
 */

let test = require('tape');
let sinon = require('sinon');

let LevelSix = require("../level6/levelSix");
let Sudoku = require('../level3/sudokuSolver');

let levelSix = new LevelSix();

test('toCamelCase', function (t) {
   t.equal(levelSix.toCamelCase(""), "", "handles empty strings" );
   t.equal(levelSix.toCamelCase("the_stealth_warrior"), "theStealthWarrior", "the_stealth_warrior" );
   t.equal(levelSix.toCamelCase("The-Stealth-Warrior"), "TheStealthWarrior", "the_stealth_warrior" );
   t.equal(levelSix.toCamelCase("A-B-C"), "ABC", "the_stealth_warrior" );
   t.end();
});

test('alphabetWars', function (t) {
   let reinforces =
       [   "g964xxxxxxxx",
           "myjinxin2015",
           "steffenvogel",
           "smile67xxxxx",
           "giacomosorbi",
           "freywarxxxxx",
           "bkaesxxxxxxx",
           "vadimbxxxxxx",
           "zozofouchtra",
           "colbydauphxx" ];

   let airstrikes =
       [   "* *** ** ***",
           " ** * * * **",
           " * *** * ***",
           " **  * * ** ",
           "* ** *   ***",
           "***   ",
           "**",
           "*",
           "*" ];

   t.equals(levelSix.alphabetWar(reinforces, airstrikes), 'codewarsxxxx','Top 50 massacre failure');
   t.equals(levelSix.alphabetWar(["abcdefg","hijklmn"], ["   *   ", "*  *   "]),'hi___fg');
   t.equals(levelSix.alphabetWar(["aaaaa","bbbbb", "ccccc", "ddddd"],  ["*", " *", "   "]),'ccbaa');
   t.end();
});

test('deleteNth', function (t) {
  t.equal(levelSix.deleteNth([20,37,20,21], 1).toString(), [20,37,21].toString(), "passes");
  t.end();
});

test('Sudoku', function(t) {

    let sudoku = new Sudoku();
    var puzzle = [
        [5,3,0,0,7,0,0,0,0],
        [6,0,0,1,9,5,0,0,0],
        [0,9,8,0,0,0,0,6,0],
        [8,0,0,0,6,0,0,0,3],
        [4,0,0,8,0,3,0,0,1],
        [7,0,0,0,2,0,0,0,6],
        [0,6,0,0,0,0,2,8,0],
        [0,0,0,4,1,9,0,0,5],
        [0,0,0,0,8,0,0,7,9]];

    var solution = [
        [5,3,4,6,7,8,9,1,2],
        [6,7,2,1,9,5,3,4,8],
        [1,9,8,3,4,2,5,6,7],
        [8,5,9,7,6,1,4,2,3],
        [4,2,6,8,5,3,7,9,1],
        [7,1,3,9,2,4,8,5,6],
        [9,6,1,5,3,7,2,8,4],
        [2,8,7,4,1,9,6,3,5],
        [3,4,5,2,8,6,1,7,9]];

    t.equal(sudoku.solve(puzzle).toString(), solution.toString(), "puzzle solved");
    t.end();
});

test('number2words', function(t) {

});