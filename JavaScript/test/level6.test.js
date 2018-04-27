/**
 * Created by ashley.morris on 27/04/2018.
 */

let test = require('tape');
let sinon = require('sinon');

let LevelSix = require("../level6/levelSix");
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

    //t.equals(levelSix.alphabetWar(reinforces, airstrikes), 'codewarsxxxx','Top 50 massacre failure');
    t.equals(levelSix.alphabetWar(["abcdefg","hijklmn"], ["   *   ", "*  *   "]),'hi___fg');
    //t.equals(levelSix.alphabetWar(["aaaaa","bbbbb", "ccccc", "ddddd"],  ["*", " *", "   "]),'ccbaa');
    t.end();
});
