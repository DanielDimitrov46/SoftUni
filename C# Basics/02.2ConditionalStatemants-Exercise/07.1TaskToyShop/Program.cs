using System;

namespace _07._1TaskToyShop
{
    class Program
    {
        static void Main(string[] args)
        {
            double holidayPrice = double.Parse(Console.ReadLine());
            int puzzles = int.Parse(Console.ReadLine());
            int dolls = int.Parse(Console.ReadLine());
            int bears = int.Parse(Console.ReadLine());
            int minions = int.Parse(Console.ReadLine());
            int trucks = int.Parse(Console.ReadLine());

            //Calculate
            double totalPrice = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
            int numOfToys = puzzles + dolls + bears + minions + trucks;

            //discount
            if (numOfToys >= 50)
            {
                totalPrice = totalPrice - 0.25 * totalPrice;

            }
            totalPrice -= totalPrice * 0.10;

            if (totalPrice >= holidayPrice)
            {
                Console.WriteLine($"Yes! {totalPrice-holidayPrice:F2} lv left.");
            }
            else
            {
                Console.WriteLine($"Not enough money! {holidayPrice-totalPrice:F2} lv needed.");
            }
        }
    }
}
