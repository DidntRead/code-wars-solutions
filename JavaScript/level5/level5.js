/**
 * Created by ashley.morris on 22/05/2018.
 */
/**
 * Created by ashley.morris on 27/04/2018.
 */

function LevelFive() {
}

LevelFive.prototype.Soundex = function (name) {


    let replace = function (i) {
        switch (i) {
            case "b":
            case "f":
            case "p":
            case "v":
                return 1;
            case "d":
            case "t":
                return 3;
            case "m":
            case "n":
                return 5;
            case "l":
                return 4;
            case "r":
                return 6;
            case "-":
                return "";
            default:
                return 2;
        }
    };

    let soundex = function (name) {

        let names = name.split(" ");
        return names.map(name => {

            let first = name.charAt(0);

            name = name.substr(1, name.length)
                .replace(/[aeiouyhw]/gi, "-")
                .replace(/[^aeiouyhw]/gi, (i) => {
                    return replace(i);
                })
                .split("")
                .filter(function (item, pos, self) {
                    return self[pos + 1] !== item;
                })
                .join("");

            while(name.length < 3){
                name += "0"
            }

            return first + name;

        }).join(" ");
    }
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

module.exports = LevelFive;