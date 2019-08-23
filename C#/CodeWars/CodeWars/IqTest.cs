using System;
using System.Linq;

namespace CodeWars
{
    class IqTest
    {
        public static int Test(string numbers)
        {
            int[] numbersAsArray = numbers.Split(' ').Select(x => Convert.ToInt32(x)).ToArray();

            var oddAndEvenCountDictionary = numbersAsArray
                .GroupBy(CodeWarsUtilities.GetOdd)
                .ToDictionary(group => @group.Key.ToString().ToLower(), group => @group.Count());

            oddAndEvenCountDictionary.TryGetValue("false", out var oddCount);

            return oddCount > 1
                ? Array.FindIndex(numbersAsArray, CodeWarsUtilities.GetOdd) + 1
                : Array.FindIndex(numbersAsArray, x => !CodeWarsUtilities.GetOdd(x)) + 1;
        }
    }
}