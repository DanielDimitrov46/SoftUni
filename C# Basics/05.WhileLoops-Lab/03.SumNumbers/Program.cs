

using System;

namespace _03.SumNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum = int.Parse(Console.ReadLine());
            int sum1 = 0;
            while (true)
            {
                int number = int.Parse(Console.ReadLine());
                sum1 += number;
                if (sum1>=sum)
                {
                    Console.WriteLine(sum1);
                    break;
                }
            }
        }
    }
}
