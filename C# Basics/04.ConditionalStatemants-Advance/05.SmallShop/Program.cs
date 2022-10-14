using System;

namespace _05.SmallShop
{
    class Program
    {
        static void Main(string[] args)
        {
            string product = Console.ReadLine();
            string city = Console.ReadLine();
            double quantity = double.Parse(Console.ReadLine());

            double productPrice = 0;
            if (city== "Sofia")
            {
                if (product=="coffee")
                {
                    productPrice = 0.50;
                }
                else if (product=="water")
                {
                    productPrice = 0.80;
                }
                else if (product=="beer")
                {
                    productPrice = 1.20;
                }
                else if (product=="sweets")
                {
                    productPrice = 1.45;
                }
                else if (product=="peanuts")
                {
                    productPrice = 1.60;
                }
            }
            else if (city=="Plovdiv")
            {
                if (product == "coffee")
                {
                    productPrice = 0.40;
                }
                else if (product == "water")
                {
                    productPrice = 0.70;
                }
                else if (product == "beer")
                {
                    productPrice = 1.15;
                }
                else if (product == "sweets")
                {
                    productPrice = 1.30;
                }
                else if (product == "peanuts")
                {
                    productPrice = 1.50;
                }
            }
            else if (city=="Varna")
            {
                if (product == "coffee")
                {
                    productPrice =  0.45;
                }
                else if (product == "water")
                {
                    productPrice = 0.70;
                }
                else if (product == "beer")
                {
                    productPrice = 1.10;
                }
                else if (product == "sweets")
                {
                    productPrice = 1.35;
                }
                else if (product == "peanuts")
                {
                    productPrice = 1.55;
                }
            }
            else
            {
                Console.WriteLine("Invalid city");
            }
            Console.WriteLine(quantity*productPrice);
            
        }
    }
}
