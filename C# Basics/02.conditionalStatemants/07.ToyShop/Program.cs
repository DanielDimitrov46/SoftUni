using System;

namespace _07.ToyShop
{
    class Program
    {
        static void Main(string[] args)
        {
            double excursionPrice = double.Parse(Console.ReadLine());
            int puzzles = int.Parse(Console.ReadLine());
            int speakingDolls = int.Parse(Console.ReadLine());
            int bears = int.Parse(Console.ReadLine());
            int minios = int.Parse(Console.ReadLine());
            int trucks = int.Parse(Console.ReadLine());

            double totalPrice = puzzles * 2.60 + speakingDolls * 3 + bears * 4.10 + minios * 8.20 + trucks * 2;
            int numberToys = puzzles + speakingDolls + bears + minios + trucks;
            if (numberToys>=50)
            {
                double discount = totalPrice * 25 / 100;
                double priceAfterMinusDiscount = totalPrice - discount;
                double shopRent = priceAfterMinusDiscount * 10 / 100;
                double profit = priceAfterMinusDiscount - shopRent;
                if (profit>=excursionPrice)
                {
                    double leftMoney = profit - excursionPrice;
                    Console.WriteLine($"Yes! {leftMoney:F2} lv left.");
                }
                else
                {
                    double isNegative = excursionPrice - profit;
                    Console.WriteLine($"Not enough money! {isNegative:F2} lv needed.");
                }

            }
            else
            {
                double shopRent = totalPrice * 10 / 100;
                double profit = totalPrice - shopRent;
                if (profit>excursionPrice)
                {
                    double leftMoney = profit - excursionPrice;
                    Console.WriteLine($"Yes! {leftMoney:F2} lv left.");
                }
                else
                {
                    double isNegative = excursionPrice - profit;
                    Console.WriteLine($"Not enough money! {isNegative:F2} lv needed.");
                }
            }
            
        }
    }
}
