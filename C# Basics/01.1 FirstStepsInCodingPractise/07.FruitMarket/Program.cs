using System;

namespace _07.FruitMarket
{
    class Program
    {
        static void Main(string[] args)
        {
            double priceStrawberries = double.Parse(Console.ReadLine());
            double kgBananas = double.Parse(Console.ReadLine());
            double kgOranges = double.Parse(Console.ReadLine());
            double kgRasberry = double.Parse(Console.ReadLine());
            double kgStrawberries = double.Parse(Console.ReadLine());

            //qgodi
            double sumStrawberries = kgStrawberries * priceStrawberries;
            //malini
            double priceRasberries = priceStrawberries / 2;
            double sumRasberries = kgRasberry * priceRasberries;
            //portokali
            double priceOranges = priceRasberries*(1 - 0.4);
            double sumOranges = kgOranges * priceOranges;
            //banani
            double priceBananas = priceRasberries * (1 - 0.8);
            double sumBananas = kgBananas * priceBananas;

            //total
            double totalSum = sumStrawberries + sumRasberries + sumOranges + sumBananas;
            Console.WriteLine($"{totalSum:F2}");
        }
            
    }  
}
