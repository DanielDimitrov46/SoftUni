
using System;

namespace _05.DivideWithoutRemainder
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = int.Parse(Console.ReadLine());
            double nums2WithoutRemainder = 0;
            double nums3WithoutRemainder = 0;
            double nums4WithoutRemainder = 0;

            for (int i = 0; i < n; i++)
            {
                int numbers = int.Parse(Console.ReadLine());
                if (numbers % 2 == 0)
                {
                    nums2WithoutRemainder++;

                }
                if (numbers%3==0)
                {
                    nums3WithoutRemainder++;
                }
                if (numbers%4==0)
                {
                    nums4WithoutRemainder++;
                }

            }
            double p1 = nums2WithoutRemainder / n * 100;
            double p2 = nums3WithoutRemainder / n * 100;
            double p3 = nums4WithoutRemainder / n * 100;

            Console.WriteLine($"{p1:F2}%");
            Console.WriteLine($"{p2:F2}%");
            Console.WriteLine($"{p3:F2}%");
        }
    }
}
