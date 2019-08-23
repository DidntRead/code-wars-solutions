using System.Linq;
using System.Text;

namespace CodeWars
{
    class SpinWords
    {
        public static string ReverseWordsOverFiveCharacters(string str)
        {
            var words = str.Split(' ');
            var processedText = new StringBuilder();

            foreach (var word in words)
            {
                char[] newWord = word.ToCharArray();

                if (word.Length >= 5)
                {
                    newWord = word.Reverse().ToArray();
                }

                processedText.Append($"{new string(newWord)} ");
            }

            return processedText.ToString().Trim();
        }
    }
}