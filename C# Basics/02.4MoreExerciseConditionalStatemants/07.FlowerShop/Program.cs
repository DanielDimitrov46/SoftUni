using System;

namespace _07.FlowerShop
{
    class Program
    {
        static void Main(string[] args)
        {
            //•	Брой магнолии – цяло число в интервала[0 … 50]
            //•	Брой зюмбюли – цяло число в интервала[0 … 50]
            //•	Брой рози – цяло число в интервала[0 … 50]
            //•	Брой кактуси – цяло число в интервала[0 … 50]
            //•	Цена на подаръка – реално число в интервала[0.00 … 500.00]

            int flower1 = int.Parse(Console.ReadLine());
            int flower2 = int.Parse(Console.ReadLine());
            int flower3 = int.Parse(Console.ReadLine());
            int flower4 = int.Parse(Console.ReadLine());
            double priceGift = double.Parse(Console.ReadLine());

            double priceFlower1 = flower1 * 3.25;
            double priceFlower2 = flower2 * 4;
            double priceFlower3 = flower3 * 3.50;
            double priceFlower4 = flower4 * 8;
            double totalProfit = priceFlower1 + priceFlower2 + priceFlower3 + priceFlower4;
            double afterTax = totalProfit - 0.05 * totalProfit;

            if (afterTax>=priceGift)
            {
                Console.WriteLine($"She is left with {Math.Floor(afterTax-priceGift)} leva.");
            }
            else
            {
                Console.WriteLine($"She will have to borrow {Math.Ceiling(priceGift-afterTax)} leva.");
            }
        }
    }
}
