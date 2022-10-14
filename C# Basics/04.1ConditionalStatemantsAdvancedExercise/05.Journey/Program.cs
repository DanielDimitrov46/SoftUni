
using System;

namespace _05.Journey
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            double totalPrice = 0;
            string type = "";
            string destination = "";

            if (budget<=100)
            {
                if (season=="summer")
                {
                    destination = "Bulgaria";
                    type = "Camp";
                    totalPrice = budget * 0.70;
                }
                else
                {
                    destination = "Bulgaria";
                    type = "Hotel";
                    totalPrice = budget * 0.30;
                }
            }
            else if (budget<=1000)
            {
                if (season == "summer")
                {
                    destination = "Balkans";
                    type = "Camp";
                    totalPrice = budget * 0.60;
                }
                else
                {
                    destination = "Balkans";
                    type = "Hotel";
                    totalPrice = budget * 0.20;
                }
            }
            else
            {
                destination = "Europe";
                type = "Hotel";
                totalPrice = budget * 0.10;
            }

            Console.WriteLine($"Somewhere in {destination}");
            Console.WriteLine($"{type} - {(budget-totalPrice):F2}");
        }
    }
}
