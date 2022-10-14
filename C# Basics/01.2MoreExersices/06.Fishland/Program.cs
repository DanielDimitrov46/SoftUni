using System;

namespace _06.Fishland
{
    class Program
    {
        static void Main(string[] args)
        {
            //enter
            double priceMackerel = double.Parse(Console.ReadLine());
            double priceFish2 = double.Parse(Console.ReadLine());

            double kgBonito = double.Parse(Console.ReadLine());
            double kgSafrid = double.Parse(Console.ReadLine());
            double kgMussels = double.Parse(Console.ReadLine());

            //izchisleniq
            double priceBonito = priceMackerel*(1+0.60);
            double priceSafrid = priceFish2*(1+0.80);
            double priceMussels = kgMussels * 7.50;

            double sumBonito = kgBonito * priceBonito;
            double sumSafrid = kgSafrid * priceSafrid;

            double totalSum = sumBonito + sumSafrid + priceMussels;

                Console.WriteLine($"{totalSum:F2}");
        }
    }
}
