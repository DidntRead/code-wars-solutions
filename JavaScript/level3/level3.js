/**
 * Created by ashley.morris on 22/05/2018.
 */
/**
 * Created by ashley.morris on 27/04/2018.
 */

function LevelThree() {
}

/**
 * Uses a simple console.log to print the current state of the puzzle
 * @param puzzle
 */
let printGrid = function (puzzle) {
    console.log(puzzle);
};

/**
 * Indicated whether the supplied number is in the current Sudoku row
 * @param row the row to check
 * @param num the number to check for
 * @returns {boolean} indicating whether the number has been found
 */
let numberInRow = function (row, num) {
    return row.indexOf(num) > -1;
};

/**
 * Indicated whether the supplied number is in the current Sudoku column
 * @param puzzle the Sudoku board to check
 * @param col the col to check
 * @param num the number to check for
 * @returns {boolean} indicating whether the number has been found
 */
let numberInCol = function (puzzle, col, num) {
    for(let row = 0; row < puzzle.length; row++){
        if(puzzle[row][col] === num){
            return true;
        }
    }
    return false;
};

let numberInBox = function(puzzle, startRow, startCol, num){
    for (let row = 0; row < 3; row ++ ){
        for (let col = 0; col < 3; col ++){
            if()
        }
    }
}


LevelThree.prototype.sudoku = function (puzzle) {

    printGrid(puzzle);


    return puzzle;
};


module.exports = LevelThree;