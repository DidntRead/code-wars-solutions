using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace CodeWars
{
    class AlphabetPosition
    {
        public static string GetAlphabetPositions(string text)
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

            return processedText.ToString().Trim();
        }
    }
}