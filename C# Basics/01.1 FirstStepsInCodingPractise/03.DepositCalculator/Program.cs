using System;

namespace _03.DepositCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            double depositsum = double.Parse(Console.ReadLine());
            int depositmonths = int.Parse(Console.ReadLine());
            double yearPercent = double.Parse(Console.ReadLine());
            double rYearPercent = yearPercent / 100;
            double totalInterest = depositsum * rYearPercent;


            double interestForMonth = totalInterest / 12;
            double totalSum = depositsum + (depositmonths * interestForMonth);
            Console.WriteLine(totalSum);
            
        }
    }
}
