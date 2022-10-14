using System;

namespace _04.MetricConverter
{
    class Program
    {
        static void Main(string[] args)
        {
            double num = double.Parse(Console.ReadLine());
            string inputMetric = Console.ReadLine();
            string outputMetric = Console.ReadLine();

            if (inputMetric == "mm")
            {
                num = num / 1000;
            }
            else if (inputMetric == "cm")
            {
                num = num / 100;
            }


            if (outputMetric == "mm")
            {
                num = num * 1000;
            }
            else if (outputMetric == "cm")
            {
                num = num * 100;
            }
            Console.WriteLine($"{num:F3}");

        }
    }
}
