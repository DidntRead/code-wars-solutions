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

            let first = name.charAt(0).toUpperCase();

            name = name
                .replace(/(?!^[h|w])[hw]/gi, "-")
                .replace(/[^aeiouy]/gi, (i) => {
                    return replace(i);
                })
                .split("")
                .filter(function (item, pos, self) {
                    return self[pos + 1] !== item;
                })
                .join("")
                .replace(/(?!^[aeiouy])[aeiouy]/gi, (i) => {
                    i = "-";
                    return replace(i);
                });

            name = name.substring(1, 4);

            while (name.length < 3) {
                name += "0"
            }

            return first + name;

        }).join(" ");
    }
};

//add two integers without + or -
LevelFive.prototype.add = function (x, y) {

    if (x === 0) return y;
    if (y === 0 ) return x;

    //bitwise or is enough for some operations
    //e.g. 8 + 5 but 9 + 5 will do 7 + 5 with
    //2 remaining so the remainder needs to be added
    while (y !== 0){

        //use bitwise and to get remainder
        let remain = x & y;
        x = x ^ y;
        y = remain << 1; // bit shift the remainder
    }

    return x;
};

module.exports = LevelFive;