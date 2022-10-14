using System;

namespace Demos
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = "SoftUni";
            int textLenght = text.Length;
            Console.WriteLine(text[7]);

            for (int i = 0; i < text.Length ; i++)
            {
                char symbol = text[i];
                Console.WriteLine(symbol);
            }
        }
    }
}
