using System;
using System.Linq;
using System.Text;

namespace CodeWars
{
    class PigIt
    {
        public static string ConvertToPigLatin(string str)
        {
            var words = str.Split(' ');
            var processedText = new StringBuilder();

            foreach (var word in words)
            {
                var characters = word.ToList();
                characters.Add(characters.ElementAt(0));
                var newWord = String.Join("", characters.ToArray());

                processedText.Append($"{newWord.Remove(0, 1)}ay " );
            }

            return processedText.ToString().Trim();
        }
    }
}