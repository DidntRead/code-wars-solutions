/**
 * Created by ashley.morris on 27/04/2018.
 */

function LevelSix() { }

LevelSix.prototype.toCamelCase = function(str){
    return str.replace(/[-|_][\w]/g, (i) =>{ return i.charAt(1).toUpperCase() })
};

LevelSix.prototype.alphabetWar = function(reinforces, airstrikes){

    console.log(`The battlefield  is     : "${reinforces[0]}"`);
    console.log(`The 1st airstrike       : "${airstrikes[0]}"`);

    for(let airStrike = 0; airStrike <= airstrikes.length(); airstrikes++){

        for(let i = 0; i <= airstrike.length(); i++){
            if(airStrike.charAt(i) === "*"){
                reinforces[0].charAt(i).replace("_");
                reinforces[0].charAt(i+1).replace("_");
                reinforces[0].charAt(i-1).replace("_");
            }
        }
        console.log(`After first airstrike  : "${reinforces[0]}`)
    }




};


module.exports = LevelSix;