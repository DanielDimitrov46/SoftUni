using System;

namespace _04.VegetableMarket
{
    class Program
    {
        static void Main(string[] args)
        {
            double priceVegetables = double.Parse(Console.ReadLine());
            double priceFruits = double.Parse(Console.ReadLine());
            double kgVegetables = double.Parse(Console.ReadLine());
            double kgFruits = double.Parse(Console.ReadLine());

            // izchisleniq
            double totalVegetables = priceVegetables * kgVegetables; ;
            double totalFruits = priceFruits * kgFruits;

            //Total
            double everything =totalFruits + totalVegetables ;
            double convert = everything / 1.94;

            Console.WriteLine($"{convert:F2}");
        }
    }
}
