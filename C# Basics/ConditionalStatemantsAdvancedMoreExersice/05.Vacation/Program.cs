
using System;

namespace _05.Vacation
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            string place = "";
            string location = "";
            double priceForVacation = 0;


            if (budget <= 1000)
            {
                place = "Camp";
                if (season == "Summer")
                {
                    location = "Alaska";
                    priceForVacation = budget * 0.65;
                }
                else
                {
                    location = "Morocco";
                    priceForVacation = budget * 0.45;
                }
            }
            else if (budget > 1000 && budget <= 3000)
            {
                place = "Hut";
                if (season == "Summer")
                {
                    location = "Alaska";
                    priceForVacation = budget * 0.80;
                }
                else
                {
                    location = "Morocco";
                    priceForVacation = budget * 0.60;
                }
            }
            else
            {
                place = "Hotel";
                if (season == "Summer")
                {
                    location = "Alaska";
                    priceForVacation = budget * 0.90;
                }
                else
                {
                    location = "Morocco";
                    priceForVacation = budget * 0.90;
                }
            }
            Console.WriteLine($"{location} - {place} - {priceForVacation:F2}");

        }
    }
}
