using System;

namespace _04.Histogram
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double firstRange = 0;
            double secondRange = 0;
            double thirdRange = 0;
            double fourthRange = 0;
            double fifthRange = 0;

            for (int i = 0; i < n; i++)
            {
                int number = int.Parse(Console.ReadLine());

                if (number < 200)
                {
                    firstRange++;
                }
                else if (number >= 200 && number <= 399)
                {
                    secondRange++;
                }
                else if (number >= 400 && number <= 599)
                {
                    thirdRange++;
                }
                else if (number >= 600 && number <= 799)
                {
                    fourthRange++;
                }
                else
                {
                    fifthRange++;
                }
            }
            double p1 = firstRange / n * 100;
            double p2 = secondRange / n * 100;
            double p3 = thirdRange / n * 100;
            double p4 = fourthRange / n * 100;
            double p5 = fifthRange / n * 100;

            Console.WriteLine($"{p1:f2}%");
            Console.WriteLine($"{p2:f2}%");
            Console.WriteLine($"{p3:f2}%");
            Console.WriteLine($"{p4:f2}%");
            Console.WriteLine($"{p5:f2}%");

        }
    }
}
