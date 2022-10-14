
using System;

namespace _07.SchoolCamp
{
    class Program
    {
        static void Main(string[] args)
        {
            string season = Console.ReadLine();
            string typeGroup = Console.ReadLine();
            int children = int.Parse(Console.ReadLine());
            int nights = int.Parse(Console.ReadLine());
            
            double pricePerNight = 0;
            string sport = "";

            if (season=="Winter")
            {
                if (typeGroup== "boys"||typeGroup=="girls")
                {
                    pricePerNight = 9.60;
                }
                else
                {
                    pricePerNight = 10;
                }
                if (typeGroup=="girls")
                {
                    sport = "Gymnastics";
                }
                else if (typeGroup=="boys")
                {
                    sport = "Judo";
                }
                else
                {
                    sport = "Ski";
                }
            }
            else if (season=="Spring")
            {
                if (typeGroup == "boys" || typeGroup == "girls")
                {
                    pricePerNight = 7.20;
                }
                else
                {
                    pricePerNight = 9.50;
                }
                if (typeGroup == "girls")
                {
                    sport = "Athletics";
                }
                else if (typeGroup=="boys")
                {
                    sport = "Tennis";
                }
                else
                {
                    sport = "Cycling";
                }
            }
            else
            {
                if (typeGroup == "boys" || typeGroup == "girls")
                {
                    pricePerNight = 15;
                }
                else
                {
                    pricePerNight = 20;
                }
                if (typeGroup=="girls")
                {
                    sport = "Volleyball";
                }
                else if (typeGroup=="boys")
                {
                    sport = "Football";
                }
                else
                {
                    sport = "Swimming";
                }
            }
            double totalPrice = (pricePerNight * nights)*children;

            if (children>=50)
            {
                totalPrice = totalPrice * 0.50;
            }
            else if (children>=20&&children<50)
            {
                totalPrice = totalPrice * 0.85;
            }
            else if (children>=10&&children<20)
            {
                totalPrice = totalPrice * 0.95;
            }
            Console.WriteLine($"{sport} {totalPrice:F2} lv.");
        }
    }
}
