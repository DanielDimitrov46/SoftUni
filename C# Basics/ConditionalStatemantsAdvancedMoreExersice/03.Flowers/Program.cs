using System;

namespace _03.Flowers
{
    class Program
    {
        static void Main(string[] args)
        {
            int numberOfSoldHrizantemi = int.Parse(Console.ReadLine());
            int numberOfSoldRoses = int.Parse(Console.ReadLine());
            int numberOfSoldLaleta = int.Parse(Console.ReadLine());
            string seasonType = Console.ReadLine();
            string dayType = Console.ReadLine();
            int totalFlowers = numberOfSoldHrizantemi + numberOfSoldLaleta + numberOfSoldRoses;
            double priceHrizantemi = 0;
            double priceRoses = 0;
            double priceLaleta = 0;


            if (seasonType == "Spring" || seasonType == "Summer")
            {
                priceHrizantemi = 2.00;
                priceRoses = 4.10;
                priceLaleta = 2.50;
                if (dayType == "Y")
                {
                    priceHrizantemi += priceHrizantemi * 0.15;
                    priceRoses += priceRoses * 0.15;
                    priceLaleta += priceLaleta * 0.15;
                }
                else
                {
                    priceHrizantemi = 2.00;
                    priceRoses = 4.10;
                    priceLaleta = 2.50;
                }
                double totalPrice = priceHrizantemi * numberOfSoldHrizantemi + priceRoses * numberOfSoldRoses + priceLaleta * numberOfSoldLaleta;
                if (numberOfSoldLaleta > 7 && seasonType == "Spring")
                {
                    totalPrice = totalPrice * 0.95;
                }
                if (totalFlowers >=20)
                {
                    totalPrice = totalPrice * 0.80;
                }
                totalPrice += 2;
                Console.WriteLine($"{totalPrice:F2}");
            }
            else if (seasonType == "Autumn" || seasonType == "Winter")
            {
                priceHrizantemi = 3.75;
                priceRoses = 4.50;
                priceLaleta = 4.15;
                if (dayType == "Y")
                {
                    priceHrizantemi += priceHrizantemi * 0.15;
                    priceRoses += priceRoses * 0.15;
                    priceLaleta += priceLaleta * 0.15;
                }
                else
                {
                    priceHrizantemi = 3.75;
                    priceRoses = 4.50;
                    priceLaleta = 4.15;
                }
                double totalPrice = priceHrizantemi * numberOfSoldHrizantemi + priceRoses * numberOfSoldRoses + priceLaleta * numberOfSoldLaleta;
                if (numberOfSoldRoses >= 10 && seasonType == "Winter")
                {
                    totalPrice = totalPrice * 0.90;
                }
                if (totalFlowers >= 20)
                {
                    totalPrice = totalPrice * 0.80;
                }
                totalPrice += 2;
                Console.WriteLine($"{totalPrice:F2}");
            }
        }
    }
}
