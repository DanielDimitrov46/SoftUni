using System;

namespace _04.FishingBoat
{
    class Program
    {
        static void Main(string[] args)
        {
            int budget = int.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            int fishers = int.Parse(Console.ReadLine());
            int priceForRent = 0;
            double discount = 0;


            switch (season)
            {
                case "Spring":
                    priceForRent = 3000;
                    if (fishers <= 6)
                    {
                        discount = 0.90;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.85;
                    }
                    else
                    {
                        discount = 0.75;
                    }
                    break;
                case "Summer":
                case "Autumn":
                    priceForRent = 4200;
                    if (fishers <= 6)
                    {
                        discount = 0.90;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.85;
                    }
                    else
                    {
                        discount = 0.75;
                    }
                    break;
                case "Winter":
                    priceForRent = 2600;
                    if (fishers <= 6)
                    {
                        discount = 0.90;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.85;
                    }
                    else
                    {
                        discount = 0.75;
                    }
                    break;
            }
            double totalPrice = priceForRent * discount;
            

            if (fishers % 2 == 0 && season!="Autumn")
            {
                totalPrice = totalPrice * 0.95;
                
            }

            if (totalPrice<=budget)
            {
                Console.WriteLine($"Yes! You have {(budget-totalPrice):F2} leva left.");
            }
            else
            {
                Console.WriteLine($"Not enough money! You need {(totalPrice-budget):F2} leva.");
            }
        }
    }
}
