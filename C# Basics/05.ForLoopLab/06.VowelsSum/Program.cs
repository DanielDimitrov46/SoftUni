using System;

namespace _06.VowelsSum
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int vowel = 0;


            for (int i = 0; i <input.Length ; i++)
            {
                char letter = input[i];
                switch (letter)
                {
                    case 'a':
                        vowel+=1;
                        break;
                    case 'e':
                        vowel+=2;
                        break;
                    case 'i':
                        vowel+=3;
                        break;
                    case 'o':
                        vowel+=4;
                        break;
                    case 'u':
                        vowel+=5;
                        break;
                }
            }
            Console.WriteLine(vowel);
        }
    }
}
