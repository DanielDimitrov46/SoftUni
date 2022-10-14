
using System;

namespace _06.MaxNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int maxValue = int.MinValue;
            int minValue = int.MaxValue;
            while (input!="Stop")
            {
                int number = int.Parse(input);
                if (number>maxValue)
                {
                    maxValue = number;
                }
                else if (number < minValue)
                {
                    minValue = number;
                }

                input = Console.ReadLine();
            }
            Console.WriteLine(maxValue);

        }
    }
}
