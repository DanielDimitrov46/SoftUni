using System;

namespace _09.LeftAndRightSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int rightSum = 0;
            int leftSum = 0;


            for (int i = 0; i < n; i++)
            {
                int number = int.Parse(Console.ReadLine());
                leftSum += number;

            }
            for (int i = 0; i < n; i++)
            {
                int number2 = int.Parse(Console.ReadLine());
                rightSum += number2;
            }
            if (leftSum==rightSum)
            {
            Console.WriteLine($"Yes, sum = {leftSum}");

            }
            else
            {
                Console.WriteLine($"No, diff = {Math.Abs(leftSum-rightSum)} ");
            }
        }
    }
}
