using System;

namespace _02.BikeRace
{
    class Program
    {
        static void Main(string[] args)
        {
            int juniorBikers = int.Parse(Console.ReadLine());
            int seniorsBikers = int.Parse(Console.ReadLine());
            string typeTrail = Console.ReadLine();
            int group = juniorBikers + seniorsBikers;
            double priceJuniors = 0;
            double priceSeniors = 0;

            if (typeTrail=="trail")
            {
                priceJuniors = 5.50;
                priceSeniors = 7;
            }
            else if (typeTrail =="cross-country")
            {
                priceJuniors = 8;
                priceSeniors = 9.50;
                if (group>=50)
                {
                    priceJuniors = priceJuniors * 0.75;
                    priceSeniors = priceSeniors * 0.75;
                }
            }
            else if (typeTrail=="downhill")
            {
                priceJuniors = 12.25;
                priceSeniors = 13.75;
            }
            else
            {
                priceJuniors = 20;
                priceSeniors = 21.50;
            }
            double totalPrice = (priceJuniors * juniorBikers) + (priceSeniors * seniorsBikers);
            double costs = totalPrice * 0.05; 
            Console.WriteLine($"{totalPrice-costs:F2}");

        }
    }
}
