using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace CodeWars
{
    class Program
    {
        private Dictionary<string, int> _oddAndEvenCountDictionary = new Dictionary<string, int>();

        static void Main(string[] args)
        {
            var x = Test("2 4 7 8 10");
        }


        public static int Test(string numbers)
        {
            int[] numbersAsArray = numbers.Split(' ').Select(x => Convert.ToInt32(x)).ToArray();

            var oddAndEvenCountDictionary = numbersAsArray
                .GroupBy(GetOdd)
                .ToDictionary(group => group.Key.ToString().ToLower(), group => group.Count());

            oddAndEvenCountDictionary.TryGetValue("false", out var oddCount);

            return oddCount > 1
                ? Array.FindIndex(numbersAsArray, GetOdd) + 1
                : Array.FindIndex(numbersAsArray, x => !GetOdd(x)) + 1;
        }


        static bool GetOdd(int number)
        {
            if (number % 2 != 0)
                return true;

            return false;
        }
    }
}