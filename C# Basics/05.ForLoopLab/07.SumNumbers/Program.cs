using System;

namespace _07.SumNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int numberOfNumbers = int.Parse(Console.ReadLine());
            int sum = 0;
            

            for (int i = 0; i < numberOfNumbers; i++)
            {
                int nums = int.Parse(Console.ReadLine());
                sum += nums;
            }
            

            Console.WriteLine(sum);
        }
    }
}
