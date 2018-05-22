/**
 * Created by ashley.morris on 27/04/2018.
 */

function LevelSix() {
}

LevelSix.prototype.toCamelCase = function (str) {
    return str.replace(/[-|_][\w]/g, (i) => {
        return i.charAt(1).toUpperCase()
    })
};

//Not my solution
LevelSix.prototype.alphabetWar = function (reinforces, airstrikes) {

    let len = reinforces[0].length
    let counts = new Array(len).fill(0);

    for (let strike of airstrikes) {

        strike = strike + ' ';
        strike = strike.replace(/.?\*+.?/g,
            m => '.'.repeat(m.length));


        for (let i = 0; i < len && i < strike.length; i++){
            if (strike[i] === '.') {
                counts[i]++;
            }
        }

    }

    return counts
        .map((n, i) => n < reinforces.length ? reinforces[n][i] : '_')
        .join('');
};


function count(arr, value){
    //create a new array where x == value to find
    //return the length for the count
    return arr.filter( x => x === value).length;
}

function getNthIndex(arr, val, count){
    //finds all indexs of the value in the original array,
    //then returns only the elements that are greater than the count
    let idx = arr.indexOf(val);
    let indices = [];

    while (idx !== -1){
        indices.push(idx);
        idx = arr.indexOf(val, idx + 1)
    }

    return indices.splice(count, indices.length);
}


LevelSix.prototype.deleteNth = function (arr,n){

    arr.forEach((element) => {

        let c = count(arr, element);
        if (c > n){
            getNthIndex(arr, element, n).forEach((i) => {
                arr[i] = null;
            });
        }
    });

    return arr.filter(x => x !== null)
};



//Best deleteNth solution on codewars
//LevelSix.prototype.deleteNth = function(arr,x) {
//    var cache = {};
//    return arr.filter(function(n) {
//        console.log(cache);
//        cache[n] = (cache[n]||0) + 1;
//        return cache[n] <= x;
//    });
//};

module.exports = LevelSix;