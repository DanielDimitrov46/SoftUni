using System;

namespace _06.Godzillavs.Kong
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int statists = int.Parse(Console.ReadLine());
            double priceForStatistCloth = double.Parse(Console.ReadLine());

            double priceClothes = statists * priceForStatistCloth;
            double decor = budget * 0.10;
            double totalSum = decor + priceClothes;
            if (statists > 150)
            {
                priceClothes = priceClothes * (1 - 0.10);
                totalSum = decor + priceClothes;
            }


            if (decor + priceClothes > budget)
            {
                Console.WriteLine($"Not enough money!");
                Console.WriteLine($"Wingard needs {(totalSum) - budget:F2} leva more.");

            }
            else
            {
                Console.WriteLine($"Action!");
                Console.WriteLine($"Wingard starts filming with {budget - (totalSum):F2} leva left.");

            }

        }
    }
}
