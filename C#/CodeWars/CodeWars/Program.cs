using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace CodeWars
{
    class Program
    {
        static void Main(string[] args)
        {
            int position = Test("2 4 7 8 10");
            string alphabetPos = AlphabetPosition("The sunset sets at twelve o' clock.");
        }


        public static int Test(string numbers)
        {
            int[] numbersAsArray = numbers.Split(' ').Select(x => Convert.ToInt32(x)).ToArray();

            var oddAndEvenCountDictionary = numbersAsArray
                .GroupBy(CodeWarsUtilities.GetOdd)
                .ToDictionary(group => group.Key.ToString().ToLower(), group => group.Count());

            oddAndEvenCountDictionary.TryGetValue("false", out var oddCount);

            return oddCount > 1
                ? Array.FindIndex(numbersAsArray, CodeWarsUtilities.GetOdd) + 1
                : Array.FindIndex(numbersAsArray, x => !CodeWarsUtilities.GetOdd(x)) + 1;
        }


        public static string AlphabetPosition(string text)
        {
            text = Regex.Replace(text, "[^a-zA-Z0-9% ._]", string.Empty);

            var processedText = new StringBuilder();
            var alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".Split(',').ToArray();
            var alphabetWithPos = new Dictionary<string, int>();
            for (int i = 0; i < alphabet.Length; i++)
            {
                alphabetWithPos[alphabet[i]] = i + 1;
            }

            for (int i = 0; i < text.Length; i++)
            {
                alphabetWithPos.TryGetValue(text[i].ToString().ToLower(), out var value);
                if (value != 0)
                    processedText.Append($"{value} ");
            }


            return processedText.ToString();
        }
    }
}