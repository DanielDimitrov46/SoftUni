using System;

namespace _08.NumberSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int minValue = int.MaxValue;
            int maxValue = int.MinValue;


            for (int i = 1; i <= n; i++)
            {
                int num = int.Parse(Console.ReadLine());
                if (num > maxValue)
                {
                    maxValue = num;
                }

                if (num < minValue)
                {
                    minValue = num;
                }

            }
            Console.WriteLine($"Max number: {maxValue}");
            Console.WriteLine($"Min number: {minValue}");
        }
    }
}
