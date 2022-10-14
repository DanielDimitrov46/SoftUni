using System;

namespace _12.TradeCommissions
{
    class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            string appartmentType = Console.ReadLine();
            string raiting = Console.ReadLine();
            int nightsStayed = days - 1;

            double finalPayment = 0;

            if (appartmentType == "room for one person")
            {
                finalPayment = nightsStayed * 18.0;
            }
            else if (appartmentType == "apartment")
            {
                if (days < 10)
                {
                    double priceWithoutDiscount = nightsStayed * 25.0;
                    double discount = priceWithoutDiscount * 0.30;
                    finalPayment = priceWithoutDiscount - discount;
                }
                else if (days >= 10 && days <= 15)
                {
                    double priceWithoutDiscount = nightsStayed * 25.0;
                    double discount = priceWithoutDiscount * 0.35;
                    finalPayment = priceWithoutDiscount - discount;
                }
                else if (days > 15)
                {
                    double priceWithoutDiscount = nightsStayed * 25.0;
                    double discount = priceWithoutDiscount * 0.50;
                    finalPayment = priceWithoutDiscount - discount;
                }
            }
            else if (appartmentType == "president apartment")
            {
                if (days < 10)
                {
                    double priceWithoutDiscount = nightsStayed * 35;
                    double discount = priceWithoutDiscount * 0.10;
                    finalPayment = priceWithoutDiscount - discount;
                }
                else if (days >= 10 && days <= 15)
                {
                    double priceWithoutDiscount = nightsStayed * 35.0;
                    double discount = priceWithoutDiscount * 0.15;
                    finalPayment = priceWithoutDiscount - discount;
                }
                else if (days > 15)
                {
                    double priceWithoutDiscount = nightsStayed * 35.0;
                    double discount = priceWithoutDiscount * 0.20;
                    finalPayment = priceWithoutDiscount - discount;
                }
            }

            //calculates tip!
            if (raiting == "positive")
            {
                double tip = finalPayment * 0.25;
                finalPayment = finalPayment + tip;
            }
            else if (raiting == "negative")
            {
                double tip = finalPayment * 0.10;
                finalPayment = finalPayment - tip;
            }
            Console.WriteLine($"{finalPayment:F2}");

        }
    }
}
