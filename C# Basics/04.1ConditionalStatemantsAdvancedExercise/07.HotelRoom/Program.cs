using System;

namespace _07.HotelRoom
{
    class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int nights = int.Parse(Console.ReadLine());

            double priceForStudio = 0;
            double priceForApartment = 0;


            switch (month)
            {
                case "May":
                case "October":
                    priceForStudio = 50;
                    priceForApartment = 65;
                    if (nights > 14)
                    {
                        priceForStudio = priceForStudio * 0.70;
                    }
                    else if (nights>7)
                    {
                        priceForStudio = priceForStudio * 0.95;
                    }
                    break;
                case "June":
                case "September":
                    priceForStudio = 75.20;
                    priceForApartment = 68.70;
                    if (nights>14)
                    {
                        priceForStudio = priceForStudio * 0.80;
                    }
                    break;
                case "July":
                case "August":
                    priceForStudio = 76;
                    priceForApartment = 77;
                    break;
            }
            if (nights>14)
            {
                priceForApartment = priceForApartment * 0.90;
            }
            double totalPriceApp = nights * priceForApartment;
            double totalPriceStu = nights * priceForStudio;
            Console.WriteLine($"Apartment: {totalPriceApp:F2} lv.");
            Console.WriteLine($"Studio: {totalPriceStu:F2} lv.");

        }
    }
}
