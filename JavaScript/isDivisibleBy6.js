/**
 * Created by ashley.morris on 15/05/2017.
 */

function isDivisibleBy6(s) {
    let num, res = [];

    for (let i = 0; i < 10; i++)
        if (isDivisibleBy(num = s.replace('*', i), 11)) {
            res.push(num);
        }

    return res;
}

//Pisano period https://en.wikipedia.org/wiki/Pisano_period
function isDivisibleBy(s, d) {
    let remainder = 0;

    for (let char of s) {
        remainder = +(remainder + char) % d;
    }


    return !remainder;
}

module.exports.isDivisibleBy6 = isDivisibleBy6;