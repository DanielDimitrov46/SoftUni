using System;

namespace _04.MetricConverter
{
    class Program
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            string input = Console.ReadLine();
            string output = Console.ReadLine();

            if (input=="mm")
            {
                number = number / 1000;
            }
            else if (input=="cm")
            {
                number = number / 100;
            }

            if (output=="mm")
            {
                number = number * 1000;
            }
            else if (output=="cm")
            {
                number = number * 100;
            }

            Console.WriteLine($"{number:F3}");

        }
    }
}
