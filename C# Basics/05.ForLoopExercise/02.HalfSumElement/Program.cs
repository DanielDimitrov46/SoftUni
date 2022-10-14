using System;

namespace _02.HalfSumElement
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int maxNum = int.MinValue;
            int sum = 0;


            for (int i = 0; i < n; i++)
            {
                int currentNum = int.Parse(Console.ReadLine());
                sum += currentNum;
                if (currentNum>maxNum)
                {
                    maxNum = currentNum;
                }

            }

            sum -= maxNum;

            if (sum==maxNum)
            {
                Console.WriteLine("Yes");
                Console.WriteLine($"Sum = {maxNum}");
            }
            else
            {
                Console.WriteLine("No");
                Console.WriteLine($"Diff = {Math.Abs(sum-maxNum)}");
            }

        }
    }
}
