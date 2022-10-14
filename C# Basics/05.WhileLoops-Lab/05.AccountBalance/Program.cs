
using System;

namespace _05.AccountBalance
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            double totalSum = 0;

            while (input!="NoMoreMoney")
            {
                double deposit = double.Parse(input);
                if (deposit<0)
                {
                    Console.WriteLine("Invalid operation!");
                }
                else
                {

                totalSum += deposit;
                }
                Console.WriteLine($"Increase: {deposit}");
                Console.WriteLine($"Total: {totalSum}");
            }
        }
    }
}
