
using System;

namespace _03.OddEvenPosition
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = double.Parse(Console.ReadLine());
            double evenSum = 0;
            double minEven = double.MaxValue;
            double maxEven = double.MinValue;
            double oddSum = 0;
            double minOdd = double.MaxValue;
            double maxOdd = double.MinValue;


            for (int i = 1; i <= n; i++)
            {
                double num = double.Parse(Console.ReadLine());

                if (i % 2 == 0)
                {
                    evenSum += num;
                    if (num < minEven)
                    {
                        minEven = num;
                    }
                    if (num > maxEven)
                    {
                        maxEven = num;
                    }
                }
                else
                {
                    oddSum += num;
                    if (num<minOdd)
                    {
                        minOdd = num;
                    }
                    if (num>maxOdd)
                    {
                        maxOdd = num;
                    }
                }
            }
            Console.WriteLine($"OddSum={oddSum:f2},");
            if (n<1)
            {
                Console.WriteLine("OddMin=No,");
                Console.WriteLine("OddMax=No,");
            }
            else
            {

            Console.WriteLine($"OddMin={minOdd:f2},");
            Console.WriteLine($"OddMax={maxOdd:f2},");
            }
            Console.WriteLine($"EvenSum={evenSum:f2},");
            if (n<2)
            {
                Console.WriteLine("EvenMin=No,");
                Console.WriteLine("EvenMax=No");
            }
            else
            {
            Console.WriteLine($"EvenMin={minEven:f2},");
            Console.WriteLine($"EvenMax={maxEven:F2}");

            }

        }
    }
}
