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
    for (let row = 0; row < puzzle.length; row++) {
        if (puzzle[row][col] === num) {
            return true;
        }
    }
    return false;
};

/**
 * Indicated whether the supplied number is in the current Sudoku 3x3 grid
 * @param puzzle the Sudoku board to check
 * @param startRow the row to start from
 * @param startCol the column to start from
 * @param num the number to search for
 * @returns {boolean} indicating whether the number has been found
 */
let numberInBox = function (puzzle, startRow, startCol, num) {
    for (let row = 0; row < 3; row++) {
        for (let col = 0; col < 3; col++) {
            if (puzzle[row + startRow] [col + startCol] === num) {
                return true;
            }
        }
    }
    return false;
};

/**
 * Checks wheter it is legal to assign num to the given row, col and 3x3 grid
 * @param puzzle the sudoku puzzle to solve
 * @param row the row to check
 * @param col the col to check
 * @param num the number to check for
 * @returns {boolean} true if it's currently safe to place the number
 */
let isSafe = function (puzzle, row, col, num) {
    return !numberInRow(puzzle[row], num) &&
        !numberInCol(puzzle, col, num) &&
        !numberInBox(puzzle, row - row % 3, col - col % 3, num)
};

let getUnassignedLocation = function (puzzle) {
    for (let row = 0; row < 9; row++) {
        for (let col = 0; col < 9; col++) {
            if (puzzle[row][col] === 0) {
                return {row: row, col: col}
            }
        }
    }
    return false;
};
/**
 * Write a function that will solve a 9x9 Sudoku puzzle.
 * The function will take one argument consisting of the 2D puzzle array, with the value 0 representing an unknown square.
 * The Sudokus tested against your function will be "easy" (i.e. determinable; there will be no need to assume and test possibilities on unknowns)
 * and can be solved with a brute-force approach.
 * @param puzzle
 * @returns {*}
 */
LevelThree.prototype.sudoku = function (puzzle) {

    //if there are no unassigned locations then the puzzle is solved
    if (getUnassignedLocation(puzzle) === false) {
        return puzzle;
    }

    //Get an unassigned location on the board
    let location = getUnassignedLocation(puzzle);
    let row = location.row;
    let col = location.col;

    //Obviously trying numbers 1 - 9
    for (let num = 1; num <= 9; num++) {

        //Check if number is valid for the current unassigned location
        if (isSafe(puzzle, row, col, num)) {

            puzzle[row][col] = num;

            //Do the same thing again recursively
            if (this.sudoku(puzzle)) {
                return puzzle;
            }

            puzzle[row][col] = 0;

        }
    }

    return false;
};


module.exports = LevelThree;