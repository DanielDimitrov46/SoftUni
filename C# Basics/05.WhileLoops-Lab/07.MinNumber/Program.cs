using System;

namespace _07.MinNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int maxValue = int.MinValue;
            int minValue = int.MaxValue;
            while (input != "Stop")
            {
                int number = int.Parse(input);
                if (number > maxValue)
                {
                    maxValue = number;
                }
                if (number < minValue)
                {
                    minValue = number;
                }

                input = Console.ReadLine();
            }
            Console.WriteLine(minValue);

        }
    }
}
