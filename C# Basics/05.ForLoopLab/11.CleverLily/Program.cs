
using System;

namespace _11.CleverLily
{
    class Program
    {
        static void Main(string[] args)
        {
            int age = int.Parse(Console.ReadLine());
            double priceWasher = double.Parse(Console.ReadLine());
            double sellPriceToys = double.Parse(Console.ReadLine());
            double savedMoney = 0;
            int toys = 0;


            for (int birthdayNumber = 1; birthdayNumber <= age; birthdayNumber++)
            {
                if (birthdayNumber % 2 == 0)
                {
                    savedMoney += ((birthdayNumber / 2) * 10) - 1;
                    // 2 -> 2/2 -> 1 * 10 = 10
                    // 4 -> 4/2 -> 2 * 10 = 20
                    // 6 -> 6/2 -> 3 * 10 = 30
                }
                else
                {
                    toys ++;
                }
            }
            
            double total = savedMoney + (toys*sellPriceToys);
            
            if (total>=priceWasher)
            {
                Console.WriteLine($"Yes! {total-priceWasher:f2}");
            }
            else
            {
                Console.WriteLine($"No! {priceWasher-total:f2}");
            }

        }
    }
}
