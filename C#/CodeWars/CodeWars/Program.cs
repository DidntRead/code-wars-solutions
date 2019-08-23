using System;
using System.Linq;
using System.Text;

namespace CodeWars
{
    class Program
    {
        static void Main(string[] args)
        {
            int position = IqTest.Test("2 4 7 8 10");
            string alphabetPos = AlphabetPosition.GetAlphabetPositions("The sunset sets at twelve o' clock.");
            string pigIt = PigIt.ConvertToPigLatin("Pig latin is cool");
        }
    }
}